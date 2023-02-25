public class X_O_Board extends Board {

    public X_O_Board(){
        super(3);
        n = 3;
    }

    @Override
    public void upBoard(int [] location, char sym) {
        grid[location[0]][location[1]] = sym;
    }

    @Override
    public boolean is_draw(){
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '*'&& !is_winner()){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean is_winner() {
        for (int i = 0; i < 3; i++) {
            // check rows
            if (grid[i][0] != '*' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return true;
            }
            // check columns
            if (grid[0][i] != '*' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return true;
            }
        }
        // check diagonals
        if (grid[0][0] != '*' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return true;
        }
        if (grid[0][2] != '*' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return true;
        }
        return false;
    }

    @Override
    public void display(){
        int x = 0;
        for(int i =0 ;i<n;i++){
            System.out.print("________________");
            System.out.print("\n|");
            for (int j=0;j<n;j++){
                if(grid[i][j] == '*'){
                    System.out.print("(" + Integer.toString(x) + ")");
                }
                System.out.print(grid[i][j]+"  |  ");
                x++;
            }
            System.out.print("\n");
        }
    }

    @Override
    public boolean is_Safe(int [] location) {
        return grid[location[0]][location[1]] == '*';
    }
}
