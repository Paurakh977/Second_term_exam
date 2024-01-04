package models;
import java.util.Arrays;
public class Tshirt {
    String item_name,brand,description;
    int product_code,price;
    String [] item_size;
//    DEFNING CONSTRUCTORS
        public Tshirt(String item_name,String brand,int product_code,int price,String[] item_size){
            this.item_name=item_name;
            this.brand=brand;

            this.product_code=product_code;
            this.price=price;
            this.item_size=item_size;
        }

    //        GETTERS AND SETTERS FOR THE ATTRIBUTES
    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getItem_size() {
        return item_size;
    }

    public void setItem_size(String[] item_size) {
        this.item_size = item_size;
    }

public  void displayinfo(){

String item_name=this.item_name;
String brand=this.brand;
int price=this.price;
String []size=this.getItem_size();
    System.out.println("Item ---> "+ item_name);
    System.out.println("Brand --->"+brand);
    System.out.println("Sizes availabe"+ Arrays.toString(size));
    System.out.println("\n");
}
}
