package devast;

import com.badlogic.gdx.backends.headless.HeadlessApplication;

public class Main {
	public static void main(String[] args) {
		new HeadlessApplication(new ServerListener());
	}
}
