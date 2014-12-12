package puntoventa.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import puntoventa.DB_connection;
import puntoventa.User;

public class Model_users {
    public static ArrayList<User> getAllUsers() throws SQLException, ClassNotFoundException{
        try{
            DB_connection db_con0 = new DB_connection();
            ArrayList<User> listUsers = new ArrayList<>();
            String statment0 = "SELECT * FROM users;";
            ResultSet res0 = db_con0.consulta(statment0);
            
            while(res0.next()){
                listUsers.add(new User(res0));
            }
            return listUsers;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static User getUser(String username) throws SQLException, ClassNotFoundException{
        try{
            DB_connection db_con0 = new DB_connection();
            String statment0 = "SELECT * FROM users WHERE username='"+username+"';";
            ResultSet res0=db_con0.consulta(statment0);
            if(res0.next()) return new User(res0);
            else return null;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static int storeUser(User user0){//0 error, 1 inserted, 2 updated
        try{
            DB_connection do_con0 = new DB_connection();
            User auxUser=getUser(user0.username);
            if(auxUser==null){//insert process
                String insert0="INSERT INTO users(username,name,pass,level) VALUES('"+user0.username+"','"+user0.name+"','"+user0.pass+"',"+user0.level+");";
                do_con0.consultaModif(insert0);
                return 1;
            }else{//update process
                String update0 = "UPDATE users SET name='"+user0.name+"',pass='" + user0.pass + "',level=" + user0.level + " WHERE username='" +user0.username + "';";
                do_con0.consultaModif(update0);
                return 2;
            }

        }catch(SQLException | ClassNotFoundException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    public static boolean eraseUser(String username) throws SQLException, ClassNotFoundException{
        try{
            DB_connection db_con0 = new DB_connection();
            String delete0="DELETE FROM users WHERE username='"+username+"';";
            db_con0.consultaModif(delete0);
            return true;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
