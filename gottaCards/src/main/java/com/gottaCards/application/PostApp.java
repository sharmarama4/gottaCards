package com.gottaCards.application;


import com.gottaCards.comparator.CountryNameSort;
import com.gottaCards.entities.Friend;
import com.gottaCards.entities.PostCard;

import java.util.*;
import java.util.stream.Collectors;



public class PostApp {
    public static void main(String[] args) {
        //your cards
        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");

        List<PostCard> yourPostCardList = new ArrayList();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);

        //your friend's cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");
        List<PostCard> yourFriendsPostCardList = new ArrayList();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);


/*Opdracht 1 :
        Je beste vriend heeft een paar kaarten die je graag met hem zou willen ruilen. Hij vindt het
        goed, zolang je alleen maar dubbeltjes van hem vraagt.
        Jij hebt een systeem voor alles dat je ruilt: graag plaats jij de nieuwe kaart op dezelfde plaats
        als de kaart dat je net weg ruilde. (INDEX!)
        Jouw vriend kan het niet echt schelen, zolang hij maar zijn nieuwe kaart krijgt.
        Zorg ervoor dat deze ruil opportuniteit waar komt.*/

        System.out.println("To check and print the duplicate of my friend's cards");
        Set<PostCard> postCard = new HashSet<>();
        for (PostCard po : yourFriendsPostCardList) {
            if (postCard.add(po) == false)
                System.out.println(po);
        }
        System.out.println();

        System.out.println("To check and print the duplicate of my cards");
        Set<PostCard> post = new HashSet<>();
        for (PostCard pos : yourPostCardList) {
            if (post.add(pos) == false)
                System.out.println(pos);
        }
        System.out.println();
        List<PostCard> newList = new ArrayList<>();
        newList.addAll(yourPostCardList);
        newList.forEach(e -> System.out.println(e));

        //this is the another way to check duplicate
        List<PostCard> yourDup = yourPostCardList.stream().filter(entry
                -> Collections.frequency(yourPostCardList, entry) > 1).collect(Collectors.toList());

        System.out.println("After changing my friends new list");
        postCard.addAll(yourDup);
        postCard.forEach(e -> System.out.println(e));
        System.out.println("-----");
      System.out.println("After changing has your friend same index of list= " + postCard.containsAll(yourFriendsPostCardList));
        System.out.println();

        List<PostCard> friendsDup = yourFriendsPostCardList.stream().filter(entry
                -> Collections.frequency(yourFriendsPostCardList, entry) > 1).collect(Collectors.toList());
        //  dps2.forEach(e -> System.out.println(e));
        System.out.println("------");
        System.out.println("After changing prints my newList");
        post.addAll(friendsDup);
        post.forEach(e -> System.out.println(e));
        System.out.println("-----");
        System.out.println("After changing do you have same index of list= " + post.containsAll(yourPostCardList));
       /* Opdracht 2 :
        Je beslist toch je systeem aan te passen en wilt al je kaarten sorteren per land. Gebruik hiervoor
        een Comparator!
                Print het resultaat uit.
*/
        List<PostCard> list = new ArrayList<>();
        list.addAll(post);
        // Sorting student entries by roll number
        Collections.sort(list, new CountryNameSort());
        System.out.println("\nsorting the countryName of my cards");
        list.forEach(e -> System.out.println(e));

        List<PostCard> friends = new ArrayList<>();
        friends.addAll(postCard);
        // Sorting student entries by roll number
        Collections.sort(friends, new CountryNameSort());
        System.out.println("\nsorting the countryName of my friend's cards");
        friends.forEach(e -> System.out.println(e));
        System.out.println(friends.size());
       /* Je systeem is nog niet optimaal genoeg, en je beslist je dubbeltjes uit je hoop kaarten te halen.
        Maak een nieuwe Set kaarten die de huidige volgorde van je kaarten behoudt, en creëer een
        methode die kijkt hoeveel kaarten je van een bepaald land hebt, en de overschot dan toevoegt
        aan een nieuwe List.
        HINT: gebruik Collections.frequency();
        Print dan het resultaat uit.*/
        System.out.println();
        yourPostCardList.forEach(e -> System.out.println(e));
        System.out.println("Total size of you cards");
        System.out.println(yourPostCardList.size());
        System.out.println();
        List<PostCard> sizeOfCard = yourPostCardList.stream().filter(entry
                -> Collections.frequency(yourPostCardList, entry) > 1).collect(Collectors.toList());
        //  sizeOfCard.forEach(e-> System.out.println(e));
        System.out.println("Your duplicates list size");
        System.out.println(sizeOfCard.size());

        List<PostCard> bel = new ArrayList<>();
        List<PostCard> fran = new ArrayList<>();
        List<PostCard> other = new ArrayList<>();
        sizeOfCard.forEach(e -> {
            if (e.getCountryName().contains("Belgium")) {
                bel.add(e);
            } else if (e.getCountryName().contains("France")) {
                fran.add(e);
            } else {
                other.add(e);
            }
        });
        System.out.println("The size from Belgium is = " + bel.size());
        System.out.println("The size from France is = " + fran.size());
        // System.out.println("The size of other is = " + other.size());
        System.out.println("The size of unique country = " + (yourPostCardList.size() - sizeOfCard.size()));
    }
}