import models.Order;
import models.Tshirt;

public class main {
    public static void main(String[] args) {
//        Constructor for first object
        Tshirt item_1=new Tshirt("Shoes","Nike",1,2000,new String[] {"XL","XXL","XXXL"});
        String description_item_1="A blood red stripes with snowy white sparkles that gives you feet comfort.";
//        setting the description of the product
        item_1.setDescription(description_item_1);
//        constructor for second object and setting description
        Tshirt item_2=new Tshirt("Pant","Levis",2,1800,new String[] {"XXL","XXXL"});
        String description_item_2="As Comfy as you feel like a living sofa ";
        item_2.setDescription(description_item_2);

//        ready to set orders
        Order order_user_1=new Order("Ram",98101892,7000,new Tshirt[]{item_1,item_2});

        item_1.displayinfo();
        order_user_1.billing();


    }
}
