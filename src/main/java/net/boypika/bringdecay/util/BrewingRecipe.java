package net.boypika.bringdecay.util;

import net.boypika.bringdecay.Config;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.boypika.bringdecay.BringDecay.DECAY;
import static net.boypika.bringdecay.BringDecay.LOGGER;

@Mod.EventBusSubscriber(modid = "bring_decay")
public class BrewingRecipe {
    @SubscribeEvent
    public static void registerBrewingRecipes(BrewingRecipeRegisterEvent event) {
        if (Config.brewableDecayPotion) {
            PotionBrewing.Builder builder = event.getBuilder();

            builder.addMix(
                    Potions.AWKWARD,
                    Items.WITHER_ROSE,
                    DECAY.getHolder().get()
            );
            LOGGER.info("Brewing Recipe Added");
        } else {
            LOGGER.info("Brewing Recipe Not Added (Check Config)");
        }
    }
}
