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

    @Override
    public GstJewel getOrDefault(Object o, GstJewel gstJewel) {
        return jewelList.getOrDefault(o, gstJewel);
    }

    @Override
    public void forEach(BiConsumer<? super Integer, ? super GstJewel> biConsumer) {
        jewelList.forEach(biConsumer);
    }

    @Override
    public void replaceAll(BiFunction<? super Integer, ? super GstJewel, ? extends GstJewel> biFunction) {
        jewelList.replaceAll(biFunction);
    }

    @Override
    public GstJewel putIfAbsent(Integer integer, GstJewel gstJewel) {
        return jewelList.putIfAbsent(integer, gstJewel);
    }

    @Override
    public boolean remove(Object o, Object o1) {
        return jewelList.remove(o, o1);
    }

    @Override
    public boolean replace(Integer integer, GstJewel gstJewel, GstJewel v1) {
        return jewelList.replace(integer, gstJewel, v1);
    }

    @Override
    public GstJewel replace(Integer integer, GstJewel gstJewel) {
        return jewelList.replace(integer, gstJewel);
    }

    @Override
    public GstJewel computeIfAbsent(Integer integer, Function<? super Integer, ? extends GstJewel> function) {
        return jewelList.computeIfAbsent(integer, function);
    }

    @Override
    public GstJewel computeIfPresent(Integer integer, BiFunction<? super Integer, ? super GstJewel, ? extends GstJewel> biFunction) {
        return jewelList.computeIfPresent(integer, biFunction);
    }

    @Override
    public GstJewel compute(Integer integer, BiFunction<? super Integer, ? super GstJewel, ? extends GstJewel> biFunction) {
        return jewelList.compute(integer, biFunction);
    }

    @Override
    public GstJewel merge(Integer integer, GstJewel gstJewel, BiFunction<? super GstJewel, ? super GstJewel, ? extends GstJewel> biFunction) {
        return jewelList.merge(integer, gstJewel, biFunction);
    }
}
