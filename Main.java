import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What do you wants to do:");
        System.out.println("1-Play Games.\n2-Exit.");
        System.out.print("Enter:");
        int checker = input.nextInt();
        if(checker == 1){
            System.out.print("What game do you prefer to play.\n1-X-O.\n2-connect-4.\nEnter:");
            int checker2= input.nextInt();
            if( checker2 == 1){
                // x-o game
                X_O_Game game1 = new X_O_Game();
                game1.play_Game();
            }
            else if( checker2 == 2){
                // connect-4 game
                System.out.print("Soon");

            }
            else{
                // exit(0)
                System.out.println("Incorrect answer try again!");
                main(null);
            }

        } else if (checker == 2) {
            System.exit(0);
        }
        else{
            System.out.println("Incorrect answer try again!");
            main(null);
        }

    }
}