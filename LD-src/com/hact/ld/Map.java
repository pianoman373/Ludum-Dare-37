package com.hact.ld;

import static com.team.engine.Globals.vec3;

import com.team.engine.Engine;

public class Map {
	static Tile[][] objects = new Tile[Main.GRID_SIZE][Main.GRID_SIZE];
	static boolean[][] up = new boolean[Main.GRID_SIZE][Main.GRID_SIZE];
	
	static void init(){
		for (int x = 0; x < Main.GRID_SIZE; x++) {
			for (int y = 0; y < Main.GRID_SIZE; y++) {
				up[x][y] = false;
				objects[x][y] = new Tile(vec3(x, 0, y));
				Engine.scene.add(objects[x][y]);
			}
		}
	}
	static void moveUp(int x,int y){
		if(!up[x][y]){
			//TODO make smooth
			objects[x][y].setPosition(vec3(x, 1, y));
		}
	}
	
	static void moveDown(int x,int y){
		if(up[x][y]){
			//TODO make smooth
			objects[x][y].setPosition(vec3(x, 0, y));
		}
	}
}
