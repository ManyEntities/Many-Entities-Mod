package com.FP115.ManyEntities.server.network;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.client.renders.FireMagicBarRenderer;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class MessageFireMagicBar implements IMessage{
	private float value;
	private boolean regen;
	
	public MessageFireMagicBar(){}
	
	public MessageFireMagicBar(float barValue, boolean regen){
		this.value = barValue;
		this.regen = regen;
	}
	
	@Override
    public void toBytes(ByteBuf buf) {
        buf.writeFloat(value);
        buf.writeBoolean(regen);
    }

	@Override
	public void fromBytes(ByteBuf buf) {
		value = buf.readFloat();
		regen = buf.readBoolean();
	}
	
	public static class Handler implements IMessageHandler<MessageFireMagicBar, IMessage>{

		@Override
		public IMessage onMessage(MessageFireMagicBar msg, MessageContext ctx) {
			FireMagicBarRenderer.value = msg.value;
			FireMagicBarRenderer.regen = msg.regen;
			ManyEntitiesBase.proxy.updateFireMagicBar(msg.value);
			return null;
		}
		
	}
}
