package hust.soict.globalict.aims.cart;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.media.DigitalVideoDisc;
import hust.soict.globalict.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	public static final int MAX_NUMBERS_ORDERED = 20;
    public void addMedia(Media media){
        if(itemsOrdered.size()==MAX_NUMBERS_ORDERED) System.out.println("Cart is full");
        else{
            for(Media x: itemsOrdered) {
                if(x.equals(media)) {
                System.out.println("Media already existed"); return;
                }
            }
            itemsOrdered.add(media);

        }
    }
    public void removeMedia(Media media){
        if(itemsOrdered.size()==0) System.out.println("Can't remove media. Cart is empty");
        else {
            for(Media x: itemsOrdered) {
                if(x.equals(media)) {
                    itemsOrdered.remove(media); return;
                }
                System.out.println("Media doesn't exist in cart");
            }
        }
    }
    public float totalCost(){
        float sum = 0;
        for(Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }
    public int numberOfMedia() {
        return itemsOrdered.size();
    }
    public void print()
    {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i=0; i<itemsOrdered.size(); i++)
        {
            int k=i+1;
            System.out.println(k + itemsOrdered.get(i).toString());
        }   
        System.out.println("Total cost is: "+ this.totalCost());
        System.out.println("***********************CART***********************");

    }
     public Media searchMediaByName(String titl) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of media?");
        titl= sc.nextLine();
        for(Media x: itemsOrdered) {
            if(x.getTitle().equals(titl)) return x;
        }
        return null;
    }
    public ObservableList<Media> getItemsOrder() {
        return itemsOrdered;
    }
}
