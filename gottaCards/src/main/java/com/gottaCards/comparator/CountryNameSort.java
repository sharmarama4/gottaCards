package com.gottaCards.comparator;

import com.gottaCards.entities.PostCard;

import java.util.Comparator;


    public class CountryNameSort implements Comparator<PostCard> {
        @Override
        public int compare(PostCard o1, PostCard o2) {
            return o1.getCountryName().compareTo(o2.getCountryName());
        }
}
