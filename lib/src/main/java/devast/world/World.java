package devast.world;

import org.java_websocket.WebSocket;

import com.badlogic.gdx.utils.Array;

import devast.entities.Player;

public class World {
	public static Array<Player> players = new Array<>();
	
	public static void createPlayer(WebSocket socket, String name) {
		if(containSocket(socket)) return;
		Player player = new Player(socket);
		player.id = players.size;
		player.name = name;
		players.add(player);
		System.out.println(player.name);
	}
	
	public static boolean containSocket(WebSocket socket) {
		for(Player player : players) if(player.connection == socket) return true;
		return false;
	}
}
