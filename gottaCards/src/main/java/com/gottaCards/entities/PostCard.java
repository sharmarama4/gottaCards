package com.gottaCards.entities;

import java.util.Objects;
/*
Maak het Object ‘PostCard’ met variabele country (String), en variabele continent (String).
        Getters en setters niet vergeten, en optioneel voeg je een toString methode erbij.
        Vergeet niet om de equals() en hascodeMethode in deze klasse te overschrijven!

*/

public class PostCard {
    private String countryName;
    private String continent;

    public PostCard(String countryName, String continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        PostCard postCards = (PostCard) o;
        return Objects.equals(countryName, postCards.countryName) && Objects.equals(continent, postCards.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, continent);
    }

    @Override
    public String toString() {
        return "PostCard{" +
                "countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
