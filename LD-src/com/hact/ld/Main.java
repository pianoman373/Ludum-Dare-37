package com.hact.ld;

import static com.team.engine.Globals.*;

import com.team.engine.AbstractGame;
import com.team.engine.Engine;
import com.team.engine.Settings;
import com.team.engine.rendering.Mesh;
import com.team.engine.rendering.ObjLoader;


public class Main extends AbstractGame {
	public static Mesh tileMesh;
	
	final int GRID_SIZE = 10;
	
	public static void main(String[] args) {
		Settings.loadConfig();
		Engine.start(false, false, new Main(), null);
	}
	
	public void init() {
		tileMesh = ObjLoader.loadFile("tile.obj");
		
		Engine.scene.ambient = vec3(0.3, 0.3, 0.3);
		Engine.scene.skyColor = vec3(0.3, 0.3, 0.3);
		
		//grid
		for (int x = 0; x < GRID_SIZE; x++) {
			for (int y = 0; y < GRID_SIZE; y++) {
				Engine.scene.add(new Tile(vec3(x, 0, y)));
			}
		}
		
		//left wall
		for (int y = 0; y < GRID_SIZE + 2; y++) {
			Engine.scene.add(new Tile(vec3(-1, 1, y - 1)));
		}
		
		//right wall
		for (int y = 0; y < GRID_SIZE + 2; y++) {
			Engine.scene.add(new Tile(vec3(GRID_SIZE, 1, y - 1)));
		}
		
		//top wall
		for (int x = 0; x < GRID_SIZE; x++) {
			Engine.scene.add(new Tile(vec3(x, 1, -1)));
		}
		
		//bottom wall
		for (int x = 0; x < GRID_SIZE; x++) {
			Engine.scene.add(new Tile(vec3(x, 1, GRID_SIZE)));
		}
	}
	
	public void update() {
		//SpaceCameraController.update();
		
		Engine.camera.setPosition(vec3(GRID_SIZE / 2, 20, 0));
		Engine.camera.front = vec3(0, -1, 0.4f);
	}
}
