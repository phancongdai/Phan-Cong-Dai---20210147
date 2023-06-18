package hust.soict.globalict.aims.cart.Cart;
import java.util.ArrayList;

import hust.soict.globalict.media.DigitalVideoDisc;
import hust.soict.globalict.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

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
}
