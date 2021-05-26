package com.FP115.ManyEntities.server.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;

@SideOnly(Side.CLIENT)
public final class BossStatus {
	public static float healthScale;
	public static int statusBarTime;
	public static int selected;
	public static String bossName;
	public static boolean hasColorModifier;

	public static void setBossStatus(final EntityLiving b, final boolean colour, final int image) {
		BossStatus.healthScale = b.getHealth() / b.getMaxHealth();
		BossStatus.statusBarTime = 100;
		BossStatus.hasColorModifier = colour;
		BossStatus.selected = image;
	}
}
