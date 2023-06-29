package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.store.Store.Store;
import hust.soict.globalict.media.CompactDisc;
import hust.soict.globalict.media.DigitalVideoDisc;
import hust.soict.globalict.media.Media;


public class Aims {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
	public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int choice = sc.nextInt();
        Cart cart = new Cart();
        Store store = new Store();
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println("View store"); 
                int choice1;
                do {
                    storeMenu();
                    choice1 = sc.nextInt();
                    switch(choice1) {
                        case 1: System.out.println("See a media's details");
                                System.out.println("Enter name of media");
                                String title = sc.nextLine();
                                Media m =store.searchMediaByName(title) ;
                                System.out.println(m.toString());
                                mediaDetailsMenu();
                                int choice2;
                                do {
                                    choice2 = sc.nextInt();
                                    switch (choice2) {
                                        case 1: System.out.println("Add to cart\nEnter name of media");
                                                String title1 = sc.nextLine();
                                                Media m1= store.searchMediaByName(title1);
                                                if(m1==null) {
                                                    m1 = new Media(title1) {
                                                        //this.title = title1;
                                                    };
                                                    cart.addMedia(m1);
                                                }
                                                else System.out.println("Cart contained this media");
                                                                              
                                            break;
                                    
                                        case 2:System.out.println("Play");
                                            if (m instanceof DigitalVideoDisc) ((DigitalVideoDisc) m).play();
                                            else if(m instanceof CompactDisc)((CompactDisc) m).play();
                                            else System.out.println("This is not a disc");
                                            break;
                                        case 0: System.out.println("Back"); break;
                                    }
                                } while(choice2>0&&choice2<3);

                        case 2: System.out.println("Add a media to cart");
                                System.out.println("Enter name of media");
                                String title3 = sc.nextLine();
                                Media m2 = cart.searchMediaByName(title3);
                                if(m2==null) {
                                        m2 = new Media(title3) {
                                        };
                                        cart.addMedia(m2);
                                    }
                                    else System.out.println("Cart contained this media");                                
                                break;
                        case 3: System.out.println("Play a media");
                                System.out.println("Enter name of media");
                                String title4 = sc.nextLine();
                                Media m3 = cart.searchMediaByName(title4);
                    
                                if (m3 instanceof DigitalVideoDisc) ((DigitalVideoDisc) m3).play();
                                else if(m3 instanceof CompactDisc)((CompactDisc) m3).play();
                                else System.out.println("This is not a disc");
                                break; 
                        case 4: System.out.println("See current cart");
                                cart.print();
                                break;
                        case 0: System.out.println("Back"); break;
                        }
                } while(choice1>0 && choice1<4);
                case 2: System.out.println("Update store");
                        System.out.println("You can add or remove media?");
                        String AddOrRemove = sc.nextLine();
                        switch(AddOrRemove) {
                        case "add": System.out.println("Add the media");
                                System.out.println("Enter the title");
                                String title2= sc.nextLine();              
                                System.out.println("Enter the category");
                                String category2 = sc.nextLine();
                                System.out.println("Enter the cost");
                                float cost2 = sc.nextFloat();
                                Media item2 = store.search(title2,category2,cost2);
                                if(item2==null) store.addMedia(item2);
                                else System.out.println("media already exist"); 
                        case "remove": System.out.println("Remove the media");
                                System.out.println("Enter the title");
                                String title1= sc.nextLine();              
                                System.out.println("Enter the category");
                                String category1 = sc.nextLine();
                                System.out.println("Enter the cost");
                                float cost1 = sc.nextFloat();
                                Media item1 = store.search(title1,category1,cost1);
                                if(item1==null) System.out.println("media does not exist");
                                else store.removeMedia(item1);
                        }
                        break;
                case 3: System.out.println("See current cart");
                        cart.print();
                        break;
                case 0: System.out.println("Exit"); break;
            }    

        }while(choice!=0&&choice<4);
    }
}
