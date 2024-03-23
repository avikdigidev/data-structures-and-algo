package com.gfg.crash;

//search, insert and delete in O(1)
public class DirectAccessTable {

    private boolean[] arr = new boolean[1000];

    void insert(int i){
        if(i<arr.length){
            arr[i] =true;
        }
    }
    boolean search( int i){
        if (i<arr.length && arr[i]==true){
            return true;
        }
        return false;
    }

    void delete(int i){
        if (i<arr.length && arr[i]==true){
            arr[i] =false;
        }
    }
    public static void main(String[] args) {

boolean[] arr = new boolean[1000];
DirectAccessTable table = new DirectAccessTable();
table.insert(20);
        System.out.println("20 is present: "+table.search(20));
table.insert(10);
table.delete(20);
        System.out.println("20 is present: "+table.search(20));


    }


}
