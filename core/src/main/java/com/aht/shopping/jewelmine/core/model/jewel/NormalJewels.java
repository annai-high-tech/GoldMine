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

    @Override
    public Jewel getOrDefault(Object o, Jewel gstJewel) {
        return jewelList.getOrDefault(o, gstJewel);
    }

    @Override
    public void forEach(BiConsumer<? super Integer, ? super Jewel> biConsumer) {
        jewelList.forEach(biConsumer);
    }

    @Override
    public void replaceAll(BiFunction<? super Integer, ? super Jewel, ? extends Jewel> biFunction) {
        jewelList.replaceAll(biFunction);
    }

    @Override
    public Jewel putIfAbsent(Integer integer, Jewel gstJewel) {
        return jewelList.putIfAbsent(integer, gstJewel);
    }

    @Override
    public boolean remove(Object o, Object o1) {
        return jewelList.remove(o, o1);
    }

    @Override
    public boolean replace(Integer integer, Jewel gstJewel, Jewel v1) {
        return jewelList.replace(integer, gstJewel, v1);
    }

    @Override
    public Jewel replace(Integer integer, Jewel gstJewel) {
        return jewelList.replace(integer, gstJewel);
    }

    @Override
    public Jewel computeIfAbsent(Integer integer, Function<? super Integer, ? extends Jewel> function) {
        return jewelList.computeIfAbsent(integer, function);
    }

    @Override
    public Jewel computeIfPresent(Integer integer, BiFunction<? super Integer, ? super Jewel, ? extends Jewel> biFunction) {
        return jewelList.computeIfPresent(integer, biFunction);
    }

    @Override
    public Jewel compute(Integer integer, BiFunction<? super Integer, ? super Jewel, ? extends Jewel> biFunction) {
        return jewelList.compute(integer, biFunction);
    }

    @Override
    public Jewel merge(Integer integer, Jewel gstJewel, BiFunction<? super Jewel, ? super Jewel, ? extends Jewel> biFunction) {
        return jewelList.merge(integer, gstJewel, biFunction);
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }
}
