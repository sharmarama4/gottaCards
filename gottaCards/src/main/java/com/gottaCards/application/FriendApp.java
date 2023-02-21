package com.gottaCards.application;

import com.gottaCards.entities.Friend;


import java.util.PriorityQueue;
import java.util.Queue;

public class FriendApp {
    public static void main(String[] args) {
        Friend bobby = new Friend("Bobby",false, 3, 5);
        Friend melissa = new Friend("Melissa",false, 1, 6);
        Friend darla = new Friend("Darla",true, 14, 2);
        Friend bert = new Friend("Bert",false, 10, 4);
        Friend grandma = new Friend("Nana",true, 12, 7);
        Friend fester = new Friend("Fester",false, 1, 2);
        Friend anna = new Friend("Anna",false, 8, 4);
/*Opdracht 4 :
        Je komt erachter dat kaarten verzamelen eigenlijk niet meer in de mode is en je beslist ze weg
        te geven aan al je vrienden.
        Uiteraard heb je hier ook een systeem voor. Je wilt hier dit keer niet te veel code voor gebruiken, het gaat toch maar om kaarten die je niet meer gaat verzamelen.
                Maak een ProrityQueue die ‘sortedFriends’ heet aan die aan de hand van lambdas eerst
        prioriteit geeft aan je familieleden, dan aan je beste vriend en dan pas aan de mensen die je
        het langste kent. Vul hem dan aan met het volgende:*/


        Queue<Friend> sortedFriends=new PriorityQueue<>();
        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);
    sortedFriends.forEach(e->{
    System.out.println(e);
     });
        System.out.println("With priority of ");

        while ((!sortedFriends.isEmpty())){
            System.out.println(sortedFriends.poll());
        }

    }
}




