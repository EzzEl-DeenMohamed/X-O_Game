import java.util.Scanner;

public class X_O_Game extends Game {

    Scanner input = new Scanner(System.in);
    @Override
    public void play_Game() {
        // player 1
        System.out.print("Enter the first player name:");
        String name1 = input.nextLine();

        Player p1 = new Player(name1,'X');

        // player 2
        System.out.print("Enter the second player name:");
        String name2 = input.nextLine();
        Player p2 = new Player(name2,'O');

        X_O_Board xoBoard = new X_O_Board();

        while (!xoBoard.is_draw() && !xoBoard.is_winner()){
            // player 1
            if (xoBoard.is_draw())
                break;
            xoBoard.display();
            System.out.println(p1.get_Name());

            int [] ply_move_1 = p1.get_move();
            while(!(xoBoard.is_Safe(ply_move_1))){
                xoBoard.display();
                System.out.print("Invalided input!!");
                System.out.println("Try again..");
                System.out.println(p1.get_Name());
                System.out.print("Enter:");
                ply_move_1 = p1.get_move();
            }
            xoBoard.upBoard(ply_move_1, p1.get_symbol());

            if(xoBoard.is_winner()){
                xoBoard.display();
                System.out.println(p1.get_Name()+" Wins");
                break;
            }

            // player 2
            if (xoBoard.is_draw())
                break;
            xoBoard.display();
            System.out.println(p2.get_Name());

            int [] ply_move_2 = p2.get_move();
            while(!(xoBoard.is_Safe(ply_move_2))){
                xoBoard.display();
                System.out.print("Invalided input!!");
                System.out.println("Try again..");
                System.out.println(p2.get_Name());
                System.out.print("Enter:");
                ply_move_2 = p2.get_move();
            }
            xoBoard.upBoard(ply_move_2, p2.get_symbol());

            if(xoBoard.is_winner()){
                xoBoard.display();
                System.out.println(p2.get_Name()+" Wins");
                break;
            }
        }
    }
}
