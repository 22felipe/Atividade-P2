public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueStock(){
        return this.price *this.quantity;
    }

    public void AddProducts (int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }


    public String toString() {

        return  "Update data : " + this.name + ", $ " + String.format("%.2f", price) + ", " + this.quantity + " units, Total: $ " + String.format("%.2f", TotalValueStock());

    }

    /*
    public void UpdateData (){
        System.out.println("Update data : "
                + this.name + ", $ "
                + String.format("%.2f", price)
                + ", " + this.quantity
                + " units, Total: $ "
                + String.format("%.2f", TotalValueStock()) );
    }*/

}
