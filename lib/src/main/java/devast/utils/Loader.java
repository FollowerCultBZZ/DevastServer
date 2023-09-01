package devast.utils;

import devast.core.Core;
import devast.core.Vars;
import devast.server.PacketLoader;
import devast.server.Server;
import devast.world.World;

public class Loader {
	public static void load() {
		Core.world = new World();
		Core.server = new Server(Vars.port);
		PacketLoader.load();
		
		Core.server.start();
	}
}
