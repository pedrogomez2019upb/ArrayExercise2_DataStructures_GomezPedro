package edu.upb.ds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean programExit=false;
        while(!programExit){
            int option=0;
            System.out.println("\n#####################################");
            System.out.println("\nWelcome to the Magic Square Generator");
            System.out.println("\n#####################################");
            System.out.println("\nPlease choose a option:");
            System.out.println("\n1:Generate Magic Square");
            System.out.println("\n2:Close Program");
            System.out.println("\n:");
            option=sc.nextInt();
            if(option ==1){
                System.out.println("\n############################");
                System.out.println("\nGenerate Magic Square");
                System.out.println("\n############################");
                System.out.println("\nPlease provide the square's size:");
                int sizeSquare=sc.nextInt();
                int[][] generateSquare = new int[sizeSquare][sizeSquare];
                int x=sizeSquare-1;
                int y=sizeSquare/2;
                generateSquare[x][y]=1;
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
                for(int i=0;i<sizeSquare;i++){
                    for(int q=0;q<sizeSquare;q++){
                        if (generateSquare[i][q]<10) System.out.print(" ");
                        if (generateSquare[i][q]<100) System.out.print(" ");
                        System.out.print(generateSquare[i][q]+" ");
                    }
                    System.out.println();
                }
            }
                else if (option==2){
                programExit=true;
                }

            }
        }
}
