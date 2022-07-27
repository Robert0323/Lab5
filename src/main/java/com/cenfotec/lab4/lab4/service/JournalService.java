package com.cenfotec.lab4.lab4.service;

import com.cenfotec.lab4.lab4.domain.Journal;
import com.cenfotec.lab4.lab4.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class JournalService {
    @Autowired
    JournalRepository journalRepository;
    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }
    public List<Journal> getAll(){
        return journalRepository.findAll();
    }

}
