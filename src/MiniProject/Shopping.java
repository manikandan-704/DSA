package MiniProject;

import java.util.LinkedList;
import java.util.Scanner;

public class Shopping {
    static void main(String[] args) {
        LinkedList<Item> cart = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
    while (true){
        System.out.println("Menu to Shop");
        System.out.println("Select the Choice");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item");
        System.out.println("4. View First Item");
        System.out.println("5. View Last Item");
        System.out.println("6. Clear All Item");
        System.out.println("7. View All Items and Total Bill");
        System.out.println("8. Exit");
        System.out.println("Enter the Choice:");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            // Add Item to the Cart
            case 1:
                System.out.println("Enter the Item Name: ");
                String itemName = sc.nextLine();
                System.out.println("Enter the Quantity: ");
                int itemQuantity=sc.nextInt();
                System.out.println("Enter the Price: ");
                double itemPrice=sc.nextDouble();
                sc.nextLine();
                cart.add(new Item(itemName,itemQuantity,itemPrice));
                System.out.println(itemName + " added Successfully");
                break;

            // Remove Item form the Cart
            case 2:
                if (!cart.isEmpty()) {
                    System.out.println("Enter the Item Name to remove: ");
                    String ItemToRemove = sc.nextLine();
                    boolean isRemoved=cart.removeIf(item ->item.itemName.equalsIgnoreCase(ItemToRemove));
                    if(isRemoved){
                        System.out.println(ItemToRemove +" Removed form the cart");
                    }
                    else{
                        System.out.println(ItemToRemove+" is not found");
                    }
                } else {
                    System.out.println("Cart is empty");
                }
                break;

            // Update Item
            case 3:
                if(!cart.isEmpty()){
                    System.out.println("Enter the Item Name to update: ");
                    String updateItem=sc.nextLine();
                    boolean isFound=false;
                    for(Item item:cart){
                        if(item.itemName.equalsIgnoreCase(updateItem)) {
                            System.out.println("Enter the quantity to update: ");
                            item.quantity = sc.nextInt();
                            System.out.println("Enter the price to update: ");
                            item.price = sc.nextDouble();
                            isFound = true;
                            break;
                        }
                    }
                    if(isFound){
                        System.out.println(updateItem+" Updated Successfully");
                    }
                    else{
                        System.out.println("Item not found");
                    }
                }
                else{
                    System.out.println("Cart is Empty.");
                }
                break;

            // Get First Added Item
            case 4:
                if(!cart.isEmpty()) {
                    System.out.println("First item is: " + cart.getFirst());
                }
                else{
                    System.out.println("Cart is Empty.");
                }
                break;

            // Get the Lat Added Item
            case 5:
                if(!cart.isEmpty()) {
                    System.out.println("Last item is: " + cart.getLast());
                }
                else{
                    System.out.println("Cart is Empty.");
                }
                break;

            // Clear the Cart
            case 6:
                if(cart.isEmpty()){
                    System.out.println("Cart is Already Empty.");
                }
                else {
                    cart.clear();
                    System.out.println("Cart is Empty now");
                }
                break;

            // Item List and Total Bill
            case 7:
                if(!cart.isEmpty()) {
                    double Total = 0;
                    System.out.println("Items list: " + cart);
                    for (Item item : cart) {
                        Total += item.getTotal();
                    }
                    System.out.println("Total Bill: " + Total);
                }
                else{
                    System.out.println("Cart is Empty.");
                }
                break;

            // Exit
            case 8:
                System.out.println("Thank You For Shopping");
                sc.close();
                return;

            // Invalid Choice
            default:
                System.out.println("invalid choice");
        }
    }
    }
}
