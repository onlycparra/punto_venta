package puntoventa;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sale_item {
    public String barcode="";
    public String name="";
    public int quantity=0;
    public int purchase_price=0;
    public int sale_price=0;

    public Sale_item(Product prod0){
        this.barcode=prod0.barcode;
        this.name=prod0.name;
        this.quantity=1;
        this.purchase_price=prod0.purchase_price;
        this.sale_price=prod0.sale_price;
    }
    public Sale_item(String barcode,String name,int quantity,int purchase_price,int sale_price){
        this.barcode=barcode;
        this.name=name;
        this.quantity=quantity;
        this.purchase_price=purchase_price;
        this.sale_price=sale_price;
    }
    public Sale_item(ResultSet res0) throws SQLException{
        this.barcode=res0.getString("barcode");
        this.name=res0.getString("name");
        this.quantity=res0.getInt("quantity");
        this.purchase_price=res0.getInt("purchase_price");
        this.sale_price=res0.getInt("sale_price");
    }
}
