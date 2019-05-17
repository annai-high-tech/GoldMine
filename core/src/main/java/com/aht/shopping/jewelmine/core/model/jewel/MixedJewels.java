package com.aht.shopping.jewelmine.core.model.jewel;

import com.aht.shopping.jewelmine.core.model.data.GstJewel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MixedJewels implements Map<Integer, GstJewel>{

    private Map<Integer, GstJewel> jewelList = new HashMap<Integer, GstJewel>();

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
    public GstJewel get(Object o) {
        return jewelList.get(o);
    }

    @Override
    public GstJewel put(Integer integer, GstJewel gstJewel) {
        return jewelList.put(integer, gstJewel);
    }

    @Override
    public GstJewel remove(Object o) {
        return jewelList.remove(o);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends GstJewel> map) {
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
    public Collection<GstJewel> values() {
        return jewelList.values();
    }

    @Override
    public Set<Map.Entry<Integer, GstJewel>> entrySet() {
        return jewelList.entrySet();
    }

}
