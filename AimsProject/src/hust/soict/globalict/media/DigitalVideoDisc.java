package hust.soict.globalict.media;
//import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
public class DigitalVideoDisc extends Disc implements Playable {
	
    private int id = 0;
    private static int nbDigitalVideoDisc = 0;
  
    public DigitalVideoDisc(String title) {
        super(title);
        // nbDigitalVideoDisc++;
        // this.setId(nbDigitalVideoDisc);
        
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        // nbDigitalVideoDisc++;
        // this.setId(nbDigitalVideoDisc);
        
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
        // nbDigitalVideoDisc++;
        // this.setId(nbDigitalVideoDisc);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
        // nbDigitalVideoDisc++;
        // this.setId(nbDigitalVideoDisc);
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
     public String toString() {
        return "DVD " + this.getTitle() + " - " + this.getCategory() + (this.getDirector() != null ? " - " + this.getDirector() : "") + (this.getLength() > 0 ? " - " + this.getLength() : "") + ": " + this.getCost() + "$";
    }   
    // public static void main(String arg[]) {
    //     DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    //     System.out.println(dvd.toString());
    // }
}
