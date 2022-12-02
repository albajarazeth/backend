package com.example.practicedemo.formAPI.model;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Model {

    private int id;
    private String title;
    private String dueDate;
    private String done;
    private LocalDate doneDate;
    private LocalDate creationDate;
    private String priority;

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);

    public Model() {
    }

    public Model(int id, String title, String dueDate, String done, LocalDate doneDate, LocalDate creationDate, String priority) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.done = done;
        this.doneDate = doneDate;
        this.creationDate = creationDate;
        this.priority = priority;
    }

    public void setAtomicId() {
        this.id = ID_GENERATOR.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public LocalDate getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(LocalDate doneDate) {
        this.doneDate = doneDate;
    }

    public void setLocalDate(){
        LocalDate localeDate = LocalDate.now();
        this.creationDate = localeDate;
    }
    public void setLocalDateDone(){
        LocalDate localeDate = LocalDate.now();
        this.doneDate= localeDate;
    };

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
