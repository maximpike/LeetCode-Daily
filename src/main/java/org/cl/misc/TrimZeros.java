package org.cl.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrimZeros {

    public int[] trimAllOuterZeros(int[] array){

        // Therefore need to check from both ends of input array
        int start = 0;
        int end = array.length - 1;
        int zeroCounter = 0;
        int nonZeroCounter = 0;
        int index=0;
        List<Integer> trimListArray = new ArrayList<>(Arrays.stream(array).boxed().toList());
        System.out.println("trimListArray: " + trimListArray);

        while (start <= end) {
            System.out.println("Start Array[" + start + "] = " + array[start]);
            if (array[start] == 0) {
                zeroCounter++;
                if (trimListArray.size() <= start) {
                    trimListArray.remove(end-start);
                } else {
                    trimListArray.remove(start-index);
                    index++;
                }
                System.out.println("Array value at start: " + start + " removed");
            } else {
                nonZeroCounter++;
                break;
            }
            start++;
        }

        while (end >= start) {
            if (array[end] == 0) {
                zeroCounter++;
                if (trimListArray.size() > end) {
                    trimListArray.remove(end);
                } else {
                    trimListArray.remove(end-start);
                }
                System.out.println("Array value at end: " + end + " removed");
            } else {
                nonZeroCounter++;
                break;
            }
            end--;
        }

        System.out.println("trim list = " + trimListArray);
        return trimListArray.stream().mapToInt(Integer::intValue).toArray();

        // This solution won't work as every zero will always be removed
        /*
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        while(counter < array.length) {
            System.out.println("Array[" + counter + "] = " + array[counter]);
            if (array[counter] == 1) {
                list.add(array[counter]);
            }
            counter++;
        }
        System.out.println("list = " + list);
        int[] arrayResult = list.stream().mapToInt(i -> i).toArray();
        */
    }
}
