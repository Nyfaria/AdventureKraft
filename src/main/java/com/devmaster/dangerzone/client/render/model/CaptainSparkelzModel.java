package com.devmaster.dangerzone.client.render.model;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.devmaster.dangerzone.entity.CaptainSparkelz;
import net.minecraft.client.renderer.entity.model.BipedModel;


public class CaptainSparkelzModel<T  extends CaptainSparkelz> extends BipedModel<T> {
	public CaptainSparkelzModel(float modelSize, boolean hasSmallTexture) {
		super(modelSize, 0, 64, hasSmallTexture ? 64 : 32);
	}
}