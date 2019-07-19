package com.company.sakila.sakila.sakila.film_category.generated;

import com.company.sakila.sakila.sakila.category.Category;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film_category.FilmCategory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.sakila.sakila.film_category.FilmCategory}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmCategoryImpl implements FilmCategory {
    
    private int filmId;
    private short categoryId;
    private Timestamp lastUpdate;
    
    protected GeneratedFilmCategoryImpl() {}
    
    @Override
    public int getFilmId() {
        return filmId;
    }
    
    @Override
    public short getCategoryId() {
        return categoryId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public FilmCategory setFilmId(int filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public FilmCategory setCategoryId(short categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    
    @Override
    public FilmCategory setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Film findFilmId(Manager<Film> foreignManager) {
        return foreignManager.stream().filter(Film.FILM_ID.equal(getFilmId())).findAny().orElse(null);
    }
    
    @Override
    public Category findCategoryId(Manager<Category> foreignManager) {
        return foreignManager.stream().filter(Category.CATEGORY_ID.equal(getCategoryId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("filmId = "     + Objects.toString(getFilmId()));
        sj.add("categoryId = " + Objects.toString(getCategoryId()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "FilmCategoryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof FilmCategory)) { return false; }
        final FilmCategory thatFilmCategory = (FilmCategory)that;
        if (this.getFilmId() != thatFilmCategory.getFilmId()) { return false; }
        if (this.getCategoryId() != thatFilmCategory.getCategoryId()) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatFilmCategory.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getFilmId());
        hash = 31 * hash + Short.hashCode(getCategoryId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}