package com.java.sort.util;

public class SwapUtil {
    public static void swap(int[] target, int indexX, int indexY) {
        int temp = target[indexX];
        target[indexX] = target[indexY];
        target[indexY] = temp;
    }
}
