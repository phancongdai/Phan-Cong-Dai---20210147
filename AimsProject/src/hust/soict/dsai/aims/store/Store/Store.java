package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {

	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[10000];
    private static int numberItem = 0;
    //
    public void addDVD(DigitalVideoDisc disc){
        itemsOrdered[numberItem] = disc;
        numberItem += 1;
    }
    //
    public void removeDVD(DigitalVideoDisc removeDVD){
        int check = -1;
        if(numberItem==0)
        {
        System.out.println("Store is empty!");
        }
        else
        {
            for(int i=0; i<numberItem; i++)
            {
                if(removeDVD.getTitle().equals(itemsOrdered[i].getTitle())&&
                    itemsOrdered[i].getCategory().equals(removeDVD.getCategory()) &&
                    itemsOrdered[i].getLength() == removeDVD.getLength() &&
                    itemsOrdered[i].getCost() == removeDVD.getCost())
                {
                    check = i;
                    break;
                }
            }
            if(check ==-1)
            {
                System.out.println("No found!");
            }
            else
            {
                for(int i = check; i<numberItem-1; i++)
                {
                    itemsOrdered[i] = new DigitalVideoDisc(itemsOrdered[i + 1].getTitle(), itemsOrdered[i + 1].getCategory(), 
                                                           itemsOrdered[i + 1].getDirector(), itemsOrdered[i + 1].getLength(), 
                                                           itemsOrdered[i + 1].getCost());

                }
                numberItem--;
            }
            
        }

    }
}
