package com.aht.shopping.jewelmine.core.model.jewel;

import com.aht.shopping.jewelmine.core.model.data.Jewel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class NormalJewels  implements Map<Integer, Jewel>{

    private Map<Integer, Jewel> jewelList = new HashMap<Integer, Jewel>();

    private float gst;

    private Integer key = 0;

    @Override
    public int size() {
        return jewelList.size();
    }

    @Override
    public boolean isEmpty() {
        return jewelList.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return jewelList.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return jewelList.containsValue(o);
    }

    @Override
    public Jewel get(Object o) {
        return jewelList.get(o);
    }

    @Override
    public Jewel put(Integer integer, Jewel gstJewel) {
        return jewelList.put(integer, gstJewel);
    }

    @Override
    public Jewel remove(Object o) {
        return jewelList.remove(o);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Jewel> map) {
        jewelList.putAll(map);
    }

    @Override
    public void clear() {
        jewelList.clear();
        key = 0;
    }

    @Override
    public Set<Integer> keySet() {
        return jewelList.keySet();
    }

    @Override
    public Collection<Jewel> values() {
        return jewelList.values();
    }

    @Override
    public Set<Map.Entry<Integer, Jewel>> entrySet() {
        return jewelList.entrySet();
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }

    public void createJewel(float rate, float quantity, float wastage, float makingCharges, boolean isSelected) {

        key++;

        Jewel data = new Jewel(rate, quantity, wastage, makingCharges, isSelected);
        put(key, data);
    }
}
