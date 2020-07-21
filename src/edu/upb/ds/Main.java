//###################################
//MAIN CLASS
//###################################
//This exercise is focused on making
//a Magic Square using n*n array
package edu.upb.ds;
//###################################
//IMPORTING CLASSES
//###################################

//the principles of OOP
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //###################################
        //Creating Scanner
        //###################################
        Scanner sc = new Scanner(System.in);
        boolean programExit=false;
        while(!programExit){
            int option=0;
            //###################################
            //MENU
            //###################################
            System.out.println("\n#####################################");
            System.out.println("\nWelcome to the Magic Square Generator");
            System.out.println("\n#####################################");
            System.out.println("\nPlease choose a option:");
            System.out.println("\n1:Generate Magic Square");
            System.out.println("\n2:Close Program");
            option=sc.nextInt();
            if(option ==1){
                System.out.println("\n############################");
                System.out.println("\nGenerate Magic Square");
                System.out.println("\n############################");
                System.out.println("\nPlease provide the square's size:");
                int sizeSquare=sc.nextInt();
                //###################################
                //Creating Magic Square
                //###################################
                //Here we create the magic square
                //asked by the user.
                int[][] generateSquare = new int[sizeSquare][sizeSquare];
                int x=sizeSquare-1;
                int y=sizeSquare/2;
                generateSquare[x][y]=1;
                //###################################
                //Applying Main Rules for doing a Magic Square
                //###################################
                for(int i=2;i<=sizeSquare*sizeSquare;i++){
                    if(generateSquare[(x+1)%sizeSquare][(y+1)%sizeSquare]==0){
                        x=(x+1)%sizeSquare;
                        y=(y+1)%sizeSquare;
                    }
                    else{
                        x=(x-1+sizeSquare)%sizeSquare;
                    }
                    generateSquare[x][y]=i;
                }
                //###################################
                //Printing Magic Square
                //###################################
                for(int i=0;i<sizeSquare;i++){
                    for(int q=0;q<sizeSquare;q++){
                        if (generateSquare[i][q]<10) System.out.print(" ");
                        if (generateSquare[i][q]<100) System.out.print(" ");
                        System.out.print(generateSquare[i][q]+" ");
                    }
                    System.out.println();
                }
            }
                //###################################
                //Exiting Program
                //###################################
                else if (option==2){
                programExit=true;
                }

            }
        System.out.println("\n########################################");
        System.out.println("\nThanks for using the Magic Box Generator");
        System.out.println("\n########################################");
        }
}
//Developed by Pedro Felipe Gomez / ID:000396221