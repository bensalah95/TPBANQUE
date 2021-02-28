/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

import java.util.Date;

/**
 *
 * @author marye
 */
public class NoteRpide {
    private int id;
    private String contenu;
    private Date dateCreation;
    private User user;

    public NoteRpide() {
    }

    public NoteRpide(int id, String contenu, Date dateCreation, User user) {
        this.id = id;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    
    
    
    
    
}
