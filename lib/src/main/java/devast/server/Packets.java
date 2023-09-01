package devast.server;

import devast.server.Packet.ImportantPacket;
import devast.server.Packet.UnImportantPacket;

public class Packets {
	
	//Connect packet
	public static class Connect implements ImportantPacket {
		public int id;
	}
	
	//Disconnect packet
	public static class Disconnect implements UnImportantPacket {
		public int id;
	}
	
	public static class ConnectPacket {
		public int id;
		public String name;
	}
}
