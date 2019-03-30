package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<>();
        for(Integer number : array) {
            if(number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList<>();
        for(Integer number : array) {
            if(number % 3 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> item_set = new TreeSet<>(secondList);
        for(Integer number : firstList) {
            if(item_set.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> item_set = new TreeSet<>(array);
        return new ArrayList<>(item_set);
    }
}