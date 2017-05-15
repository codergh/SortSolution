package com.java.sort.util;

public class BubbleSortUtil {

    public static void sort(int[] sortTarget) {
        int length = sortTarget.length;
        for (int loopTimes = 0; loopTimes < length - 1; loopTimes++) {
            for (int index = 0; index < length - loopTimes - 1; index++) {
                if (sortTarget[index] < sortTarget[index + 1]) {
                    SwapUtil.swap(sortTarget, index, index + 1);
                }
            }
        }
    }
}
