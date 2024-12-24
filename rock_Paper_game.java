import java.util.Scanner;
import java.util.Random;
public class rock_Paper_game {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("welocome to this game of rock paper scissor");
        System.out.println("Rules : 0  scissor, 1 paper , 2 rock ");

        String[] choice = {"scissor " , "paper", "rock"};

        int myWins = 0 ;
        int computerWins = 0; 
        int round = 5;

        for(int i=0 ; i<=5;i++){
            System.out.println("Please enter you choice ");
            int myTurn = sc.nextInt();

            if(myTurn <0 || myTurn > 2){
                System.out.println("please enter valid numbers ");
                 i--;
                 continue;
            }
        

            int computerTurn =rnd.nextInt(2);
            System.out.println("computer choce " +computerTurn  );
            System.out.println("computer choces "+ choice[computerTurn]);
            System.out.println("your choice is " + choice[myTurn]);

            if(myTurn == computerTurn){
                System.out.println("match " + i +" was a tie ");
            }
            else if (myTurn ==0 && computerTurn== 1){
                System.out.println("you are the winner of "+ i +" round");
              myWins++;
            }
            else if (myTurn ==1 && computerTurn== 2){
                System.out.println("you are the winner of "+ i +" round");  
                myWins++;       
            }
            else if(myTurn == 2 && computerTurn == 0){
                System.out.println("you are the winner of "+ i +" round ");   
                myWins++;      
           }else{
            System.out.println("computer is the winner of "+ i +" round ");
            computerWins++;
           }

            }
            System.out.println("game over!");
            System.out.println("you win ovarall "+ myWins +" rounds  ");
             System.out.println("computer wins ovarall " + computerWins);
 
             if(myWins > computerWins){
                System.out.println("you are the winner  you Wins " + myWins + " times.");
             }
             else if(computerWins >myWins){
                System.out.println("try better next time you were just " + computerWins +" points Behind");
             }
             else {
                System.out.println("game tied !");
             }
           

    }
    
}
