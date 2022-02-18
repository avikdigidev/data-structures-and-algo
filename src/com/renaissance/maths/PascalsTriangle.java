package com.renaissance.maths;

/*There are n boys and m girls. we need to choose a group containing exactly t people
 * having no less than 4 boys and no less than 1 girl.
 * where 4<=n<=30
 *       1<=m<=30
 *       5<=t<=n+m
 * */
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 30;
        int m = 30;
        int t = 5;
        long[][] pas = createPascalTriangle(n, m);
        long ans = 0;
        ans = pas[m + n][t];
        //subtracting invalid cases
        if (t <= m) { //0 boys remaining girls
            ans -= pas[n][0] * pas[m][t];
        }
        if (t - 1 <= m) { //1 boy and remaining girls
            ans -= pas[n][1] * pas[m][t - 1];
        }
        if (t - 2 <= m) {//2 boys remaining girls
            ans -= pas[n][2] * pas[m][t - 2];
        }
        if (t - 3 <= m) {//3 boys remaining girls
            ans -= pas[n][3] * pas[m][t - 3];
        }
        if ( t== m) {//all boys 0 girls
            ans -= pas[n][t] * pas[m][0];
        }
        System.out.println(ans);
    }

    private static long[][] createPascalTriangle(int n, int m) {
        long[][] pas = new long[m + n + 1][m + n + 1];
        pas[0][0] = 1;
        for (int i = 0; i <= m + n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pas[i][j] = 1;
                } else {
                    pas[i][j] = pas[i - 1][j] + pas[i - 1][j - 1];

                }
            }

        }
        return pas;
    }
}
