/*
package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Volkswagen {
    public static void main(String[] args) {
        TwoSum ts = (a,b)->a+b;
        int sum = ts.getSum(3,4);
        System.out.println(sum);
*/
/*Students id, name,
* list to map
* id would be key
* name would be value*//*

       int[][] arr =  {{1,2,4},{3,5}};
      int sum2 =  Arrays.asList(arr).stream().flatMapToInt(i-> Arrays.stream(i)).sum();
        System.out.println(sum2);
        List<Student> stuList = new ArrayList<>();
 */
/*
@Controller
        @Autow
        service interface
        getmapping
        int getSum(int a, int b)
            Implservice impl.getSum

        1,"Name2"; >   2, "Name2"
        2, "Name2";
        1, "Name2";
         4
    }

    /*
    *  interface PizzaFac -->  --> Interface<bases>baseFac, Inteface ingerdientsFact
    *                      /\                   /\
    *                   wheat, handtossed       topiing, nveg
    *
    * CheesePizza implements Pizza
    * base implements Pizza
    * ingredient cheese
    *
    * maven verify, deploy
    * mock.post("/emp/name", mockobject).andExpe
    *     * getEmpName(){
     *        return   repository.getEmpNames;
     *
     * }
    * @Mock
    * Service
    * TestService
    *  @injectMocks
    * repository -->List<String> getEmpNames();

    * testGetEmpName(){
    * List<> nameList

    * populate values nameList
    when(repository.getEmpNames()).thenReturn(nameList)
    *     service.getEmpNames();
    * asse
    *
    * }
    *
    * void updateName()
    *
    * doNothing(updateName())
    * String name getName()
    * assert
    *  //write test for repository
    *
    *
    * *//*





    class Student{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
    @FunctionalInterface
    interface TwoSum{
        int getSum(int a, int b);

    }}
*/
