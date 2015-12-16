package com.superflousjazzhands.fraserapido.api.model;

/**
 * Created by antoniocarella on 11/11/15.
 */
public class Frase {
    String englishPhrase;
    String portugueseFrase;
    Boolean favorite;

    public Frase(String englishPhrase, String portugueseFrase, Boolean favorite) {
        this.englishPhrase = englishPhrase;
        this.portugueseFrase = portugueseFrase;
        this.favorite = favorite;
    }

    public String getEnglishPhrase() {
        return englishPhrase;
    }

    public String getPortugueseFrase() {
        return portugueseFrase;
    }

    public Boolean getFavorite() {
        return favorite;
    }
}
