package MiniProject;

public class Item {
    String itemName;
    int quantity;
    double price;

    public Item(String itemName,int quantity,double price){
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
    }
    @Override
    public String toString(){
        return itemName+"[ Quantity: "+quantity+", Price: "+price+", Total: "+getTotal()+" ]";
    }
    public double getTotal(){
        return quantity*price;
    }
}
