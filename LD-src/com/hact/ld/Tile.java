package com.hact.ld;

import static com.team.engine.Globals.*;

import com.team.engine.gameobject.MeshObject;
import com.team.engine.rendering.Material;
import com.team.engine.vecmath.Vec3;

public class Tile extends MeshObject {
	public Tile(Vec3 pos) {
		super(pos, vec4(0, 1, 0, 0), Main.tileMesh, 1, new Material(vec3(1, 1, 1), 0.5f, 0));
	}
	
	public void update() {
		this.setPosition(this.getPosition().add(vec3(0, 0.1f, 0)));
	}
}
