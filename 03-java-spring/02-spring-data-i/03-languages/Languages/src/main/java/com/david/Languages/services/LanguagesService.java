package com.david.Languages.services;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.persistence.Table;
import org.springframework.stereotype.Service;

import com.david.Languages.models.Lang;
import com.david.Languages.repositories.LanguageRepository;

@Service
public class LanguagesService {
	private final LanguageRepository languageRepository;
	
	public LanguagesService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	public Lang getOneName(Long id) {
		return this.languageRepository.findById(id).orElse(null);
	}
	public Lang createNewLanguage(String name, String creator, int version) {
		Lang newLang = new Lang(name, creator, version);
		return this.languageRepository.save(newLang);
	}
	public Lang createLang(Lang newLang) {
		return this.languageRepository.save(newLang);
	}
	public List<Lang> allLanguages(){
		return this.languageRepository.findAll();
	}
	public Lang findLang(Long id) {
		Optional<Lang> optionalLang = languageRepository.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        } else {
            return null;
        }
	}
    public void deleteById(Long id, Lang lang) {
    	languageRepository.deleteById(id);
    }
}

