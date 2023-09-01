package devast;

import com.badlogic.gdx.ApplicationListener;

import devast.utils.Loader;

public class ServerListener implements ApplicationListener {

	@Override
	public void create() {
		Loader.load();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {		
	}

	@Override
	public void dispose() {
	}
}
