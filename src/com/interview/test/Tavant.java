package com.interview.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tavant {

    public static void main(String[] args) {
        /*
    Write a utility method that takes a list of strings and returns a list of strings.
Input will be a list of full names and return will be list of last names.
eg: ["Murli Gana Reddy", "Dijo Jose Kurian", "Feroze Abdul Khan"]...will return ["Reddy", "Kurian", "Khan"]
use lambdas, streams
...will return ["Reddy", "Kurian", "Khan"]
use lambdas, streams
2
If the name doesnt follow pattern 'fname mname lname', skip the name.
*/

        List<String> fullNames = new ArrayList<>();
        fullNames.add("Murli Gana Reddy");
        fullNames.add("Dijo Jose Kurian");
        fullNames.add("Feroze Abdul Khan");
        fullNames.add("Prakash Shelke");
        List<String> lastNames = fullNames.stream().filter((fullName) ->
                (fullName.split(" ").length == 3)
        ).map((fullName) -> {
            String[] lastname = fullName.split(" ");
            return lastname[lastname.length - 1];
        }).collect(Collectors.toList());

        System.out.println(lastNames);


    }


}
