package com.team.engine;

import java.nio.file.Files;

import com.team.engine.Util;
import com.google.gson.Gson;
import com.team.engine.SettingsJson;
import com.team.engine.Globals;

public class Settings {
	public static boolean ENABLE_SHADOWS = false;
	public static int SHADOW_RESOLUTION = 2048;
	public static boolean ENABLE_NORMAL_MAPPING = true;
	public static boolean ENABLE_BLOOM = false;
	
	public static int WINDOW_WIDTH = 1200;
	public static int WINDOW_HEIGHT = 800;
	public static boolean FULLSCREEN = false;
	public static float MAX_FPS = 60;
	/**
	 * Where all resources start at.
	 */
	public static final String RESOURCE_PATH = "resources/";
	
	public static void loadConfig(){
		if(Util.fileExists(RESOURCE_PATH+"config.json")){
			Gson gson = new Gson();
			SettingsJson json = gson.fromJson(Util.readFileString("config.json"), SettingsJson.class);
			ENABLE_SHADOWS = json.ENABLE_SHADOWS;
			SHADOW_RESOLUTION = json.SHADOW_RESOLUTION;
			ENABLE_NORMAL_MAPPING = json.ENABLE_NORMAL_MAPPING;
			ENABLE_BLOOM = json.ENABLE_BLOOM;
			WINDOW_WIDTH = json.WINDOW_WIDTH;
			WINDOW_HEIGHT = json.WINDOW_HEIGHT;
			FULLSCREEN = json.FULLSCREEN;
			MAX_FPS = json.MAX_FPS;
		}else{
			Globals.print("No config found using default settings.");
		}
	}
}

