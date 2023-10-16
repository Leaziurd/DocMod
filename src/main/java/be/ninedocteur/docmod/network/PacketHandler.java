package be.ninedocteur.docmod.network;

import be.ninedocteur.docmod.DocMod;
import be.ninedocteur.docmod.jobs.network.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.ChannelBuilder;
import net.minecraftforge.network.SimpleChannel;

public class PacketHandler {
	
	public static final SimpleChannel INSTANCE = ChannelBuilder.named(new ResourceLocation(DocMod.MOD_ID, "main")).simpleChannel();
	
	public static void registerPackets()
	{
		INSTANCE.messageBuilder(PacketAddXP.class, 0).add();
		INSTANCE.messageBuilder(PacketAskClientUpdate.class, 1).add();
		INSTANCE.messageBuilder(PacketLevelUp.class, 2);
		INSTANCE.messageBuilder(PacketSendRewardsClient.class, 3);
		INSTANCE.messageBuilder(PacketUpdateClientInfos.class, 4);
		INSTANCE.messageBuilder(PacketUpdateClientJob.class, 5);
		INSTANCE.messageBuilder(PacketSendChatMessage.class, 6);
	}
	
	
	public static void sendMessageToClient(ServerPlayer player, Component message)
	{
		//INSTANCE.sendTo(new PacketSendChatMessage(message), player.connection.conn, NetworkDirection.PLAY_TO_CLIENT);
	}

}
