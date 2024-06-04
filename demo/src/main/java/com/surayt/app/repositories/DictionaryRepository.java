package com.surayt.app.repositories;

import com.surayt.app.model.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {
    Optional<Dictionary> findByEnglishWord(String englishWord);


}
