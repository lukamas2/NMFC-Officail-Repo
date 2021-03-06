package mod.goony.client.model;

import org.lwjgl.opengl.GL11;

import mod.goony.entity.EntityPuma;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * Cougar - Oceanssss
 * Created using Tabula 5.1.0
 */
public class ModelPuma extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer Neck;
    public ModelRenderer LeftFrontThigh;
    public ModelRenderer FrontRightThigh;
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer Mouth;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer SnoutSlope;
    public ModelRenderer Baby;
    public ModelRenderer shape45;
    public ModelRenderer shape43;
    public ModelRenderer LeftFrontLeg;
    public ModelRenderer LeftFrontHoof;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer FrontRightHoof;
    public ModelRenderer Tail1;
    public ModelRenderer RightBackThigh;
    public ModelRenderer LeftThigh;
    public ModelRenderer Belly;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer RightBackLeg;
    public ModelRenderer RightAnkle;
    public ModelRenderer RightBackPaw;
    public ModelRenderer LeftLeg;
    public ModelRenderer LeftAnkle;
    public ModelRenderer LeftBackPaw;

    public ModelRenderer BabyMainBody;
    public ModelRenderer BabyNeck;
    public ModelRenderer BabyLeftFrontThigh;
    public ModelRenderer BabyFrontRightThigh;
    public ModelRenderer BabyBody;
    public ModelRenderer BabyHead;
    public ModelRenderer BabySnout;
    public ModelRenderer BabyMouth;
    public ModelRenderer BabyLeftEar;
    public ModelRenderer BabyRightEar;
    public ModelRenderer BabySnoutSlope;
    public ModelRenderer Babyshape43;
    public ModelRenderer Babyshape45;
    public ModelRenderer BabyLeftFrontLeg;
    public ModelRenderer BabyLeftFrontHoof;
    public ModelRenderer BabyFrontRightLeg;
    public ModelRenderer BabyFrontRightHoof;
    public ModelRenderer BabyTail1;
    public ModelRenderer BabyRightBackThigh;
    public ModelRenderer BabyLeftThigh;
    public ModelRenderer BabyBelly;
    public ModelRenderer BabyTail2;
    public ModelRenderer BabyTail3;
    public ModelRenderer BabyRightBackLeg;
    public ModelRenderer BabyRightAnkle;
    public ModelRenderer BabyRightBackPaw;
    public ModelRenderer BabyLeftLeg;
    public ModelRenderer BabyLeftAnkle;
    public ModelRenderer BabyLeftBackPaw;
    
	private int state;
     
    
    public ModelPuma() {
        this.textureWidth = 150;
        this.textureHeight = 130;
        this.FrontRightThigh = new ModelRenderer(this, 35, 0);
        this.FrontRightThigh.mirror = true;
        this.FrontRightThigh.setRotationPoint(-0.4F, 7.0F, 0.2F);
        this.FrontRightThigh.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(FrontRightThigh, 0.1759291886010284F, 0.0F, -0.008552113334772215F);
        this.Tail4 = new ModelRenderer(this, 77, 55);
        this.Tail4.setRotationPoint(0.0F, 0.1F, 3.3F);
        this.Tail4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(Tail4, 0.27314402793711257F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 66, 55);
        this.Tail3.setRotationPoint(0.0F, 0.15F, 4.1F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Tail3, 0.36425021489121656F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 49, 55);
        this.Tail2.setRotationPoint(0.0F, 0.05F, 7.5F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(Tail2, 0.136659280431156F, 0.0F, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 59, 0);
        this.FrontRightLeg.mirror = true;
        this.FrontRightLeg.setRotationPoint(0.5F, 4.9F, 1.0F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(FrontRightLeg, -0.2886774582798621F, 0.0F, 0.0F);
        this.LeftFrontThigh = new ModelRenderer(this, 35, 0);
        this.LeftFrontThigh.setRotationPoint(5.4F, 7.0F, 0.2F);
        this.LeftFrontThigh.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LeftFrontThigh, 0.1759291886010284F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 75, 71);
        this.Snout.setRotationPoint(1.0F, 1.6F, 5.8F);
        this.Snout.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.045553093477052F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 19, 31);
        this.LeftEar.setRotationPoint(6.0F, 4.4F, 0.3F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(LeftEar, -0.3518583772020568F, -1.489114917801562F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 50);
        this.Neck.setRotationPoint(1.5F, 4.7F, 5.5F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 5, 9, 7, 0.0F);
        this.setRotateAngle(Neck, -2.231054382824351F, -3.4906585039886593E-4F, 0.0F);
        this.Body = new ModelRenderer(this, 92, 30);
        this.Body.setRotationPoint(0.5F, 0.0F, 9.5F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 7, 10, 11, 0.0F);
        this.LeftAnkle = new ModelRenderer(this, 100, 0);
        this.LeftAnkle.setRotationPoint(0.0F, 4.3F, 0.5F);
        this.LeftAnkle.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LeftAnkle, -0.5918411493512771F, 0.0F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 57, 18);
        this.LeftLeg.setRotationPoint(0.4F, 6.0F, 0.0F);
        this.LeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(LeftLeg, 0.578053048260522F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 74, 89);
        this.Head.setRotationPoint(-0.5F, 5.1F, 4.5F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Head, -0.8777260808279483F, 0.0F, 0.0F);
        this.Belly = new ModelRenderer(this, 0, 0);
        this.Belly.setRotationPoint(0.5F, 10.0F, -0.1F);
        this.Belly.addBox(0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F);
        this.setRotateAngle(Belly, 0.09407324668249435F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 55, 70);
        this.Mouth.setRotationPoint(1.5F, 0.7F, 4.7F);
        this.Mouth.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Mouth, 0.015707963267948967F, 0.0F, 0.0F);
        this.LeftThigh = new ModelRenderer(this, 31, 19);
        this.LeftThigh.setRotationPoint(4.5F, 5.2F, 6.9F);
        this.LeftThigh.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(LeftThigh, -0.16022122533307945F, 0.0F, 0.0F);
        this.MainBody = new ModelRenderer(this, 8, 83);
        this.MainBody.setRotationPoint(-3.5F, 3.6F, -10.3F);
        this.MainBody.addBox(0.0F, 0.0F, 0.0F, 8, 11, 10, 0.0F);
        this.shape45 = new ModelRenderer(this, 11, 24);
        this.shape45.setRotationPoint(-0.4F, -0.3F, 0.6F);
        this.shape45.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.RightBackThigh = new ModelRenderer(this, 31, 19);
        this.RightBackThigh.mirror = true;
        this.RightBackThigh.setRotationPoint(-0.5F, 5.2F, 6.9F);
        this.RightBackThigh.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(RightBackThigh, -0.16022122533307945F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 28, 55);
        this.Tail1.setRotationPoint(2.5F, 0.0F, 10.9F);
        this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(Tail1, -1.0304423903774522F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 30, 31);
        this.RightEar.mirror = true;
        this.RightEar.setRotationPoint(0.1F, 4.4F, 1.3F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(RightEar, -0.3518583772020568F, 1.489114917801562F, 0.0F);
        this.RightAnkle = new ModelRenderer(this, 100, 0);
        this.RightAnkle.mirror = true;
        this.RightAnkle.setRotationPoint(0.0F, 4.3F, 0.5F);
        this.RightAnkle.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RightAnkle, -0.5918411493512771F, 0.0F, 0.0F);
        this.LeftBackPaw = new ModelRenderer(this, 82, 14);
        this.LeftBackPaw.setRotationPoint(0.0F, 3.9F, -1.0F);
        this.LeftBackPaw.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(LeftBackPaw, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape43 = new ModelRenderer(this, 11, 24);
        this.shape43.setRotationPoint(2.4F, -0.3F, 0.6F);
        this.shape43.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.FrontRightHoof = new ModelRenderer(this, 79, 0);
        this.FrontRightHoof.mirror = true;
        this.FrontRightHoof.setRotationPoint(0.0F, 7.1F, -1.0F);
        this.FrontRightHoof.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(FrontRightHoof, 0.12566370614359174F, 0.0F, 0.0F);
        this.RightBackPaw = new ModelRenderer(this, 82, 14);
        this.RightBackPaw.setRotationPoint(0.0F, 3.9F, -1.0F);
        this.RightBackPaw.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(RightBackPaw, 0.18203784098300857F, 0.0F, 0.0F);
        this.RightBackLeg = new ModelRenderer(this, 57, 18);
        this.RightBackLeg.mirror = true;
        this.RightBackLeg.setRotationPoint(0.4F, 6.0F, 0.0F);
        this.RightBackLeg.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(RightBackLeg, 0.578053048260522F, 0.0F, 0.0F);
        this.SnoutSlope = new ModelRenderer(this, 0, 15);
        this.SnoutSlope.setRotationPoint(0.5F, 2.85F, -1.4F);
        this.SnoutSlope.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(SnoutSlope, 0.6724753607934152F, 0.0F, 0.0F);
        this.LeftFrontLeg = new ModelRenderer(this, 59, 0);
        this.LeftFrontLeg.setRotationPoint(0.5F, 4.9F, 1.0F);
        this.LeftFrontLeg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(LeftFrontLeg, -0.2886774582798621F, 0.0F, 0.0F);
        this.LeftFrontHoof = new ModelRenderer(this, 79, 0);
        this.LeftFrontHoof.setRotationPoint(0.0F, 7.1F, -1.0F);
        this.LeftFrontHoof.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(LeftFrontHoof, 0.12566370614359174F, 0.0F, 0.0F);
        this.MainBody.addChild(this.FrontRightThigh);
        this.Tail3.addChild(this.Tail4);
        this.Tail2.addChild(this.Tail3);
        this.Tail1.addChild(this.Tail2);
        this.FrontRightThigh.addChild(this.FrontRightLeg);
        this.MainBody.addChild(this.LeftFrontThigh);
        this.Head.addChild(this.Snout);
        this.Head.addChild(this.LeftEar);
        this.MainBody.addChild(this.Neck);
        this.MainBody.addChild(this.Body);
        this.LeftLeg.addChild(this.LeftAnkle);
        this.LeftThigh.addChild(this.LeftLeg);
        this.Neck.addChild(this.Head);
        this.Body.addChild(this.Belly);
        this.Head.addChild(this.Mouth);
        this.Body.addChild(this.LeftThigh);
        this.SnoutSlope.addChild(this.shape45);
        this.Body.addChild(this.RightBackThigh);
        this.Body.addChild(this.Tail1);
        this.Head.addChild(this.RightEar);
        this.RightBackLeg.addChild(this.RightAnkle);
        this.LeftAnkle.addChild(this.LeftBackPaw);
        this.SnoutSlope.addChild(this.shape43);
        this.FrontRightLeg.addChild(this.FrontRightHoof);
        this.RightAnkle.addChild(this.RightBackPaw);
        this.RightBackThigh.addChild(this.RightBackLeg);
        this.Snout.addChild(this.SnoutSlope);
        this.LeftFrontThigh.addChild(this.LeftFrontLeg);
        this.LeftFrontLeg.addChild(this.LeftFrontHoof);
        
        
        //baby 
        this.BabyBody = new ModelRenderer(this, 92, 30);
        this.BabyBody.setRotationPoint(0.5F, 0.0F, 9.5F);
        this.BabyBody.addBox(0.0F, 0.0F, 0.0F, 7, 10, 10, 0.0F);
        this.BabyFrontRightLeg = new ModelRenderer(this, 59, 0);
        this.BabyFrontRightLeg.mirror = true;
        this.BabyFrontRightLeg.setRotationPoint(0.5F, 4.9F, 1.0F);
        this.BabyFrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(BabyFrontRightLeg, -0.2886774582798621F, 0.0F, 0.0F);
        this.BabyLeftEar = new ModelRenderer(this, 19, 31);
        this.BabyLeftEar.setRotationPoint(6.0F, 4.4F, 0.3F);
        this.BabyLeftEar.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(BabyLeftEar, -0.3518583772020568F, -1.489114917801562F, 0.0F);
        this.BabySnoutSlope = new ModelRenderer(this, 0, 15);
        this.BabySnoutSlope.setRotationPoint(0.5F, 2.8F, -1.5F);
        this.BabySnoutSlope.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(BabySnoutSlope, 0.7990117315630041F, 0.0F, 0.0F);
        this.BabyRightAnkle = new ModelRenderer(this, 100, 0);
        this.BabyRightAnkle.mirror = true;
        this.BabyRightAnkle.setRotationPoint(0.0F, 4.3F, 0.5F);
        this.BabyRightAnkle.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(BabyRightAnkle, -0.5918411493512771F, 0.0F, 0.0F);
        this.BabyMainBody = new ModelRenderer(this, 8, 83);
        this.BabyMainBody.setRotationPoint(-3.5F, 5.8F, -10.3F);
        this.BabyMainBody.addBox(0.0F, 0.0F, 0.0F, 8, 11, 10, 0.0F);
        this.BabySnout = new ModelRenderer(this, 75, 71);
        this.BabySnout.setRotationPoint(1.0F, 1.6F, 5.8F);
        this.BabySnout.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(BabySnout, 0.045553093477052F, 0.0F, 0.0F);
        this.BabyRightEar = new ModelRenderer(this, 30, 31);
        this.BabyRightEar.mirror = true;
        this.BabyRightEar.setRotationPoint(0.1F, 4.5F, 1.3F);
        this.BabyRightEar.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(BabyRightEar, -0.3518583772020568F, 1.489114917801562F, 0.0F);
        this.BabyTail1 = new ModelRenderer(this, 28, 55);
        this.BabyTail1.setRotationPoint(2.0F, 0.0F, 9.8F);
        this.BabyTail1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(BabyTail1, -0.7740535232594852F, 0.0F, 0.0F);
        this.BabyLeftFrontThigh = new ModelRenderer(this, 35, 0);
        this.BabyLeftFrontThigh.setRotationPoint(5.4F, 6.0F, 0.2F);
        this.BabyLeftFrontThigh.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(BabyLeftFrontThigh, 0.1759291886010284F, 0.0F, 0.0F);
        this.BabyLeftBackPaw = new ModelRenderer(this, 82, 14);
        this.BabyLeftBackPaw.setRotationPoint(0.0F, 3.9F, -1.0F);
        this.BabyLeftBackPaw.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(BabyLeftBackPaw, 0.18203784098300857F, 0.0F, 0.0F);
        this.BabyLeftLeg = new ModelRenderer(this, 57, 18);
        this.BabyLeftLeg.setRotationPoint(0.4F, 4.8F, 0.0F);
        this.BabyLeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(BabyLeftLeg, 0.578053048260522F, 0.0F, 0.0F);
        this.Babyshape45 = new ModelRenderer(this, 11, 24);
        this.Babyshape45.setRotationPoint(-0.4F, 0.5F, 0.8F);
        this.Babyshape45.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.BabyNeck = new ModelRenderer(this, 0, 50);
        this.BabyNeck.setRotationPoint(1.5F, 4.7F, 5.5F);
        this.BabyNeck.addBox(0.0F, 0.0F, 0.0F, 5, 8, 7, 0.0F);
        this.setRotateAngle(BabyNeck, -2.231054382824351F, -3.4906585039886593E-4F, 0.0F);
        this.Babyshape43 = new ModelRenderer(this, 11, 24);
        this.Babyshape43.setRotationPoint(2.4F, 0.5F, 0.8F);
        this.Babyshape43.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.BabyRightBackLeg = new ModelRenderer(this, 57, 18);
        this.BabyRightBackLeg.mirror = true;
        this.BabyRightBackLeg.setRotationPoint(0.4F, 4.8F, 0.0F);
        this.BabyRightBackLeg.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(BabyRightBackLeg, 0.578053048260522F, 0.0F, 0.0F);
        this.BabyLeftFrontLeg = new ModelRenderer(this, 59, 0);
        this.BabyLeftFrontLeg.setRotationPoint(0.5F, 4.9F, 1.0F);
        this.BabyLeftFrontLeg.addBox(0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(BabyLeftFrontLeg, -0.2886774582798621F, 0.0F, 0.0F);
        this.BabyBelly = new ModelRenderer(this, 0, 0);
        this.BabyBelly.setRotationPoint(0.5F, 10.0F, -0.1F);
        this.BabyBelly.addBox(0.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
        this.setRotateAngle(BabyBelly, 0.09407324668249435F, 0.0F, 0.0F);
        this.BabyTail2 = new ModelRenderer(this, 49, 55);
        this.BabyTail2.setRotationPoint(0.5F, 0.05F, 7.2F);
        this.BabyTail2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(BabyTail2, 0.27314402793711257F, 0.0F, 0.0F);
        this.BabyLeftThigh = new ModelRenderer(this, 31, 19);
        this.BabyLeftThigh.setRotationPoint(4.5F, 4.0F, 5.6F);
        this.BabyLeftThigh.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(BabyLeftThigh, -0.16022122533307945F, 0.0F, 0.0F);
        this.BabyTail3 = new ModelRenderer(this, 66, 55);
        this.BabyTail3.setRotationPoint(0.0F, 0.15F, 4.0F);
        this.BabyTail3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(BabyTail3, 0.31398473243377983F, 0.0F, 0.0F);
        this.BabyMouth = new ModelRenderer(this, 55, 70);
        this.BabyMouth.setRotationPoint(1.5F, 0.7F, 4.7F);
        this.BabyMouth.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(BabyMouth, 0.015707963267948967F, 0.0F, 0.0F);
        this.BabyLeftFrontHoof = new ModelRenderer(this, 79, 0);
        this.BabyLeftFrontHoof.setRotationPoint(0.0F, 5.9F, -1.0F);
        this.BabyLeftFrontHoof.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(BabyLeftFrontHoof, 0.12566370614359174F, 0.0F, 0.0F);
        this.BabyHead = new ModelRenderer(this, 74, 89);
        this.BabyHead.setRotationPoint(-0.5F, 4.2F, 4.7F);
        this.BabyHead.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(BabyHead, -0.92365578415349F, 0.0F, 0.0F);
        this.BabyLeftAnkle = new ModelRenderer(this, 100, 0);
        this.BabyLeftAnkle.setRotationPoint(0.0F, 4.3F, 0.5F);
        this.BabyLeftAnkle.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(BabyLeftAnkle, -0.5918411493512771F, 0.0F, 0.0F);
        this.BabyFrontRightHoof = new ModelRenderer(this, 79, 0);
        this.BabyFrontRightHoof.mirror = true;
        this.BabyFrontRightHoof.setRotationPoint(0.0F, 5.9F, -1.0F);
        this.BabyFrontRightHoof.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(BabyFrontRightHoof, 0.12566370614359174F, 0.0F, 0.0F);
        this.BabyRightBackThigh = new ModelRenderer(this, 31, 19);
        this.BabyRightBackThigh.mirror = true;
        this.BabyRightBackThigh.setRotationPoint(-0.5F, 4.0F, 5.6F);
        this.BabyRightBackThigh.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(BabyRightBackThigh, -0.16022122533307945F, 0.0F, 0.0F);
        this.BabyFrontRightThigh = new ModelRenderer(this, 35, 0);
        this.BabyFrontRightThigh.mirror = true;
        this.BabyFrontRightThigh.setRotationPoint(-0.4F, 6.0F, 0.2F);
        this.BabyFrontRightThigh.addBox(0.0F, 0.0F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(BabyFrontRightThigh, 0.1759291886010284F, 0.0F, -0.008552113334772215F);
        this.BabyRightBackPaw = new ModelRenderer(this, 82, 14);
        this.BabyRightBackPaw.setRotationPoint(0.0F, 3.9F, -1.0F);
        this.BabyRightBackPaw.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(BabyRightBackPaw, 0.18203784098300857F, 0.0F, 0.0F);
        this.BabyMainBody.addChild(this.BabyBody);
        this.BabyFrontRightThigh.addChild(this.BabyFrontRightLeg);
        this.BabyHead.addChild(this.BabyLeftEar);
        this.BabySnout.addChild(this.BabySnoutSlope);
        this.BabyRightBackLeg.addChild(this.BabyRightAnkle);
        this.BabyHead.addChild(this.BabySnout);
        this.BabyHead.addChild(this.BabyRightEar);
        this.BabyBody.addChild(this.BabyTail1);
        this.BabyMainBody.addChild(this.BabyLeftFrontThigh);
        this.BabyLeftAnkle.addChild(this.BabyLeftBackPaw);
        this.BabyLeftThigh.addChild(this.BabyLeftLeg);
        this.BabySnoutSlope.addChild(this.Babyshape45);
        this.BabyMainBody.addChild(this.BabyNeck);
        this.BabySnoutSlope.addChild(this.Babyshape43);
        this.BabyRightBackThigh.addChild(this.BabyRightBackLeg);
        this.BabyLeftFrontThigh.addChild(this.BabyLeftFrontLeg);
        this.BabyBody.addChild(this.BabyBelly);
        this.BabyTail1.addChild(this.BabyTail2);
        this.BabyBody.addChild(this.BabyLeftThigh);
        this.BabyTail2.addChild(this.BabyTail3);
        this.BabyHead.addChild(this.BabyMouth);
        this.BabyLeftFrontLeg.addChild(this.BabyLeftFrontHoof);
        this.BabyNeck.addChild(this.BabyHead);
        this.BabyLeftLeg.addChild(this.BabyLeftAnkle);
        this.BabyFrontRightLeg.addChild(this.BabyFrontRightHoof);
        this.BabyBody.addChild(this.BabyRightBackThigh);
        this.BabyMainBody.addChild(this.BabyFrontRightThigh);
        this.BabyRightAnkle.addChild(this.BabyRightBackPaw);
        
        }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        {
            if (this.isChild)
            {
                float scaleFactor = 0.3F;
                GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
                GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
                GL11.glPushMatrix();
                GL11.glPopMatrix();
            	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            	this.BabyMainBody.render(f5);
            }
        else
        {
            float scaleFactor = 0.8F;
            GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
            GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
            GL11.glPushMatrix();
            GL11.glPopMatrix();
        	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            this.MainBody.render(f5);        }
        }
        }
    

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    float f6 = (180F / (float)Math.PI);
    this.FrontRightThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.LeftFrontThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.RightBackThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.LeftThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
   
    this.BabyFrontRightThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.BabyLeftFrontThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.BabyRightBackThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.BabyLeftThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
    
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime)
    {
    EntityPuma entityocelot = (EntityPuma) entitylivingbaseIn;
    {

    if (entityocelot.isSneaking())
    {
        this.Neck.setRotationPoint(1.5F, 0.1F, 1.5F);
        this.setRotateAngle(Neck, -1.2747884856566583F, -3.4906585039886593E-4F, 0.0F);
        this.Tail1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.Head.setRotationPoint(-0.5F, 7.1F, 5.9F);
        this.setRotateAngle(Head, -1.5025539530419183F, 0.0F, 0.0F);
        this.Tail1.setRotationPoint(2.5F, 0.0F, 10.9F);
        this.setRotateAngle(Tail1, -1.1383037381507017F, 0.0F, 0.0F);
        this.Mouth.setRotationPoint(1.5F, 0.7F, 4.7F);
        this.setRotateAngle(Mouth, 0.22759093446006054F, 0.0F, 0.0F);
        this.state = 0;
    }
    else if (entityocelot.isSprinting())
    {
        this.state = 2;
        this.Neck.setRotationPoint(1.5F, 4.7F, 5.5F);
        this.setRotateAngle(Neck, -2.231054382824351F, -3.4906585039886593E-4F, 0.0F);
        this.Head.setRotationPoint(-0.5F, 5.1F, 4.5F);
        this.setRotateAngle(Head, -0.8777260808279483F, 0.0F, 0.0F);
        this.Tail1.setRotationPoint(2.5F, 0.0F, 10.9F);
        this.setRotateAngle(Tail1, -0.4553564018453205F, 0.0F, 0.0F);
        this.Mouth.setRotationPoint(1.5F, 0.7F, 4.7F);
        this.setRotateAngle(Mouth, 0.7740535232594852F, 0.0F, 0.0F);
    }
      else
      {
        this.Neck.setRotationPoint(1.5F, 4.7F, 5.5F);
        this.setRotateAngle(Neck, -2.231054382824351F, -3.4906585039886593E-4F, 0.0F);
        this.Head.setRotationPoint(-0.5F, 5.1F, 4.5F);
        this.setRotateAngle(Head, -0.8777260808279483F, 0.0F, 0.0F);
        this.Mouth.setRotationPoint(1.5F, 0.7F, 4.7F);
        this.setRotateAngle(Mouth, 0.22759093446006054F, 0.0F, 0.0F);
        }
    }
}
}


  