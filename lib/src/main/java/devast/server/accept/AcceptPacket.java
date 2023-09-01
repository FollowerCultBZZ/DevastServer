package devast.server.accept;

import org.java_websocket.WebSocket;
import org.json.JSONArray;

public interface AcceptPacket {
	public void read(WebSocket socket, JSONArray message);
}
