package com.interview.test.accolite.round1;

public class Accolite implements InterfaceA,InterfaceB{
    public static void main(String[] args) {
/*        java.util.Date today = new java.util.Date();
        java.sql.Timestamp ts1 = java.sql.Timestamp.valueOf("2022-03-01 00:00:01");;//new java.sql.Timestamp(today.getTime());
        java.sql.Timestamp ts2 = java.sql.Timestamp.valueOf("2022-04-01 00:00:01");
        long tsTime1 = ts1.getTime();
        long tsTime2 = ts2.getTime();

        for (int i = 0; i < 100; i++) {
            long generatedLong = tsTime1 + (long) (Math.random() * (tsTime2 - tsTime1));
            System.out.println(generatedLong);

        }*/

        InterfaceA test = new Accolite();
        test.show();
        InterfaceB test2 = new Accolite();
        test2.show();

    }



    @Override
    public void show() {
        InterfaceB.super.show();
    }
}
