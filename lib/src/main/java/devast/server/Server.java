package devast.server;

import java.net.InetSocketAddress;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.json.JSONArray;

public class Server extends WebSocketServer {

	public Server(int port) {
		super(new InetSocketAddress(port));
	}
	
	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		JSONArray array = new JSONArray(message);
		
		switch ((Integer)array.get(0)) {
		case 30: PacketLoader.firstMessagePacket.read(conn, array);
		}
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
	}

	@Override
	public void onStart() {
		System.out.println("Server start on port:" + getPort());
	}
}
