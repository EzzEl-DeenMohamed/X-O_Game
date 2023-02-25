public abstract class Board {
    protected int n;
    protected char [] [] grid ;

    public Board(int n){
        grid = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++) {
                grid[i][j] = '*';
            }
        }
    }

    public abstract void upBoard(int [] location,char sym);
    public abstract boolean is_draw();
    public abstract boolean is_winner();
    public abstract void display();

    public abstract boolean is_Safe(int [] location);


}
