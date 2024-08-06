package net.boypika.bringdecay;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;


@Mod.EventBusSubscriber(modid = BringDecay.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue WITCH_THROW_WITHER = BUILDER
            .comment("Whether the Witch should throw Decay instead of Poison")
            .define("witch_throw_wither", false);

    private static final ForgeConfigSpec.FloatValue MIN_HEALTH_FOR_DECAY_FROM_WITCH = BUILDER
            .comment("Minimum Health required for the Witch to throw Decay")
            .defineInRange("min_health_for_decay_from_witch", 8.0F, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);

    private static final ForgeConfigSpec.BooleanValue BREWABLE_DECAY_POTION = BUILDER
            .comment("Whether the Decay Potion should be brewable or not")
            .define("brewable_decay_potion", false);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean witchThrowWither;
    public static float minHealthForDecayFromWitch;
    public static boolean brewableDecayPotion;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        witchThrowWither = WITCH_THROW_WITHER.get();
        minHealthForDecayFromWitch = MIN_HEALTH_FOR_DECAY_FROM_WITCH.get();
        brewableDecayPotion = BREWABLE_DECAY_POTION.get();
    }
}
