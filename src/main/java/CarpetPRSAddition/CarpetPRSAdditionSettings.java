package CarpetPRSAddition;

import carpet.settings.Rule;

/**
 * Here is your example Settings class you can plug to use carpetmod /carpet settings command
 */
public class CarpetPRSAdditionSettings
{
    public static final String ENTITYTICKING = "entityTicking";
    public static final String MOBGRIEFING = "mobGriefing";
    public static final String PRS = "PRS";
    /* 实体运算 */
    @Rule(
        desc = "Disable wither ticking avoid lag. Maybe useful for fake peaceful.",
        category =  {PRS, ENTITYTICKING}
    )
    public static boolean disableWitherTicking = false;

    /* 生物破坏 */
    @Rule(
        desc = "Override gamerule doMobGriefing.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingOverride = false;

    @Rule(
        desc = "Allow farmer villager run tasks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingFarmerVillagerShouldRun = true;

    @Rule(
        desc = "Allow whither to create explosion.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingWitherCreateExplosion = true;

    @Rule(
        extra = {
            "Takes effect only if domobgriefing is true."
        },
        desc = "Allow whither to destroy blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingWitherCanDestroy = true;

    @Rule(
        desc = "Allow dragon to destroy blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingEnderDragonDestroyBlocks = true;

    @Rule(
        desc = "Allow dragon to destroy blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingCreeperCreateExplosion = true;

    @Rule(
        desc = "Allow enderman to pickup blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingEnderManPickUpBlock = true;

    @Rule(
        desc = "Allow enderman to place blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingEnderManPlaceBlock = true;

    @Rule(
        desc = "Allow evoker to change the color of the wool.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingEvokerWololo = true;

    @Rule(
        desc = "Allow piglin to pickup items.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingPiglinGather = true;

    @Rule(
        desc = "Allow ravager to break blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingRavagerBreakBlocks = true;

    @Rule(
        desc = "Allow silverfish to infect Stones.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingSilverfishInfectStones = true;

    @Rule(
        desc = "Allow silverfish out of blocks.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingSilverfishOutOfBlocks = true;

    @Rule(
        desc = "Allow fox to eat sweet berries.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingFoxEatSweetBerries = true;

    @Rule(
        desc = "Allow rabbit to eat carrot crop.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingRabbitEatCarrotCrop = true;

    @Rule(
        desc = "Allow snow Golem to spawn snow.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingSnowGolemSpawnSnow = true;

    @Rule(
        desc = "Allow fireball to create explosion.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingFireballCreateExplosion = true;

    @Rule(
        desc = "Allow small fireball to spawn fire.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingSmallFireballSpawnFire = true;

    @Rule(
        desc = "Allow wither skull to create explosion.",
        category = {ENTITYTICKING, MOBGRIEFING}
    )
    public static boolean mobGriefingWitherSkullCreateExplosion = true;
}
