package com.example.examplemod.render;

import com.example.examplemod.entity.EntityAlpaca;
import com.example.examplemod.model.ModelAlpaca;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAlpaca extends RenderLiving<EntityAlpaca>
{
    private static final ResourceLocation[] LLAMA_TEXTURES = new ResourceLocation[] {new ResourceLocation("de:textures/entity/preyanimal/alpaca1.png"), new ResourceLocation("de:textures/entity/preyanimal/alpaca2.png"), new ResourceLocation("de:textures/entity/preyanimal/alpaca3.png"), new ResourceLocation("de:textures/entity/preyanimal/alpaca4.png")};

    public RenderAlpaca(RenderManager p_i47203_1_, ModelAlpaca modelAlpaca, float f)
    {
        super(p_i47203_1_, new ModelAlpaca(), 0.7F);
       
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityAlpaca entity)
    {
        return LLAMA_TEXTURES[entity.getVariant()];
    }
}