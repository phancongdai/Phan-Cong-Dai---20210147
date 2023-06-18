package hust.soict.globalict.aims.store.Store;
import java.util.ArrayList;

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
}
