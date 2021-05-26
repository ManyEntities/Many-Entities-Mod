package com.FP115.ManyEntities.server.Mobs.PigmanTrader;

import com.FP115.ManyEntities.server.Mobs.Abstract.AbstractGuiTrader;
import com.FP115.ManyEntities.server.Mobs.Abstract.AbstractTraderContainer;

import net.minecraft.entity.IMerchant;
import net.minecraft.util.StatCollector;

public class PigmanTraderGui extends AbstractGuiTrader{

	public PigmanTraderGui(AbstractTraderContainer container, IMerchant mer) {
		super(container, mer, "pigmantrader");
	}
	@Override
	protected void drawGuiContainerForegroundLayer(int var1, int var2) {
		this.fontRendererObj.drawString(name, 56, 6, 0xFFED00);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 0xFFED00);
	}

}
