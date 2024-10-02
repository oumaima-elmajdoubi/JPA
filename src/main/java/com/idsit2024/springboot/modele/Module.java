package com.idsit2024.springboot.modele;
import com.idsit2024.springboot.controller.HelloController;
import org.springframework.boot.SpringApplication;


public class Module {
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
    private int id;
    private String nom;
    private String description;

    public Module() {
    }

    public Module(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}