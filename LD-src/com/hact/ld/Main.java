package com.hact.ld;

import com.team.engine.AbstractGame;
import com.team.engine.Engine;


public class Main extends AbstractGame {
	public static void main(String[] args) {
		Engine.start(true, false, new Main(), null);
	}
	
	public void init() {
		
	}
}
