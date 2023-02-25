import java.util.Scanner;
public class Player {
    Scanner input = new Scanner(System.in);

    private char symbol;
    private String name;

    public Player(String Name,char sym){
        name = Name;
        symbol = sym;
    }
    public char get_symbol(){
        return symbol;
    }
    public String get_Name(){
        return name;
    }

    public  int[] get_move(){
        int x;
        int y;
        System.out.print("\nPlease enter your move (0 to 8): ");
        int n = input.nextInt();

        x = n  / 3;
        y = n  % 3;

        return new int[]{x, y};
    }

}
