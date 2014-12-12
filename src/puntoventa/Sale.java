package puntoventa;

//import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Sale {
    public int sale_code=0;
    public String username="";
    public String name;
    public String date="";
    //public Date date="";
    public ArrayList<Sale_item> items=new ArrayList<>();
    
    public Sale(){
        
    }
    public Sale(String username,String date,ArrayList<Sale_item> items){
        this.username=username;
        this.date=date;
        this.items=items;
    }
    public Sale(ResultSet resSale0,ResultSet resItems0) throws SQLException{
        this.sale_code=resSale0.getInt("sale_code");
        this.username=resSale0.getString("username");
        this.date=resSale0.getString("time_stamp");
        //this.date=resSale0.getDate("time_stamp");
        while(resItems0.next()){
            Sale_item item0=new Sale_item(resItems0);
            this.items.add(item0);
        }
    }
    public boolean addItem(Sale_item item0){
        boolean added=false;
        
        for (Sale_item item : items) {
            if (item.barcode.equals(item0.barcode)) {
                item.quantity += 1;
                added=true;
            }
        }
        if(!added){
            items.add(item0);
            added=true;
        }
        return added;
    }
    public boolean removeItem(String barcode){
        for(int i=0;i<items.size();i++){
            if(items.get(i).barcode.equals(barcode)){
                if(items.get(i).quantity>1) items.get(i).quantity-=1;
                else items.remove(i);
                return true;
            }
        }
        return false;
    }
    public int getTotal(){
        int total=0;
        for(Sale_item item:items){
            total=total+item.quantity*item.sale_price;
        }
        return total;
    }
}
