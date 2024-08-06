package net.boypika.bringdecay.util;
import net.boypika.bringdecay.BringDecay;
import net.minecraftforge.event.entity.living.LivingGetProjectileEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BringDecay.MODID)
public class WitchAttackEventHandler {

    @SubscribeEvent
    public static void onWitchAttack(LivingGetProjectileEvent event) {
    }
}