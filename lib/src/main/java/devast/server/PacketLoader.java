package devast.server;

import devast.server.accept.AcceptPackets.FirstMessagePacket;

public class PacketLoader {
	
	public static FirstMessagePacket firstMessagePacket;
	
	public static void load() {
		firstMessagePacket = new FirstMessagePacket();
		System.out.println("The packets have been loaded.");
	}
}
