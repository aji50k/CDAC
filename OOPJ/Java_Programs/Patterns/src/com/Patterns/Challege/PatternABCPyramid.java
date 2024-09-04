package com.Patterns.Challege;

class PatternABCPyramid {
    public static void main(String[] args) {
        int rows = 7;
        char alphabet = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}