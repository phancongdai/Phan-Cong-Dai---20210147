package hust.soict.globalict.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.media.Track;

public class CompactDisc extends Disc implements Playable {   
    private String artist;
    private List<Track>tracks = new ArrayList<Track>();
    
    public String getArtist() {
        return artist;
    }
    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }
    public CompactDisc( String title, String category, float cost, String artist, String director) {
        super(title, category, cost, director);
        this.artist = artist;
    }
    public void addTrack(Track track) {
        for(Track x: tracks) {
            if(x.equals(track)) {
                System.out.println("Track already existed!");      
            }
        }
        tracks.add(track);
    }
    public void removeTrack(Track track) {
         for(Track x: tracks) {
            if(x.equals(track)) {
                tracks.remove(x);      
            }
        }
    }
    public int getLength() {
        int num = 0;
        for(Track x:tracks) {
            num += x.getLength();
        }
        return num;
    }
    public void play() {
        for(Track track : tracks) track.play();
    }
        public String toString() {
        return "CD " + this.getTitle() + " - " + this.getCategory() + (this.getDirector() != null ? " - " + this.getDirector() : "") + (this.getArtist() != null ? " - " + this.getArtist() : "") + (this.getLength() > 0 ? " - " + this.getLength() : "") + ": " + this.getCost() + "$";
        }
}
