package codersafterdark.reskillable.skill;

import codersafterdark.reskillable.api.skill.Skill;
import net.minecraft.util.ResourceLocation;

import static codersafterdark.reskillable.lib.LibMisc.MOD_ID;

public class SkillTechnology extends Skill {
    public SkillTechnology() {
        super(new ResourceLocation(MOD_ID, "technology"), new ResourceLocation("textures/blocks/gravel.png"));
    }
}