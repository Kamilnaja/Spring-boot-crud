package com.example.learn.Controllers;

import com.example.learn.Models.Pomodoro;
import com.example.learn.Services.PomodoroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pomodoro")
public class PomodoroController {
    @Autowired
    private PomodoroService pomodoroService;

    public PomodoroController(PomodoroService pomodoroService) {
        this.pomodoroService = pomodoroService;
    }

    @GetMapping()
    private Iterable<Pomodoro> getAll() {
        return pomodoroService.getAll();
    }

    @PostMapping()
    private Iterable<Pomodoro> addItem() {
        return pomodoroService.addItem();
    }
}
