import java.util.*;

class Board2
{

public static void start()
 {
   Scanner sc = new Scanner(System.in);  
   boolean [][] grid = new boolean [10][10];
   int guessRow, guessColumn, row = 0, column, ships = 0, turns = 0;

   
   do{
       ships ++;                             //position of one ship for he first out of ten games
      
       column = 0;
       grid[row][column] = true;
       
       row++;
       
     }while (ships < 5);
          
     
     for(int i = 0; i < grid.length; i++)
     {
		 for(int j=0; j < grid[i].length;j++)
		 {
         System.out.print(" "+ grid[i][j] +" ");      //so you can see where the ships are --> comment out when program is done
          //System.out.print(" "+ "*" +" ");          // uncomment when program is done
		 }
		 System.out.println();
	 }
    
    
   do{
          turns ++;
          System.out.print("Enter the row ");
          guessRow = sc.nextInt();
          System.out.print("Enter the column ");
          guessColumn = sc.nextInt();
          
          if (grid[guessRow][guessColumn] == false)
           System.out.println("miss");
           
          else
          {
           ships --;
           System.out.println("hit" + ships + " more left !");
          }
          
      }while(!(turns == 15 || ships == 0));
     
     
     
   if (turns == 15)
     {
        for(int i = 0; true;i++) 
           {
               for(int j = 0; true;j++)
               {
                  if (grid[row][column] == true)
                    System.out.print("You lost the remaning ships are at " + row + column);
               } 
           }
     }
     
   else if (ships == 0);
      System.out.print("You won!");
 }
}