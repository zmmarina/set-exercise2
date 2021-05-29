package com.zmonteiro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<FavoriteLanguage> favoriteLanguages = new LinkedHashSet(){{
            add(new FavoriteLanguage("Java", 1995, "IntelliJ"));
            add(new FavoriteLanguage("Python", 1991, "Jupyter"));
            add(new FavoriteLanguage("Javascript", 1996, "VS Code"));
        }};
        System.out.println(favoriteLanguages);

        Set<FavoriteLanguage> favoriteLanguages2 = new TreeSet<>(favoriteLanguages);
        System.out.println(favoriteLanguages2);

        Set<FavoriteLanguage> favoriteLanguages3 = new TreeSet<>(new ComparatorIde());
        favoriteLanguages3.addAll(favoriteLanguages2);
        System.out.println(favoriteLanguages3);

        Set<FavoriteLanguage> favoriteLanguages4 = new TreeSet<>(new ComparatorYearName());
        favoriteLanguages4.addAll(favoriteLanguages2);
        System.out.println(favoriteLanguages4);

        Set<FavoriteLanguage> favoriteLanguages5 = new TreeSet<>(new ComparatorNameYearIde());
        favoriteLanguages5.addAll(favoriteLanguages2);
        System.out.println(favoriteLanguages5);










    }

}
