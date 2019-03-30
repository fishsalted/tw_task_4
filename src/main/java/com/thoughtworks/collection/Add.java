package com.thoughtworks.collection;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int result = 0;
        if(leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for(int i = leftBorder; i <= rightBorder; ++i) {
            if(i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int result = 0;
        if(leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for(int i = leftBorder; i <= rightBorder; ++i) {
            if(i % 2 != 0) {
                result += i;
            }
        }
        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for(Integer number : arrayList) {
            result += (number * 3 + 2);
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for(Integer number : arrayList) {
            if(number % 2 != 0) {
                number = number * 3 + 2;
            }
            result.add(number);
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for(Integer number : arrayList) {
            if(number % 2 != 0) {
                result += (number * 3 + 5);
            }
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double result;
        List<Integer> even_list = new ArrayList<>();
        for(Integer number : arrayList) {
            if(number % 2 == 0) {
                even_list.add(number);
            }
        }
        even_list.sort(Comparator.comparingInt(n -> n));
        int evens_size = even_list.size();
        if(evens_size == 1) {
            result = even_list.get(0);
        }else if(evens_size % 2 != 0) {
            result = even_list.get(evens_size / 2);
        }else {
            result = (even_list.get(evens_size / 2 - 1) + even_list.get(evens_size / 2)) / 2;
        }
        return result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int even_num = 0;
        double result = 0;
        for(Integer number : arrayList) {
            if(number % 2 == 0) {
                ++even_num;
                result += number;
            }
        }
        if(even_num == 0) {
            return 0;
        }
        return result / even_num;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if(specialElment % 2 != 0) {
            return false;
        }
        for(Integer number : arrayList) {
            if(number % 2 == 0 && number.equals(specialElment)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> number_set = new TreeSet<>();

        for(Integer number : arrayList) {
            if(number % 2 == 0 && !number_set.contains(number)) {
                number_set.add(number);
                result.add(number);
            }
        }

        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        arrayList.sort((n1, n2) -> {
            if(n1 % 2 == 0) {
                if(n2 % 2 != 0) {
                    return -1;
                }
                return n1 - n2;
            }else {
                if(n2 % 2 == 0) {
                    return 1;
                }
                return n2 - n1;
            }
        });
        return arrayList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        int array_size = arrayList.size() - 1;

        for(int i = 0; i < array_size; ++i) {
            result.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }

        return result;
    }
}
