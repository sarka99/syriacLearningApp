package com.surayt.app.controller;

import com.surayt.app.model.Dictionary;
import com.surayt.app.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@RestController

public class DirectoryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/word/{englishWord}")
    public ResponseEntity<Optional<Dictionary>> getAssyrianWord(@PathVariable String englishWord) {
        Optional<Dictionary> dictionaryEntry = dictionaryService.findByEnglishWord(englishWord);
        if (dictionaryEntry.isPresent()) {
            return ResponseEntity.ok(dictionaryEntry);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
