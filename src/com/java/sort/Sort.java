package com.java.sort;

import com.java.sort.util.BubbleSortUtil;

public class Sort {

    public static void main(String[] args) {
        int[] sortTarget = { 6, 2, 5, 1, 4, 9 };
        BubbleSortUtil.sort(sortTarget);
        outPut(sortTarget);
    }

    private static void outPut(int[] sortList) {
        for (int i = 0; i < sortList.length; i++) {
            System.out.print(sortList[i] + " ");
        }
    }

}
