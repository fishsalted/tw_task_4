package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for(Integer number : array) {
            result.add(number * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for(Integer number : array) {
            result.add(letterList.get(number - 1));
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for(Integer number : array) {
            int first = number / 26;
            int second = number % 26;
            if(second == 0) {
                first -= 1;
                second = 26;
            }
            if(first > 0) {
                result.add(letterList.get(first - 1) + letterList.get(second - 1));
            }else {
                result.add(letterList.get(second - 1));
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        array.sort((Integer n1, Integer n2) -> n2 - n1);
        return array;
    }

    public List<Integer> sortFromSmall() {
        array.sort(Comparator.comparingInt(n -> n));
        return array;
    }
}
