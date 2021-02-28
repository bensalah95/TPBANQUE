/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.NoteRpide;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marye
 */
public class NoteRpideDAO {
    
    
    
    public static  List <NoteRpide>getAllNote() throws SQLException{
    List<NoteRpide>memos =new ArrayList<>();
    
        String sql=
"SELECT \n" +
"    n.idnote, n.contenu, n.date , p.idPerson, p.nom, p.prenom,p.login\n" +
"FROM\n" +
"    note n\n" +
"        INNER JOIN\n" +
"    person p ON n.person_idPerson = p.idPerson where p.idPerson=?";        
        Connection con =AccessBd.getConnection();
       Statement st =con.createStatement();
   //     PreparedStatement prepare=con.prepareStatement(sql);
        ResultSet rst=st.executeQuery(sql);
        while(rst.next())
        {
            NoteRpide n =new NoteRpide();
        n.setId(rst.getInt("idnote"));
        n.setContenu(rst.getString("contenu"));
        n.setDateCreation(rst.getDate("date"));
        
        User u =new User();
        
        
        u.setId(rst.getInt("idPerson"));
        u.setNom(rst.getString("nom"));
        u.setPrenom(rst.getString("prenom"));
        u.setLogin(rst.getString("login"));
        
        n.setUser(u);
        memos.add(n);
        }
    return memos;
    }
    
    
     public static  List <NoteRpide>getAllNoteByUser(User p) throws SQLException{
    List<NoteRpide>memos =new ArrayList<>();
    
        String sql=
"SELECT \n" +
"    n.idnote, n.contenu, n.date , p.idPerson, p.nom, p.prenom,p.login\n" +
"FROM\n" +
"    note n\n" +
"        INNER JOIN\n" +
"    person p ON n.person_idPerson = p.idPerson where p.idPerson=?";        
        Connection con =AccessBd.getConnection();
       //Statement st =con.createStatement();
   PreparedStatement prepare=con.prepareStatement(sql);
      prepare.setInt(1, p.getId());
   ResultSet rst=prepare.executeQuery();
        while(rst.next())
        {
            NoteRpide n =new NoteRpide();
        n.setId(rst.getInt("idnote"));
        n.setContenu(rst.getString("contenu"));
        n.setDateCreation(rst.getDate("date"));
        
        User u =new User();
        
        
        u.setId(rst.getInt("idPerson"));
        u.setNom(rst.getString("nom"));
        u.setPrenom(rst.getString("prenom"));
        u.setLogin(rst.getString("login"));
        
        n.setUser(u);
        memos.add(n);
        }
    return memos;
    }
}
