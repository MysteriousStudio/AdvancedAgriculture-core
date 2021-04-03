package xyz.icedtech.advagri.networking;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.PlayChannelHandler;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;

public class AdvAgriNetworkChannels {

    public static boolean registerGlobalReceiver(Identifier FirecrackerEntitySpawn, PlayChannelHandler FirecrackerEntitySpawnHandler) {
		return ClientNetworkingImpl.PLAY.registerGlobalReceiver(FirecrackerEntitySpawn, FirecrackerEntitySpawnHandler);
	}
    
}