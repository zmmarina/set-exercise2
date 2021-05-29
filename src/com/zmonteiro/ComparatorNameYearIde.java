package com.zmonteiro;

import java.util.Comparator;

public class ComparatorNameYearIde implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage favLang1, FavoriteLanguage favLang2) {
        int name = favLang1.getName().compareTo(favLang2.getName());
        if(name != 0) return name;

        int year = favLang1.getCreationYear().compareTo(favLang2.getCreationYear());
        if(year != 0) return year;

        return favLang1.getIde().compareTo(favLang2.getIde());
    }
}
