package com.zmonteiro;

import java.util.Objects;

public class FavoriteLanguage implements Comparable<FavoriteLanguage>{
    private String name;
    private Integer creationYear;
    private String ide;

    public FavoriteLanguage(String name, Integer creationYear, String ide) {
        this.name = name;
        this.creationYear = creationYear;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(Integer creationYear) {
        this.creationYear = creationYear;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteLanguage that = (FavoriteLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(creationYear, that.creationYear) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationYear, ide);
    }

    @Override
    public String toString() {
        return name + " --- " + creationYear + " --- " + ide;
    }

    @Override
    public int compareTo(FavoriteLanguage favLang) {
        return this.getName().compareTo(favLang.getName());
    }
}
