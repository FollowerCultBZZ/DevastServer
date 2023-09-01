package devast.server.accept;

import org.java_websocket.WebSocket;
import org.json.JSONArray;

import devast.world.World;

public class AcceptPackets {
	public static class FirstMessagePacket implements AcceptPacket {
		@Override
		public void read(WebSocket socket, JSONArray message) {
			
			String name = (String) message.get(5);
			
			World.createPlayer(socket, name);
		}
	}
}
