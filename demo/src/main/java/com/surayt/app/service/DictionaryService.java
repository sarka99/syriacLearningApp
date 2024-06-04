package com.surayt.app.service;

import com.surayt.app.model.Dictionary;
import com.surayt.app.repositories.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DictionaryService {
    @Autowired
    private DictionaryRepository dictionaryRepository;
    public List<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }
    public Optional<Dictionary> findByEnglishWord(String englishWord) {
        return dictionaryRepository.findByEnglishWord(englishWord);
    }
}
