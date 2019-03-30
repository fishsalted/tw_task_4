package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int result = arrayList.get(0);
        for(int i = 1;i < arrayList.size(); ++i) {
            if(arrayList.get(i) > result) {
                result = arrayList.get(i);
            }
        }
        return result;
    }

    public double getMinimum() {
        int result = arrayList.get(0);
        for(int i = 1;i < arrayList.size(); ++i) {
            if(arrayList.get(i) < result) {
                result = arrayList.get(i);
            }
        }
        return result;
    }

    public double getAverage() {
        double result = 0.0;
        int index = 0;
        for(;index < arrayList.size();++index) {
            result += arrayList.get(index);
        }
        return result / index;
    }

    public double getOrderedMedian() {
        double result;
        arrayList.sort(Comparator.comparingInt(n -> n));
        int list_size = arrayList.size();
        if(list_size == 1) {
            result = arrayList.get(0);
        }else if(list_size % 2 != 0) {
            result = arrayList.get(list_size / 2);
        }else {
            result = (arrayList.get(list_size / 2 - 1) + arrayList.get(list_size / 2));
            result /= 2;
        }
        return result;
    }

    public int getFirstEven() {
        for(Integer number : arrayList) {
            if(number % 2 == 0) {
                return number;
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for(int i = 0;i < arrayList.size(); ++i) {
            if(arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double result;
        int list_size = arrayList.size();
        if(list_size == 1) {
            result = arrayList.get(0);
        }else if(list_size % 2 != 0) {
            result = Double.parseDouble(singleLink.getNode(list_size / 2 + 1).toString());
        }else {
            result = Double.parseDouble(singleLink.getNode(list_size / 2).toString());
            result += Double.parseDouble(singleLink.getNode(list_size / 2 + 1).toString());
            result /= 2;
        }
        return result;
    }

    public int getLastOdd() {
        for(int i = arrayList.size() - 1; i > -1; --i) {
            if(arrayList.get(i) % 2 != 0) {
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        for(int i = arrayList.size() - 1; i > -1; --i) {
            if(arrayList.get(i) % 2 != 0) {
                return i;
            }
        }
        return 0;
    }
}
