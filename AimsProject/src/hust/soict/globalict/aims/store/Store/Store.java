package hust.soict.globalict.aims.store.Store;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import hust.soict.globalict.media.DigitalVideoDisc;
import hust.soict.globalict.media.Media;
public class Store {

	ArrayList<Media> numberItems = new ArrayList<Media>();
    //private static int numberItem = 0;
    //
    public void addMedia(Media media){
        for(Media item : numberItems){
            if(item.equals(media)) {
                System.out.println("Media already existed !");
                return;
            }
        }
        numberItems.add(media);
        System.out.println("The media has been added");
    }
    public void removeMedia(Media media){
        for(Media item : numberItems){
            if(item.equals(media)){
                numberItems.remove(media);
                System.out.println("The media has removed from store successfully !");
                return;
            }
        }
        numberItems.remove(media);
        System.out.println("Can't find that media!");
    }
     public void display(){
        System.out.println("*************** Store ***************");
        for(Media item : numberItems) System.out.println(item.toString());
    }

    public Media search(String title, String category, float cost) {
        //Media mediaSearch = new Media(title,category,cost);
        for(Media m : numberItems) {
            if(m.getTitle().equals(title)&&m.getCategory().equals(category)&&m.getCost()==cost) {
                System.out.println("This media is found in store");
                return m;
            }
        } return null;
    }
    public Media searchMediaByName(String title) {
        for(Media x:numberItems) {
            if(x.getTitle().equals(title)) {
                System.out.println("The media is found");
            }
            return x;
        }
        return null;
        
    }
    public ArrayList<Media> getItemsInStore() {
        return null;
    }
}
