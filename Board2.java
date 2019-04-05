import java.util.*;

class Board2
{

public static void start()
 {
   Scanner sc = new Scanner(System.in);  
   boolean [][] grid = new boolean [10][10];
   int guessRow, guessColumn, row = 0, column=0, ship1 = 0, ship2=0, ship3 = 0, ship4 = 0, turns = 0;

   
   do{
       ship1 ++;                             //position of one ship for the first out of ten games
      
       column = 0; 
       grid[row][column] = true;
       
       row++;
       
     }while (ship1 < 5);
    
////////////////////////////////////////////
       
     row=5;
     column = row ;

     do{
       ship2++;                             //position of ship 2 for the first out of ten games
       grid[row][column] = true;
       column++;
       
       
     }while (ship2 < 3);
     
////////////////////////////////////////////     
     
     column=2;
     row = column ;

     do{
       ship4++;                             //position of ship 3 for the first out of ten games
       grid[row][column] = true;
       row++;
       
       
     }while (ship4 < 4);
     
//////////////////////////////////////////// 
     
     
     for(int i = 0; i < grid.length; i++)
     {
       
		 for(int j=0; j < grid[i].length;j++)
		 {
        //System.out.print(" "+ grid[i][j] +" ");      //so you can see where the ships are --> comment out when program is done
         System.out.print(" "+ "*" +" ");          // uncomment when program is done
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
           ship1 --;
           System.out.println("hit" + ship1 + " more left !");
          }
          
      }while(!(turns == 15 || ship1 == 0));
     
     
     
   if (turns == 15)
     {
        for(int i = 0; true;i++) 
           {
               for(int j = 0; true;j++)
               {
                  if (grid[row][column] == true)
                    System.out.print("You lost the remaning ship1 are at " + row + column);
               } 
           }
     }
     
   else if (ship1 == 0);
      System.out.print("You won!");
 }
}