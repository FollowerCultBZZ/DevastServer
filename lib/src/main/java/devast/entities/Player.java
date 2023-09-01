package devast.entities;

import org.java_websocket.WebSocket;

public class Player extends Entity {
	
	public WebSocket connection;
	
	public int id;
	public String name;
	
	public Player(WebSocket socket) {
		this.connection = socket;
	}
	
}
