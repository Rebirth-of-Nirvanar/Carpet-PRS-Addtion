package CarpetPRSAddition;

import carpet.settings.Rule;
import carpet.settings.RuleCategory;
import net.minecraft.entity.passive.FoxEntity;

/**
 * Here is your example Settings class you can plug to use carpetmod /carpet settings command
 */
public class CarpetPRSAdditionSettings
{
    /* 特性 */
    @Rule(
        desc = "Override gamerule doMobGriefing.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingOverride = false;

    @Rule(
        desc = "Allow farmer villager run tasks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingFarmerVillagerShouldRun = true;

    @Rule(
        desc = "Allow whither to create explosion.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingWitherCreateExplosion = true;

    @Rule(
        extra = {
            "Takes effect only if domobgriefing is true."
        },
        desc = "Allow whither to destroy blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingWitherCanDestroy = true;

    @Rule(
        desc = "Allow dragon to destroy blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingEnderDragonDestroyBlocks = true;

    @Rule(
        desc = "Allow dragon to destroy blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingCreeperCreateExplosion = true;

    @Rule(
        desc = "Allow enderman to pickup blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingEnderManPickUpBlock = true;

    @Rule(
        desc = "Allow enderman to place blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingEnderManPlaceBlock = true;

    @Rule(
        desc = "Allow evoker to change the color of the wool.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingEvokerWololo = true;

    @Rule(
        desc = "Allow piglin to pickup items.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingPiglinGather = true;

    @Rule(
        desc = "Allow ravager to break blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingRavagerBreakBlocks = true;

    @Rule(
        desc = "Allow silverfish to infect Stones.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingSilverfishInfectStones = true;

    @Rule(
        desc = "Allow silverfish out of blocks.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingSilverfishOutOfBlocks = true;

    @Rule(
        desc = "Allow fox to eat sweet berries.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingFoxEatSweetBerries = true;

    @Rule(
        desc = "Allow rabbit to eat carrot crop.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingRabbitEatCarrotCrop = true;

    @Rule(
        desc = "Allow snow Golem to spawn snow.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingSnowGolemSpawnSnow = true;

    @Rule(
        desc = "Allow fireball to create explosion.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingFireballCreateExplosion = true;

    @Rule(
        desc = "Allow small fireball to spawn fire.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingSmallFireballSpawnFire = true;

    @Rule(
        desc = "Allow wither skull to create explosion.",
        category =  {"PRS", "mobGriefing", RuleCategory.FEATURE}
    )
    public static boolean mobGriefingWitherSkullCreateExplosion = true;
}
