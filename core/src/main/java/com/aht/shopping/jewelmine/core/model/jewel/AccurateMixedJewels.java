package com.aht.shopping.jewelmine.core.model.jewel;

import com.aht.shopping.jewelmine.core.model.data.AccurateGstJewel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class AccurateMixedJewels implements Map<Integer, AccurateGstJewel>{

    private Map<Integer, AccurateGstJewel> jewelList = new HashMap<Integer, AccurateGstJewel>();

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
    public AccurateGstJewel get(Object o) {
        return jewelList.get(o);
    }

    @Override
    public AccurateGstJewel put(Integer integer, AccurateGstJewel gstJewel) {
        return jewelList.put(integer, gstJewel);
    }

    @Override
    public AccurateGstJewel remove(Object o) {
        return jewelList.remove(o);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends AccurateGstJewel> map) {
        jewelList.putAll(map);
    }

    @Override
    public void clear() {
        jewelList.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return jewelList.keySet();
    }

    @Override
    public Collection<AccurateGstJewel> values() {
        return jewelList.values();
    }

    @Override
    public Set<Map.Entry<Integer, AccurateGstJewel>> entrySet() {
        return jewelList.entrySet();
    }

}
