package com.cloud.algorithm;

public class ArrayMain {


    public static void main(String[] args) {

        int[][] arrays = new int[11][11];
        arrays[5][6] = 9;
        arrays[9][10] = 99;

        System.out.println("====打印原始数组====");
        int sum = 1;
        for (int[] array : arrays) {
            for (int i : array) {
                if (i != 0) {
                    sum++;
                }
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
        System.out.println("====打印原始数组====");

        /*
            生成稀数数组
         */
        int[][] shoeArrays = new int[sum][3];
        shoeArrays[0][0] = 11;
        shoeArrays[0][1] = 11;
        shoeArrays[0][2] = sum;

        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arrays[i][j] != 0) {
                    count++;
                    shoeArrays[count][0] = i;
                    shoeArrays[count][1] = j;
                    shoeArrays[count][2] = arrays[i][j];
                }
            }
        }

        System.out.println("--------------------");
        for (int i = 0; i < shoeArrays.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", shoeArrays[i][0], shoeArrays[i][1], shoeArrays[i][2]);
        }

        System.out.println("---------稀疏数组还原-----------");
        int[][] chessArr2 = new int[shoeArrays[0][0]][shoeArrays[0][1]];

        for (int i = 1; i < shoeArrays.length; i++) {
            chessArr2[shoeArrays[i][0]][shoeArrays[i][1]] = shoeArrays[i][2];
        }

        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        System.out.println("---------稀疏数组还原-----------");
    }
}
