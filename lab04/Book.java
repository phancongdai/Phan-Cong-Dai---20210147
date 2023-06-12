package hust.soict.dsai.media;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private  List<String> authors = new ArrayList<String>();
    
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    } 
     public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public static void main(String arg[]) {

        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
//     public String getTitle() {
//         return title;
//     }
//     public void setTitle(String title) {
//         this.title = title;
//     }
//     public String getCategory() {
//         return category;
//     }
//     public void setCategory(String category) {
//         this.category = category;
//     }
//     public float getCost() {
//         return cost;
//     }
//     public void setCost(float cost) {
//         this.cost = cost;
//     }
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author) {
        for(String x : authors) {
            if(x.equals(author))
            System.out.println("This book already existed!");
            return;
        }
        authors.add(author);
        System.out.println("Add author successfully");
    }
    public void removeAuthor(String author) {
        for(String x : authors) {
            if(x.equals(author)) 
            //authors.remove(String.valueOf(x));
            authors.remove(x);
            System.out.println("Remove author successfully");
        }
    }
     public String toString() {
        return "Book - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + "$";
    }
}
