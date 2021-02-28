package com.Language.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.Language.models.Language;
import com.Language.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;	
	}

	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        }
        else {
            return null;
        }
    }
    
    public Language addLanguage(Language l) {
    	return languageRepository.save(l);
    }
   
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
	public Language updateLanguage(Long id, String name, String creator, String version) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			Language updateLanguage = optionalLanguage.get();
			updateLanguage.setName(name);
			updateLanguage.setCreator(creator);
			updateLanguage.setCurrentVersion(version);
			
			return languageRepository.save(updateLanguage);
		} else {
			return null;
		}
	}

}
