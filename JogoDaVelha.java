import java.util.Scanner;

public class JogoDaVelha 
{
    static Scanner sc = new Scanner(System.in);
    static char[][] board = new char[4][4];
    static int player = 1, line, column, winner = 0, numberOfTurns = 0;
    
    public static void main(String[] args) 
    {
        //Crating empty board
        for (int l = 1; l <= 3; l++) 
        {
            for (int c = 1; c <= 3; c++)
            {
                board[l][c] = ' ';
            }
        }

        showBoard();

        while((winner == 0) && (numberOfTurns < 9))
        {
            if(player == 1)
            {
                choosing_Space();

                marking_Space('X', 2);
            }
            else
            {
                choosing_Space();

                marking_Space('O', 1);
            }

            if(winner == 0)
            {
                assigning_Winner();

                numberOfTurns++;
            }
        }

        switch (winner) 
        {
            case 1:
                System.out.println("\n The X player won!\n");
            break;

            case 2:
                System.out.println("\n The O player won!\n");
            break; 

            default:
                System.out.println("\n Deu Velha, play again\n");
            break;
        }

         sc.close();
    }
    

    static void showBoard()
    {
        for (int l = 1; l <= 3; l++) 
        {
            for (int c = 1; c <= 3; c++) 
            {
                System.out.print("[" + board[l][c] + "]");
            }
            System.out.println("\n");
        }
    }

    static void choosing_Space()
    {
        System.out.println("type a line: ");
        line = sc.nextInt();
        
        System.out.println("Type a column: ");
        column = sc.nextInt();
    }

    static char marking_Space(char playerSymbol, int nextPlayer)
    {
        if( (line < 4) && (column < 4) && (board[line][column] == ' ') )
        {
            board[line][column] = playerSymbol;
                    
            player = nextPlayer;

            showBoard();
        }
        else
        {
            System.out.println("That is an invalid position");
            showBoard();
        }
        return playerSymbol;
    }

    static void assigning_Winner()
    {
        //Lines test
        for (int l = 1; l <= 3; l++) 
        {
            if((board[l][1] == 'X') && (board[l][2] == 'X') && (board[l][3] == 'X'))
                winner = 1;
                
            else if((board[l][1] == 'O') && (board[l][2] == 'O') && (board[l][3] == 'O'))
                winner = 2;
        }

        //Column test
        for (int c = 1; c <= 3; c++) 
        {
            if((board[1][c] == 'X') && (board[2][c] == 'X') && (board[3][c] == 'X'))
                winner = 1;

            else if((board[1][c] == 'O') && (board[2][c] == 'O') && (board[3][c] == 'O'))
                winner = 2;
        }

        //First Diagonal Test
        if((board[1][1] == 'X') && (board[2][2] == 'X') && (board[3][3] == 'X'))
            winner = 1;

        else if((board[1][1] == 'O') && (board[2][2] == 'O') && (board[3][3] == 'O'))
            winner = 2;

        //Second Diagonal test
        if((board[1][3] == 'X') && (board[2][2] == 'X') && (board[3][1] == 'X'))
            winner = 1;

        else if((board[1][3] == 'O') && (board[2][2] == 'O') && (board[3][1] == 'O'))
            winner = 2;
    }
}