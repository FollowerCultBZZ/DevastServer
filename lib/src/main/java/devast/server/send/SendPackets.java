package devast.server.send;

import java.nio.ByteBuffer;

import devast.server.send.SendPacket.ImportantPacket;
import devast.server.send.SendPacket.UnImportantPacket;

public class SendPackets {
	
	//Connect packet
	public class Connect implements ImportantPacket {
		public int id;
	}
	
	//Disconnect packet
	public class Disconnect implements UnImportantPacket {
		public int id;
	}
	
	//9
	public class HandshakePacket implements SendPacket {
		
		public int id;

		@Override
		public void write(ByteBuffer buffer) {
		}
		
	}
}
