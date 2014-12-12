package puntoventa.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import puntoventa.DB_connection;
import puntoventa.Sale;
import puntoventa.Sale_item;

public class Model_sales {

    //<editor-fold defaultstate="collapsed" desc="getAllSales() aún no Implementado, muy pesado">
    /*
    public static ArrayList<Sale> getAllSales() throws SQLException, ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            ArrayList<Sale> listProducts = null;
            String statment0 = "SELECT * FROM sales;";
            System.out.println(statment0);
            ResultSet res0 = dbconnection0.consulta(statment0);
            
            while(res0.next()){
                listProducts.add(new Sale(res0));
            }
            return listProducts;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    */
//</editor-fold>
    public static Sale getSale(int sale_code) throws SQLException, ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            
            String select0 = "SELECT * FROM sales WHERE sale_code="+sale_code+";";
            ResultSet resSale0=dbconnection0.consulta(select0);
            
            //String select1 = "SELECT * FROM sale_details WHERE sale_code="+sale_code+";";
            String select1="SELECT"
                    + "sale_details.barcode,"
                    + "products.name,"
                    + "sale_details.quantity,"
                    + "sale_details.purchase_price,"
                    + "sale_details.sale_price"
                    + "FROM sale_details JOIN products"
                    + "ON sale_details.barcode=products.barcode"
                    + "WHERE sale_details.sale_code="+sale_code+";";
            ResultSet resItems0=dbconnection0.consulta(select1);
            
            if(resSale0.next()){
                if(resItems0.next()){
                    return new Sale(resSale0,resItems0);
                }else{
                    System.out.println("La venta existe pero no tiene items, eso no debería pasar.");
                    return null;
                }
            }else{
                return null;
            }
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static boolean storeSale(Sale sale0) throws ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            
            //Se elige el máximo "sale_code" para calcular el siguiente
            String select0="SELECT MAX(sale_code) lastsale FROM sales;";
            ResultSet res0=dbconnection0.consulta(select0);
            res0.next();
            int nextSaleCode=res0.getInt("lastsale")+1;
            
            //Se hace el registro de la nueva venta con el nuevo sale_code...
            String insert0="INSERT INTO sales(sale_code,username,time_stamp) VALUES("
                    + " "+nextSaleCode+","
                    + "'"+sale0.username+"',"
                    + "NULL);";
            dbconnection0.consultaModif(insert0);
            
            //... y de los items de la misma.
            String insert1="INSERT INTO sale_details(sale_code,barcode,quantity,purchase_price,sale_price) VALUES";
            for(int i=0;i<sale0.items.size();i++){
                Sale_item sale_item0=sale0.items.get(i);
                insert1+="("+nextSaleCode+",'"
                        +sale_item0.barcode +"',"
                        +sale_item0.quantity+","
                        +sale_item0.purchase_price+","
                        +sale_item0.sale_price+")";
                if(i+1<sale0.items.size()) insert1+=",";
                else insert1+=";";
            }
            dbconnection0.consultaModif(insert1);
            
            return true;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static boolean eraseSale(int sale_code) throws SQLException, ClassNotFoundException{
        try{
            DB_connection dbconnection0 = new DB_connection();
            String delete0="DELETE FROM sale_details WHERE sale_code="+sale_code+";";
            dbconnection0.consultaModif(delete0);
            
            String delete1="DELETE FROM sales WHERE sale_code='"+sale_code+"';";
            dbconnection0.consultaModif(delete1);
            return true;
        }catch(SQLException ex){
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
