public class Product {
    String name;
    float price;
    int qty;
    int id;
    public Product(){
        name="DVD Sample KSHMR";
        price=130000;
        qty=10;
        id=1;
    }
    public String getName(){
        return name;
    }
    public float setPrice(){
        return price;
    }
    public int setQty(){
        return qty;
    }
    public int getId(){
        return id;
    }
    public static void main(String[] args){
        Product product=new Product();
        System.out.println("Name: "+product.getName());
        System.out.println("Price: "+product.setPrice());
        System.out.println("Quantity: "+product.setQty());
        System.out.println("ID: "+product.getId());
    }
}
