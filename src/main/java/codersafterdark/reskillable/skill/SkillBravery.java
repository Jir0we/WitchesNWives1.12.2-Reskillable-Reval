package codersafterdark.reskillable.skill;

import codersafterdark.reskillable.api.skill.Skill;
import net.minecraft.util.ResourceLocation;

import static codersafterdark.reskillable.lib.LibMisc.MOD_ID;

public class SkillBravery extends Skill {
    public SkillBravery() {
        super(new ResourceLocation(MOD_ID, "bravery"), new ResourceLocation("textures/blocks/gravel.png"));
    }
}