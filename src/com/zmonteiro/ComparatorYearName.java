package com.zmonteiro;

import java.util.Comparator;

public class ComparatorYearName implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage favLang1, FavoriteLanguage favLang2) {
        int year = favLang1.getCreationYear().compareTo(favLang2.getCreationYear());
        if(year != 0) return year;
        return favLang1.getName().compareTo(favLang2.getName());
    }
}
