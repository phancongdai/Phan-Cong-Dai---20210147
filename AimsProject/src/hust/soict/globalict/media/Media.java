package hust.soict.globalict.media;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(String title) {
        this.title = title;

    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public static void main(String arg[]) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        CompactDisc cd = new CompactDisc("Hello", "Ballad", 5f);
        Book book = new Book("Jungle", "Alan Kay", 12f);

        List<Media> media = new ArrayList<Media>();
        media.add(dvd);
        media.add(cd);
        media.add(book);

        for(Media item : media) {
            System.out.println(item.toString());
        }      
    }
    
}
