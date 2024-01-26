package gitPractice;
import java.util.Scanner;
public class jaiBoyfriendDemo{
    public static void main(String[] args) {
        System.out.println("Welcome to my favorite person in the whole world's fact machine!");
        System.out.println("Please enter 'TV' or 'Movie' to know his favorites! DO IT!");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        boyfriend favorite;

        if(input.equalsIgnoreCase("TV")){
            favorite = new TV();
        } else if(input.equalsIgnoreCase("Movie")){
            favorite = new movie();
        } else {
            System.out.println("Invalid input. Please enter 'TV' or 'movie'.");
            return;
    
        }
        favorite.loves();
        
    }
    

}