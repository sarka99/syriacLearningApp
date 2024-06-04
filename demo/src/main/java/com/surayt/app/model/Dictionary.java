package com.surayt.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Dictionary {
    @Id
    private Long id;
    private String assyrianWord;
    private String englishWord;

    @Override
    public String toString() {
        return "Dictionary{" +
                "id=" + id +
                ", assyrian_word='" + assyrianWord + '\'' +
                ", english_word='" + englishWord + '\'' +
                ", synonyms="  +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAssyrianWord(String assyrian_word) {
        this.assyrianWord = assyrian_word;
    }

    public void setEnglishWord(String english_word) {
        this.englishWord = english_word;
    }

    public Dictionary() {
    }

    public Long getId() {
        return id;
    }

    public String getAssyrianWord() {
        return assyrianWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

}
