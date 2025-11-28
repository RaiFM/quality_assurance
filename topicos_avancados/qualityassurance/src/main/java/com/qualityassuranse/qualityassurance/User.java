/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;



/**
 *
 * @author olgac
 */
@Entity(name="users")
@Table(name="users")
public class User {

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return this.rule == other.rule;
    }

    public User(Long id, String nome, Rule rule) {
        this.id = id;
        this.nome = nome;
        this.rule = rule;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     Long id;
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private Rule rule;
    
    public User() {}
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Rule getRule() {
        return rule;
    }
}

