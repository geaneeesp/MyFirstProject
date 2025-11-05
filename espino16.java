import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item: ");
        String item = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        // === Part B: Calculate total ===
        double total = price * quantity;

        // === Part C: Write to file ===
        FileWriter writer = new FileWriter("receipt.txt");
        writer.write("===== Shopping Receipt =====\n");
        writer.write("Item: " + item + "\n");
        writer.write("Price: $" + price + "\n");
        writer.write("Quantity: " + quantity + "\n");
        writer.write("---------------------------\n");
        writer.write("Total: $" + total + "\n");
        writer.write("============================\n");

        writer.close();
        System.out.println("Receipt saved!");
    }
}


