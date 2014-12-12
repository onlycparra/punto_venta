package puntoventa;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    public String username="";
    public String name="";
    public String pass="";
    public int level=0;

    public User(String username,String name,String pass,int level){
        this.username=username;
        this.name=name;
        this.pass=pass;
        this.level=level;
    }
    public User(ResultSet res0) throws SQLException{
        this.username=res0.getString("username");
        this.name=res0.getString("name");
        this.pass=res0.getString("pass");
        this.level=res0.getInt("level");
    }
}
