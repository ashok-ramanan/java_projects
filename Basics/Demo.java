package Basics;

class Mobile{
    private String brand;
    private String model;
    int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile iphone = new Mobile();
        iphone.display();
        iphone.setBrand("Apple");
        iphone.setModel("iPhone 14");
        iphone.setPrice(999);
//        Mobile samsung = new Mobile("Samsung", "Galaxy S23", 799);

        iphone.display();
//        samsung.display();
        System.out.println(iphone.getModel());  //Private fields can be accessed through public methods
        System.out.println(iphone.price);   // Direct access to public field

    }
}
