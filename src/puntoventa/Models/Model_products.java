package puntoventa.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import puntoventa.DB_connection;
import puntoventa.Product;

public class Model_products {
    public static ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            ArrayList<Product> listProducts=new ArrayList<>();
            String statment0 = "SELECT * FROM products ORDER BY name;";
            ResultSet res0 = dbconnection0.consulta(statment0);
            
            while(res0.next()){
                listProducts.add(new Product(res0));
            }
            return listProducts;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static Product getProduct(String barcode) throws SQLException, ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            String statment0 = "SELECT * FROM products WHERE barcode='"+barcode+"';";
            ResultSet res0=dbconnection0.consulta(statment0);
            if(res0.next()) return new Product(res0);
            else return null;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static int storeProduct(Product product0){//0 error, 1 inserted, 2 updated
        try{
            DB_connection dbconnection0 = new DB_connection();
            Product auxUser=getProduct(product0.barcode);
            if(auxUser==null){//insert process
                String insert0="INSERT INTO products(barcode,name,purchase_price,sale_price,bulk_sale) VALUES("
                        + "'"+product0.barcode+"',"
                        + "'"+product0.name+"',"
                        + ""+product0.purchase_price+","
                        + ""+product0.sale_price+","
                        + ""+product0.bulk_sale+");";
                dbconnection0.consultaModif(insert0);
                return 1;
            }else{//update process
                String update0 = "UPDATE products SET "
                        + "name='"+product0.name+"',"
                        + "purchase_price=" +product0.purchase_price+","
                        + "sale_price=" +product0.sale_price+","
                        + "bulk_sale=" + product0.bulk_sale+" "
                        + "WHERE barcode='" +product0.barcode+"';";
                dbconnection0.consultaModif(update0);
                return 2;
            }

        }catch(SQLException | ClassNotFoundException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    public static boolean eraseProduct(String barcode) throws SQLException, ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            String select0="SELECT * FROM sale_details WHERE barcode='"+barcode+"';";
            ResultSet res0=dbconnection0.consulta(select0);
            if(res0.next()) return false;    
            String delete0="DELETE FROM products WHERE barcode='"+barcode+"';";
            dbconnection0.consultaModif(delete0);
            return true;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
