package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.services.WorkDayRepository;
import com.example.demo.entities.SignWorkDayEntity;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    WorkDayRepository workDayRepository;

    @GetMapping("/notes")
    public List<SignWorkDayEntity> getAllNotes() {
        return workDayRepository.findAll();
    }
}
