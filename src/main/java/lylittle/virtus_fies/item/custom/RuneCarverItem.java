package lylittle.virtus_fies.item.custom;

import lylittle.virtus_fies.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class RuneCarverItem extends Item {
    private static final Map<Block, Block> RUNE_CARVER_MAP =
            Map.of(
                    ModBlocks.HOLY_RUNE_BRICKS, ModBlocks.RUNE_PEDESTAL
            );


    public RuneCarverItem(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context){
        World world = context.getWorld();
        Block block = world.getBlockState(context.getBlockPos()).getBlock();

        if (RUNE_CARVER_MAP.containsKey(block)){
            if (!world.isClient()){
                world.setBlockState(context.getBlockPos(),RUNE_CARVER_MAP.get(block).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
                return ActionResult.SUCCESS;
            }
            return ActionResult.PASS;
        }
        return ActionResult.PASS;
    }
}
