package com.team.engine.gameobject;

import static com.team.engine.Globals.*;

import com.team.engine.Camera;
import com.team.engine.Scene;
import com.team.engine.rendering.Material;
import com.team.engine.rendering.Mesh;
import com.team.engine.rendering.Shader;
import com.team.engine.vecmath.Vec3;
import com.team.engine.vecmath.Vec4;

/**
 * MeshObject is a quick and easy to use implementation of GameObject. It handles simple physics and mesh rendering.
 * 
 * Your desired 3D game object should probably extend this instead of GameObject if you don't plan
 * on doing all the manual rendering and physics yourself.
 * 
 * If you create a class that extends MeshObject and implements the same functions such as init and render,
 * you must call super.functionName() at the beginning of that function, otherwise this class can't do it's job.
 */
public class MeshObject implements GameObject {
	private Mesh mesh;
	private Material material;
	private float scale;
	
	public Vec3 position;
	public Vec4 rotation;

	
	public Vec3 getPosition() {
		return position;
	}

	public void setPosition(Vec3 position) {
		this.position = position;
	}

	public Vec4 getRotation() {
		return rotation;
	}

	public void setRotation(Vec4 rotation) {
		this.rotation = rotation;
	}

	
	/**
	 * Create a MeshObject, you still have to add it to a scene using Engine.scene.add(thisObject) for it to work.
	 * 
	 * Position and rotation are simple to use, bounds uses a CollisionShape from bullet. A common collision shape is BoxShape. 
	 * See com.bulletphysics.collision.shapes for a full list of CollisionShapes.
	 * CollisionShape may also be null for the object to act in a noClip sort of way.
	 * 
	 * mass can be set to 0 for it to be an immovable object such as the ground.
	 * 
	 * The mesh parameter is simply the mesh it will render from it's current position and scale it according to the parameter.
	 * 
	 * Material is just the set of textures, and colors to use during rendering.
	 * 
	 * This object is hardcoded to use the standard shader. If you need to use a custom shader you will have to render manually or make
	 * your own game object.
	 */
	public MeshObject(Vec3 pos, Vec4 rotation, Mesh mesh, float scale, Material material) {
		this.mesh = mesh;
		this.material = material;
		this.scale = scale;
		
		this.position = pos;
		this.rotation = rotation;
	}
	
	@Override
	public void init(Scene scene) {
		
	}
	
	@Override
	public void update() {
		
	}
	
	
	
	@Override
	public void render(Scene scene, Camera cam) {
		Shader s = getShader("pbr");
		s.bind();
		
		s.uniformMaterial(this.material);
		
		s.uniformMat4("model", mat4().translate(position).rotate(rotation).scale(this.scale));
		mesh.draw();
	}

	@Override
	public void renderShadow(Shader s) {
		s.uniformMat4("model", mat4().translate(position).rotate(rotation).scale(this.scale));
		mesh.draw();
	}
}