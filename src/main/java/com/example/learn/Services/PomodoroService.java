package com.example.learn.Services;

import com.example.learn.Models.Pomodoro;
import com.example.learn.Repositories.PomodoroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PomodoroService {
    @Autowired
    private PomodoroRepository pomodoroRepository;

    public Iterable<Pomodoro> getAll() {
        return pomodoroRepository.findAll();
    }

    public Iterable<Pomodoro> addItem() {
        pomodoroRepository.save(new Pomodoro(new Date()));
        return pomodoroRepository.findAll();
    }
}
