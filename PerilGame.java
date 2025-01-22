import java.util.Random;
/**
 * Write a description of class PerilGame here.
 *
 * Anmoldeep Singh
 * 3149800
 * Assignment 2
 * Question 2
 */
public class PerilGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Peril: Let’s Play");
        System.out.println("");
        System.out.println("------------------------------");
        int set=1,round=1,dieP1,dieP2,dieP3,dieP4,countP1=0,countP2=0;
        Random die = new Random();
        while(countP1<3&&countP2<3){
            System.out.println("Set: "+set);
            System.out.println("----------------------------");
            int point1=5;
            int point2=5;
            while(point1>=1&&point2>=1){
                System.out.println("Round: "+round);
                dieP1=die.nextInt(6) +1;
                dieP2=die.nextInt(6) +1;
                dieP3=die.nextInt(6) +1;
                dieP4=die.nextInt(6) +1;
                System.out.println("Big roll");

                if(dieP1>dieP2){
                    System.out.println("player 1:"+dieP1+"\tPlayer 2: "+dieP2+"\tWinner: Player 1");
                    point2-=(dieP1-dieP2);
                }
                else if(dieP1<dieP2){
                    System.out.println("player 1:"+dieP1+"\tPlayer 2: "+dieP2+"\tWinner: Player 2");
                    point1-=(dieP2-dieP1);
                }
                else{
                    System.out.println("player 1:"+dieP1+"\tPlayer 2: "+dieP2+"\tWinner: Tie");
                }
                System.out.println("Small roll");
                if(dieP3>dieP4){
                    System.out.println("player 1:"+dieP3+"\tPlayer 2: "+dieP4+"\tWinner: Player 1");
                    point2-=(dieP3-dieP4);
                }
                else if(dieP3<dieP4){
                    System.out.println("player 1:"+dieP3+"\tPlayer 2: "+dieP4+"\tWinner: Player 2");
                    point1-=(dieP4-dieP3);
                }
                else{
                    System.out.println("player 1:"+dieP3+"\tPlayer 2: "+dieP4+"\tWinner: Tie");
                }
                System.out.println("Summary: Tokens remaining");
                System.out.println("Player 1: "+point1);
                System.out.println("Player 2: "+point2);
                System.out.println("------------------------");
                round++;
            }
            if(point2<=0 && point2<point1){
                System.out.println("Player 1 Wins set "+set);
                countP1++;
            }
            else if(point1<=0 && point1<point2){
                System.out.println("Player 2 Wins set "+set);
                countP2++;
            }
            else {
                System.out.println("Player 1 Wins set "+set);
                countP2++;
            }
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("Score Board");
            System.out.println("  Player 1"+"\tPlayer2");
            System.out.println("\t"+countP1+"\t"+countP2);
            System.out.println("");
            round=1;
            if(countP1==3){
                System.out.println("player 1 is the Peril champion!");
            }
            if(countP2==3){
                System.out.println("player 2 is the Peril champion!");
            }
            set++;
        }
        System.out.println("end of program");   
    }
}
