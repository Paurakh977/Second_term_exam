package models;

public class Order {
    String name;
    public Tshirt[] tshirt;
    int ph_nmbr;
    int price;
        int[] item_code;

    public Tshirt[] getTshirt() {
        return tshirt;
    }

    public void setTshirt(Tshirt[] tshirt) {
        this.tshirt = tshirt;
    }

    public void setItem_code(int[] item_code) {
        this.item_code = item_code;
    }

    //        DEFINING CONOTRUCTOR
        public Order(String name,int ph_nmbr,int price,Tshirt[] tshirt){
            this.name=name;
            this.ph_nmbr=ph_nmbr;
            this.price=price;
            this.tshirt=tshirt;
        }

//        GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPh_nmbr() {
        return ph_nmbr;
    }

    public void setPh_nmbr(int ph_nmbr) {
        this.ph_nmbr = ph_nmbr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int[] getItem_code() {
        return item_code;
    }
    public void billing(){
        String name=this.getName();
        int ph_nmbr=this.getPh_nmbr();
        Tshirt[] tshirts = this.getTshirt();
        String [] items_names= new String[tshirts.length];
        for (int i = 0; i < tshirts.length; i++) {
            items_names[i] = tshirts[i].getItem_name();
        }
        int [] item_prices= new int[tshirts.length];
        for (int i = 0; i < tshirts.length; i++) {
            item_prices[i]=tshirts[i].getPrice();
        }
        int total=0;
        for (int i = 0; i < item_prices.length ; i++) {
            total+=item_prices[i];
        }
        String[] brands = new String[tshirts.length];
        for (int i = 0; i < tshirts.length; i++) {
            brands[i] = tshirts[i].getBrand();
        }
        int paid=this.getPrice();
        for (int i = 0; i < tshirt.length; i++) {
            System.out.println("Brand ----->"+brands[i]);
            System.out.println("Customer name ------>"+name);
            System.out.println("Customer Ph_number"+ph_nmbr);
            System.out.println("item ----->"+items_names[i]);
            System.out.println("Item Price ----->"+item_prices[i]);
            System.out.println("\n");
        }
        double grand_total=total+total*0.13;
        System.out.println("YOUr total including 13% VAT ------>"+grand_total);
        if (this.getPrice() > grand_total) {
            int cash_in = this.getPrice();
            System.out.println("Price returned ----> " + (this.getPrice() - grand_total));
        }
        if (!(this.getPrice() >= grand_total)) {
            System.out.println("Insufficient balance");
        }

    }

}
