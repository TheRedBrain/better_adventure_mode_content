package com.github.theredbrain.bamcontent.effect;

import com.github.theredbrain.bamcore.api.effect.FoodStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BerryFoodEffect extends FoodStatusEffect {
    public BerryFoodEffect() {
        super(StatusEffectCategory.BENEFICIAL, 3381504); // TODO better colour
    }

//    // This method is called every tick to check whether it should apply the status effect or not
//    @Override
//    public boolean canApplyUpdateEffect(int duration, int amplifier) {
//        // In our case, we just make it return true so that it applies the status effect every tick.
//        return true;
//    }
//
//    // This method is called when it applies the status effect. We implement custom functionality here.
//    @Override
//    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
////        entity.getAttributes().hasAttribute
//        if (entity instanceof PlayerEntity) {
//            ((PlayerEntity) entity).getAttributes().addTemporaryModifiers(); // Higher amplifier gives you EXP faster
//        }
//    }
//
//    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
//        super.onRemoved(entity, attributes, amplifier);
//        if (entity.getHealth() > entity.getMaxHealth()) {
//            entity.setHealth(entity.getMaxHealth());
//        }
////        if (entity.)
////        entity.getAttributeValue(EntityAttributes.GENERIC_MAX_HEALTH)
//    }
}
