package java101_final_project;


import java.util.Scanner;

public class Minesweeper {
    int row;
    int column;
    int mines;
    char[][] area;
    char[][] board;

    public Minesweeper() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row : ");
        this.row = scan.nextInt();
        System.out.println("Enter column : ");
        this.column = scan.nextInt();
        this.mines = row*column/4;
        this.area = new char[row][column];
        this.board = new char[row][column];
        closeElements();
        placeMines();
        displayBoard();
        //displayMine();
        System.out.println("");
        checkAdj();
    }

    public void closeElements(){
        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.column;j++){
                this.area[i][j]='-';
                this.board[i][j]='-';
            }
        }
    }
    public void displayMine(){
        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.column;j++){
                System.out.print(area[i][j]);
            }System.out.println("");
        }

    }
    public void displayBoard(){
        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.column;j++){
                System.out.print(board[i][j]);
            }System.out.println("");
        }
    }
    public void placeMines(){
        int placed=0;
        int x=0;
        int y=0;
        while (placed < this.mines) {
            y = (int)(Math.random() * this.row);
            x = (int)(Math.random() * this.column);
            if (area[y][x] != '*') {
                area[y][x] = '*';
                placed++;
            }
        }

    }
    public boolean mineSurroundings(){
        int m=0;
        for (int i=0;i<this.area.length;i++){
            for (int j=0;j<this.area[i].length;j++){
                if (this.area[i][j]=='*'){
                    for (int a=-1;a<=1;a++){
                        if (i+a>=0&&i+a<=this.row-1){
                            for (int b=-1;b<=1;b++){
                                if (j+b>=0&&j+b<=this.column-1){
                                    if(this.area[i+a][j+b]=='-'){
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    public void checkAdj(){

        boolean m=false;

        while (m==false){
            int find=0;
            Scanner scanner=new Scanner(System.in); System.out.println("Enter row position : ");
            int rowPos=scanner.nextInt();
            System.out.println("Enter column position : ");
            int columnPos=scanner.nextInt();
            if(area[rowPos][columnPos]=='*'){
                System.out.println("Game Over !");
                displayMine();
                m=true;
                break;
            }
            else if (area[rowPos][columnPos]=='-'){
                for (int i=-1;i<=1;i++){
                    if (rowPos+i>=0&&rowPos+i<=this.row-1){
                        for (int j=-1;j<=1;j++){
                            if (columnPos+j>=0&&columnPos+j<=this.column-1){
                                if (area[rowPos+i][columnPos+j]=='*'){
                                    find+=1;
                                    char f=Integer.toString(find).charAt(0);
                                    area[rowPos][columnPos]=f;
                                    this.board[rowPos][columnPos]=f;
                                }
                            }
                        }
                    }
                }
            }if (mineSurroundings()==true){
                System.out.println("You Win !");
                displayMine();
                m=true;
                break;
            }
            displayBoard();
        }




    }

}
