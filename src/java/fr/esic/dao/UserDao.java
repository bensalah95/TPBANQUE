 package fr.esic.dao;
import fr.esic.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
   
    public static User getByLoginAndPassword(String login,String password) throws SQLException{
    
   User u=null;
   String sql="select * from person where login=? and pwd=?";
        Connection conn=AccessBd.getConnection();
   
        PreparedStatement prepare=conn.prepareStatement(sql);
        prepare.setString(1,login);
        prepare.setString(2,password);
        ResultSet rs=prepare.executeQuery();
   
        
        if (rs.next()){
        u =new User();
        u.setId(rs.getInt("idPerson"));
        u.setNom(rs.getString("nom"));
        u.setPrenom(rs.getString("prenom"));
        u.setLogin(rs.getString("login"));
        u.setPassword(rs.getString("pwd"));
        
        }
        
        
   return u;
    }
  
    
    public static void insertPerson(User u)throws SQLException{
        String sql ="insert into person(nom,prenom,login,pwd) values(?,?,?,?)";
    Connection connexion=AccessBd.getConnection();
    PreparedStatement prepare =connexion.prepareCall(sql);
    prepare.setString(1, u.getNom());
    prepare.setString(2, u.getPrenom());
    prepare.setString(3, u.getLogin());
    prepare.setString(4, u.getPassword());
    prepare.execute();
    }

    
    
    
      public static List<User> getAll() throws SQLException{
     List <User> users=new ArrayList<>();
     String sql="select * from person ";
      
      Connection connexion=AccessBd.getConnection();
        Statement ST=connexion.createStatement();
        ResultSet rs=ST.executeQuery(sql);
   
        
        while(rs.next()){
        User  u =new User();
        u.setId(rs.getInt("idPerson"));
        u.setPrenom(rs.getString("nom"));
        u.setNom(rs.getString("prenom"));
        u.setLogin(rs.getString("login"));
        
        users.add(u);
        }
        return users ;
        }


}
      
        
        

  
