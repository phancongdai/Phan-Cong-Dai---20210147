package hust.soict.dsai.aims.disc.DigitalVideoDisc;
//import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id = 0;
    private static int nbDigitalVideoDisc = 0;
  
    public DigitalVideoDisc(String title)
    {
        this.title = title;
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);

    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
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
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String toString(){
        return String.format(". DVD - %-20s - %-20s - %-20s - %-3d: %7f $", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }
}
