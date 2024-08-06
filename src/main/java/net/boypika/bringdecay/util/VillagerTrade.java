package net.boypika.bringdecay.util;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.boypika.bringdecay.BringDecay;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Optional;

@Mod.EventBusSubscriber(modid = BringDecay.MODID)
public class VillagerTrade {

    @SubscribeEvent
    public static void addTrade(VillagerTradesEvent event) {
       //if(event.getType() == VillagerProfession.FLETCHER) {
       //    Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

       //    trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
       //            new ItemCost(Items.EMERALD, 6),
       //            Optional.of(new ItemCost(Items.ARROW, 5)),
       //            PotionContents.createItemStack(Items.TIPPED_ARROW, BringDecay.DECAY.getHolder().get()), 12, 30, 0.05f
       //    ));
       //}
       //BringDecay.LOGGER.info("Trade Added");

    }
}
