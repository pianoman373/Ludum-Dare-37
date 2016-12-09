package com.team.engine;

import com.team.engine.rendering.Shader;

/**
 * AbstractGame is the interface used to hook to the Engine's events.
 * This can be considered as class every main game class should extend.
 */
public abstract class AbstractGame {
	/**
	 * Called one time only when the game is first loaded.
	 */
	public void init() {}
	
	/**
	 * Called every update and should be used for non-rendering functions.
	 */
	public void update() {}
	
	/**
	 * Use this if you need something updated after everything else
	 */
	public void postUpdate() {}

	/**
	 * Called every time the frame updates.
	 */
	public void render() {}

	/**
	 * Called when the game is closed.
	 */
	public void kill() {}
	
	/**
	 * Called before render() to render the entire scene from the light's perpsective.
	 * Geometry rendered should only use the given shader and not their own. The only
	 * necessary uniform will only need to be model.
	 */
	public void renderShadow(Shader s) {}

	/**
	 * Add any uniforms you want to the currently bound framebuffer shader before rendering.
	 */
	public void postRenderUniforms(Shader shader) {}
}
