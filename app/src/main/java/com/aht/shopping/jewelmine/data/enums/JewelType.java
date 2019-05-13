package com.aht.shopping.jewelmine.data.enums;

public enum JewelType {
    SILVER(0), GOLD(1), PLATINUM(2), DIAMOND(3);

    private int value;
    private JewelType(int value){
        this.value=value;
    }

    public static int getCount() {
        int count = 0;
        for (JewelType s : JewelType.values())
            count++;
        return count;
    }

    public static int getValue(JewelType type) {
        return type.value;
    }
}
