import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public Menu(){}

    public void panel() throws IOException{
        int option;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("##############################");
            System.out.println("1.Chat\n" +
                    "2.Exit\n" +
                    "##############################");
            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1:
                    System.out.println("Write the chat name:");
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(option != 2);
    }

}
