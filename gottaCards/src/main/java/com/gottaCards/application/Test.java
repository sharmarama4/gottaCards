package com.gottaCards.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {


       /* List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(12);
        list.add(14);
        list.forEach(e-> System.out.println(e));
        System.out.println();
        Set<Integer>set=new HashSet<>();
        set.addAll(list);
        set.forEach(e-> System.out.println(e));
        if (list.size()==set.size()){
            System.out.println("There is no duplicate");
        }else {
            System.out.println("There is duplicate");
        }
        System.out.println("-------");
        ArrayList<String> ar=new ArrayList<String>();
        ArrayList<String> ar2=new ArrayList<String>();

        ar.add("1");
        ar.add("2");
        ar.add("3");
        ar.add("4");
        ar.add("5");
        ar.add("1");
        ar.add("2");
        ar.add("1");

        for(int x=0;x<ar.size();x++)
        {
            if(!ar2.contains(ar.get(x)))
            {
                for(int y=x+1;y<ar.size()-1;y++)
                {

                    if((ar.get(y).equals(ar.get(x))))
                    {
                        System.out.print("repeating "+ar.get(x));
                        ar2.add(ar.get(x));
                        break;

                    }


                }

            }

        }*/
        List<Integer> listOf = new ArrayList<Integer>();
        listOf.add(3);
        listOf.add(1);
        listOf.add(2);
        listOf.add(3);
        listOf.add(3);
        listOf.add(2);
        listOf.add(1);

        List<Integer> tempList = new ArrayList<Integer>();
        for(Integer obj:listOf){
            if(!tempList.contains(obj)){
                tempList.add(obj);

            }
        }
        System.out.println(tempList);


    }
}