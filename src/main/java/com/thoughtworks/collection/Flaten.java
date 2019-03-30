package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for(Integer[] integer_list : array) {
            result.addAll(Arrays.asList(integer_list));
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList<>();
        Set<Integer> item_set = new TreeSet<>();
        for(Integer[] integer_list : array) {
            for(Integer number : integer_list) {
                if(!item_set.contains(number)) {
                    result.add(number);
                    item_set.add(number);
                }
            }
            item_set.addAll(Arrays.asList(integer_list));
        }
        return result;
    }
}
