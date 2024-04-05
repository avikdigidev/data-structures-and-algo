package com.codesignal.arcade.intro;

public class BoxBlur {


    public static void main(String[] args) {

    }

    static int[][] solution(int[][] image) {
        int i = image.length - 2;
        int j = image[1].length - 2;
        int[][] output = new int[i][j];
        for (i = 0; i < image.length - 2; i++) {
            for (j = 0; j < image[1].length - 2; j++) {
                output[i][j] = (image[i][j] + image[i][j + 1] + image[i][j + 2] +
                        image[i + 1][j] + image[i + 1][j + 1] + image[i + 1][j + 2] +
                        image[i + 2][j] + image[i + 2][j + 1] + image[i + 2][j + 2])
                        / 9;
            }
        }
        return output;

    }
}