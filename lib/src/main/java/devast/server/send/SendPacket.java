package devast.server.send;

import java.nio.ByteBuffer;

public interface SendPacket {
	
	void write(ByteBuffer buffer);
	
	interface ImportantPacket{}
	interface UnImportantPacket{}
}
