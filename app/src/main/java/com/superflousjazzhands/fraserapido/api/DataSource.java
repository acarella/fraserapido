package com.superflousjazzhands.fraserapido.api;

import com.superflousjazzhands.fraserapido.api.model.Category;
import com.superflousjazzhands.fraserapido.api.model.Frase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antoniocarella on 11/11/15.
 */
public class DataSource {

    private List<Frase> frases;
    private List<Category> categories;

    public DataSource(){
        frases = new ArrayList<Frase>();
        categories = new ArrayList<Category>();
        createFakeData();
    }

    public List<Frase> getFrases(){
        return frases;
    }
    public List<Category> getCategories() {return categories;}

    void createFakeData(){
        categories.add(new Category("Dinheiro", 1));
        categories.add(new Category("Tempo", 2));
        frases.add(new Frase("How much does it cost?", "Quanto custa?", false));
        frases.add(new Frase("How long will it take?", "Quanto tempo vai demorar?", false));
    }
}
