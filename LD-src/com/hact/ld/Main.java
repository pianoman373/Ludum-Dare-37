package com.hact.ld;

import com.team.engine.AbstractGame;
import com.team.engine.Engine;
import com.team.engine.Settings;


public class Main extends AbstractGame {
	public static void main(String[] args) {
		Settings.loadConfig();
		Engine.start(true, false, new Main(), null);
	}
	
	public void init() {
		
	}
}
