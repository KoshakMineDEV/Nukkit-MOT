package cn.nukkit.item;

import cn.nukkit.item.trim.ItemTrimPatternType;
import cn.nukkit.network.protocol.ProtocolInfo;

/**
 * @author Glorydark
 */
public class ItemEyeArmorTrimSmithingTemplate extends StringItemBase implements ItemTrimPattern {

    public ItemEyeArmorTrimSmithingTemplate() {
        super("minecraft:eye_armor_trim_smithing_template", "Eye Armor Trim Smithing Template");
    }

    @Override
    public ItemTrimPatternType getPattern() {
        return ItemTrimPatternType.EYE_ARMOR_TRIM;
    }

    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_19_80;
    }
}
