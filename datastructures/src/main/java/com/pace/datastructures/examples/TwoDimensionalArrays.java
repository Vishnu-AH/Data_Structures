package com.pace.datastructures.examples;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        //Initializing 2D array
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
        board[0][0] = 'O';
        board[1][1] = 'O';
        board[2][2] = 'O';
        System.out.println(Arrays.deepToString(board));

        System.out.println();
        char[][] board2 = new char[][]{
                new char[]{'O','-','-'},
                new char[]{'-','O','-'},
                new char[]{'-','-','O'}
        };
        System.out.println(Arrays.deepToString(board2));
    }
}
