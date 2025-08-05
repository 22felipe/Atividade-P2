public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueStock(){
        return this.price *this.quantity;
    }

    public void addProducts (int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {

        return  "Update data : " + this.name + ", $ " + String.format("%.2f", price) + ", " + this.quantity + " units, Total: $ " + String.format("%.2f", totalValueStock());

    }


}
