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

    @Override
    public AccurateGstJewel getOrDefault(Object o, AccurateGstJewel gstJewel) {
        return jewelList.getOrDefault(o, gstJewel);
    }

    @Override
    public void forEach(BiConsumer<? super Integer, ? super AccurateGstJewel> biConsumer) {
        jewelList.forEach(biConsumer);
    }

    @Override
    public void replaceAll(BiFunction<? super Integer, ? super AccurateGstJewel, ? extends AccurateGstJewel> biFunction) {
        jewelList.replaceAll(biFunction);
    }

    @Override
    public AccurateGstJewel putIfAbsent(Integer integer, AccurateGstJewel gstJewel) {
        return jewelList.putIfAbsent(integer, gstJewel);
    }

    @Override
    public boolean remove(Object o, Object o1) {
        return jewelList.remove(o, o1);
    }

    @Override
    public boolean replace(Integer integer, AccurateGstJewel gstJewel, AccurateGstJewel v1) {
        return jewelList.replace(integer, gstJewel, v1);
    }

    @Override
    public AccurateGstJewel replace(Integer integer, AccurateGstJewel gstJewel) {
        return jewelList.replace(integer, gstJewel);
    }

    @Override
    public AccurateGstJewel computeIfAbsent(Integer integer, Function<? super Integer, ? extends AccurateGstJewel> function) {
        return jewelList.computeIfAbsent(integer, function);
    }

    @Override
    public AccurateGstJewel computeIfPresent(Integer integer, BiFunction<? super Integer, ? super AccurateGstJewel, ? extends AccurateGstJewel> biFunction) {
        return jewelList.computeIfPresent(integer, biFunction);
    }

    @Override
    public AccurateGstJewel compute(Integer integer, BiFunction<? super Integer, ? super AccurateGstJewel, ? extends AccurateGstJewel> biFunction) {
        return jewelList.compute(integer, biFunction);
    }

    @Override
    public AccurateGstJewel merge(Integer integer, AccurateGstJewel gstJewel, BiFunction<? super AccurateGstJewel, ? super AccurateGstJewel, ? extends AccurateGstJewel> biFunction) {
        return jewelList.merge(integer, gstJewel, biFunction);
    }
}
