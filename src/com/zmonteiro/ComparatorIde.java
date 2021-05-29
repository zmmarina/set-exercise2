package com.zmonteiro;

import java.util.Comparator;

public class ComparatorIde implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage favLang1, FavoriteLanguage favLang2) {
        return favLang1.getIde().compareTo(favLang2.getIde());

    }
}
