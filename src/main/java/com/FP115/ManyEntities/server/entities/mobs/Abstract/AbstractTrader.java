package com.FP115.ManyEntities.server.Mobs.Abstract;

import java.util.Iterator;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.entities.abstractEntities.AbstractVillager;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public abstract class  AbstractTrader extends AbstractVillager {
    private int randomTickDivider;
    private Village villageObj;
    private String lastBuyingPlayer;
    private EntityPlayer buyingPlayer;
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    private boolean needsInitilization;
    private int wealth;
    private String buyersName;
    private float buying;

    public AbstractTrader(World world) {
        super(world);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }

    @Override
    public boolean isAIEnabled() {
        return true;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected String getLivingSound() {
        return null;
    }

    @Override
    protected String getDeathSound() {
        return null;
    }

    @Override
    protected String getHurtSound() {
        return null;
    }

    @Override
    public void setProfession(int i) {
        super.setProfession(12345);
    }

    @Override
    protected void updateAITick() {
        if (this.randomTickDivider-- <= 0) {
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);

            if (this.villageObj == null) {
                this.detachHome();
            } else {
                this.villageObj.setDefaultPlayerReputation(30);
            }
        }

        if (this.timeUntilReset > 0) {
            if (this.timeUntilReset <= 0) {
                if (this.buyingList.size() > 1) {
                    Iterator iterator = this.buyingList.iterator();
                    if (needsInitilization) {
                        while (iterator.hasNext()) {
                            MerchantRecipe merchantrecipe = (MerchantRecipe) iterator.next();

                            if (merchantrecipe.isRecipeDisabled()) {
                                merchantrecipe.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                            }
                        }
                    }

                    this.addDefaultEquipmentAndRecipies(75);
                    this.needsInitilization = false;

                    if (this.villageObj != null && this.lastBuyingPlayer != null) {
                        this.villageObj.setReputationForPlayer(this.lastBuyingPlayer, 30);
                    }
                }
                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }
        super.updateAITick();
    }

    @Override
    public boolean interact(EntityPlayer var1) {
        if (!this.worldObj.isRemote) {
            extraInteract(var1);
            var1.openGui(ManyEntitiesBase.instance, guiID(), this.worldObj, getEntityId(), 0, 0);
            return true;
        } else {
            return super.interact(var1);
        }
    }

    public abstract void extraInteract(EntityPlayer p);

    public abstract int guiID();

    public abstract void addRecipies(MerchantRecipeList list);

    @Override
    public void writeEntityToNBT(NBTTagCompound var1) {
        super.writeEntityToNBT(var1);
        var1.setInteger("Profession", 1234);
        var1.setInteger("Riches", this.wealth);

        if (this.buyingList != null) {
            var1.setTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound var1) {
        super.readEntityFromNBT(var1);
        this.setProfession(1234);
        this.wealth = var1.getInteger("Riches");

        if (var1.hasKey("Offers")) {
            NBTTagCompound var2 = var1.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(var2);
        }
    }

    @Override
    public void useRecipe(MerchantRecipe var1) {
        var1.incrementToolUses();

        if (var1.hasSameIDsAs((MerchantRecipe) this.buyingList.get(this.buyingList.size() - 1))) {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null) {
                this.buyersName = this.buyingPlayer.getCommandSenderName();
            } else {
                this.buyersName = null;
            }
        }

        if (var1.getItemToBuy().getItem() == Items.emerald) {
            this.wealth += var1.getItemToBuy().stackSize;
        }
    }

    public void func_110297_a_(ItemStack par1ItemStack) {}

    @Override
    public MerchantRecipeList getRecipes(EntityPlayer var1) {
        if (this.buyingList == null) {
            this.addDefaultEquipmentAndRecipies(75);
        }
        return this.buyingList;
    }

    private void addDefaultEquipmentAndRecipies(int par1) {
        if (this.buyingList != null) {
            this.buying = MathHelper.sqrt_float(this.buyingList.size()) * 0.2F;
        } else {
            this.buying = 0.0F;
        }

        MerchantRecipeList rec = new MerchantRecipeList();

        addRecipies(rec);

        if (this.buyingList == null) {
            this.buyingList = new MerchantRecipeList();
        }

        for (int var3 = 0; var3 < par1 && var3 < rec.size(); ++var3) {
            this.buyingList.add((MerchantRecipe) rec.get(var3));
        }
    }

}
