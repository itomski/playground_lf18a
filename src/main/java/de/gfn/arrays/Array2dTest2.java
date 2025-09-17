package de.gfn.arrays;

import java.util.Arrays;

public class Array2dTest2 {

    public static void main(String[] args) {

        int[][] int2d;
        //int2d = {{1,2,3}, {4,5,6}}; // Error: Nur bei gleichzeitiger Deklaration erlaubt

        int[][] int2d_ = {{1,2,3}, {4,5,6}}; // Ok
        int2d_ = new int[][]{{1,2,3}, {4,5,6}}; // Ok

        int2d_ = new int[][]{{1,2,3}, {4,5}, {}}; // Ok

        char[][] char2d = new char[10][10];

        char2d[5][7] = '@';

        for(char[] row : char2d) {
            for(char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < char2d.length ; i++) {
            for (int j = 0; j < char2d[i].length ; j++) {
                System.out.print(char2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(Arrays.deepToString(char2d));

    }
}
