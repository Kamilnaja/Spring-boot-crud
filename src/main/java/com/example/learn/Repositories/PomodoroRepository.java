package com.example.learn.Repositories;

import com.example.learn.Models.Pomodoro;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PomodoroRepository extends CrudRepository<Pomodoro, Long> {
    Optional<Pomodoro> findById(Long id);
}
