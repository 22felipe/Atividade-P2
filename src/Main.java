import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);


        int quantity;

        
        Product n_product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        n_product.name = sc.nextLine();

        System.out.print("Price: ");
        n_product.price= sc.nextDouble();

        System.out.print("Quantity in stock: ");
        n_product.quantity = sc.nextInt();
        System.out.println();

        System.out.println(n_product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity= sc.nextInt();
        n_product.AddProducts(quantity);
        System.out.println();
        System.out.println(n_product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity= sc.nextInt();
        n_product.RemoveProducts(quantity);
        System.out.println();
        System.out.println(n_product);

        sc.close();
    }
}
