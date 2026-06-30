package MiniProject;

import java.util.LinkedList;
import java.util.Scanner;

public class Shopping {
    static void main(String[] args) {
        LinkedList<String> cart = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
    while (true){
        System.out.println("Menu to Shop");
        System.out.println("Select the Choice");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View First Item");
        System.out.println("4. View Last Item");
        System.out.println("5. View All Items");
        System.out.println("6. Exit");
        System.out.println("Enter the Choice:");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter the item to add:");
                String ItemToAdd = sc.nextLine();
                cart.add(ItemToAdd);
                System.out.println(ItemToAdd + " added Successfully");
                break;

            case 2:
                System.out.println("Enter the Item Name to remove: ");
                String ItemToRemove = sc.nextLine();
                if (!cart.isEmpty()) {
                    cart.remove(ItemToRemove);
                    System.out.println(ItemToRemove + " Removed Successfully");
                } else {
                    System.out.println("Cart is empty");
                }
                break;

            case 3:
                System.out.println("First item is: "+cart.getFirst());
                break;

            case 4:
                System.out.println("Last item is: "+cart.getLast());
                break;

            case 5:
                System.out.println("Items list: "+cart);
                break;

            case 6:
                System.out.println("Thank You For Shopping");
                sc.close();
                return;

            default:
                System.out.println("invalid choice");
        }
    }
    }
}
