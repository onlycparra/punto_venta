package puntoventa;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {
    
    public String barcode="";
    public String name="";
    public int purchase_price=0;
    public int sale_price=0;
    public int bulk_sale=0;

    public Product(String barcode,String name,int purchase_price,int sale_price,int bulk_sale){
        this.barcode=barcode;
        this.name=name;
        this.purchase_price=purchase_price;
        this.sale_price=sale_price;
        this.bulk_sale=bulk_sale;
    }
    public Product(ResultSet res0) throws SQLException{
        this.barcode=res0.getString("barcode");
        this.name=res0.getString("name");
        this.purchase_price=res0.getInt("purchase_price");
        this.sale_price=res0.getInt("sale_price");
        this.bulk_sale=res0.getInt("bulk_sale");
    }
}
