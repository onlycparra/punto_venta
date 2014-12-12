/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

import java.sql.SQLException;


public class PuntoVenta {
    
    public static DB_connection db_con0;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //SOLO PARA PRUEBAS
        //WindowOutput venta = new WindowOutput();
        //venta.setVisible(true);
        //FIN SOLO PARA PRUEBAS
        db_con0=new DB_connection();
        WindowLogin login=new WindowLogin("");
        login.setVisible(true);
    }
    
}
