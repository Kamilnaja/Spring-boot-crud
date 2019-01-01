package com.example.learn.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pomodoro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date date;

    public Pomodoro(Date date) {
        this.date = date;
    }

    public Pomodoro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
