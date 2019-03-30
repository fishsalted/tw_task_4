package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left < right) {
            for(int i = left;i <= right; ++i) {
                result.add(i);
            }
        }else {
            for(int i = left;i >= right; --i) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left < right) {
            for(int i = left;i <= right; ++i) {
                if(i % 2 == 0) {
                    result.add(i);
                }
            }
        }else {
            for(int i = left;i >= right; --i) {
                if(i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for(Integer number : array) {
            if(number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> item_set = new TreeSet<>();
        for(Integer number : firstArray) {
            item_set.add(number);
        }
        for(Integer number : secondArray) {
            if(item_set.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        Set<Integer> item_set = new TreeSet<>(Arrays.asList(firstArray));
        List<Integer> result = new ArrayList<>(Arrays.asList(firstArray));
        for(Integer number : secondArray) {
            if(!item_set.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
