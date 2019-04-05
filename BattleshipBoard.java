//board class
//Ayush C, Ananya G
//Battleship game


//KEY
/*

0 = NO SHIP
1 = SHIP
2 = HIT
3 = MISS

The 5 ships are:  Carrier (occupies 5 spaces), Battleship (4), Cruiser (3), Submarine (3), and Destroyer (2).  
(17 spots) !!!

*/

import java.util.Scanner;
import java.text.DecimalFormat;
public class BattleshipBoard{
   DecimalFormat twoDigits =  new DecimalFormat("00 ");
   int[][] boardP1;
   int[][] boardComp;
  
   public BattleshipBoard(){
   
   boardP1 = new int[10][10]; //makes new board FOR PLAYER with all false
   boardComp = new int[10][10];
   showPlayerBoard();
   
   int randNum = (int)(Math.random()*10-1)+1;
   switch (randNum){
   case 1: initBoard1(); break;
   case 2:initBoard2(); break;
   case 3:initBoard3(); break;
   case 4:initBoard4(); break;
   case 5:initBoard5(); break;
   case 6:initBoard6(); break;
   case 7:initBoard7(); break;
   case 8:initBoard8(); break;
   case 9:initBoard9(); break;
   case 10:initBoard10(); break; 
   default: break;
   }

   
  //initBoard1();//which computer board to choose
    
   showCompBoard();//COMMENT THIS ONE OUT


}
   public void setUp(){
   
   //function to set up board for player
   
   //carrier 5 spaces
   
   
   //Battleship 4 spaces
   
   //Cruiser 3 spaces
   
   //submarine also 3 spaces
   
   
   //destroyer 2 spaces
   
     }
   public void startGame(){
    do{
         int x = inputX();
         int y = inputY();
             do{
             if(validate(x,y)==false){
             System.out.println("YOU CANNOT RE-CHOOSE THAT SPOT, PLEASE TRY AGAIN");
             x= inputX();
             y= inputY();
             }
            
            
             }while(validate(x,y)==false);
       move(x,y);
       computerMove();
       
       
       }while(endGame()==false);

   }
   public static int inputX(){
   
      Scanner input = new Scanner(System.in);
      System.out.print("ENTER X -->  ");
      return(input.nextInt());

   
   
   }   
   public static int inputY(){
      Scanner input = new Scanner(System.in);
      System.out.print("ENTER Y -->  ");
      return(input.nextInt());
   }
   public boolean validate(int x, int y){
   
   if( ((boardComp[x-1][y-1])==2)||((boardComp[x-1][y-1])==3)){
   return(false);
   }else{
   return(true);
   }
   
   }
   
  
   public void computerMove(){
   
   //(Math.random()*Max-min)+min;
   
   int x =(int)(Math.random()*10-1)+1;
   int y =(int)(Math.random()*10-1)+1;
   
   //validate
   if( ((boardP1[x-1][y-1])==2)||((boardP1[x-1][y-1])==3)){
   
   computerMove();
   
   }else{
             System.out.print("Point "+x+","+y+" was chosen and was a "); 
            
            --x;
            --y;
            
            if(boardP1[x][y]==0){
            boardP1[x][y]=3;
            System.out.println("miss");
            }else if(boardP1[x][y]==1){
             boardP1[x][y]=2;
             System.out.println("HIT!");
            }

   }

   }
   
   public boolean endGame(){
   
            //check 2 count of player
            int player2=0;
            for(int[]row:boardP1){
            
               for(int temp:row){
               
               if(temp==2){
               ++player2;
               }
               
               }
            }
            
            
            //check 2 count of computer
            int computer2=0;
             for(int[]row:boardComp){
            
               for(int temp:row){
               
               if(temp==2){
               ++computer2;
               }
               
               }
            }
            
            if(computer2>=17||player2>=17){
            return(true);
            }else{
            return(false);
            }
   
   }
   public void move(int x, int y){
   
   System.out.print("Point "+x+","+y+" was chosen and was a "); 
   
   --x;
   --y;
   
   if(boardComp[x][y]==0){
   boardComp[x][y]=3;
   System.out.println("miss");
   }else if(boardComp[x][y]==1){
    boardComp[x][y]=2;
    System.out.println("HIT!");
   }
   
    
   
   
   }
   public void showPlayerBoard(){
   
         System.out.println("   1 2 3 4 5 6 7 8 9 10");
            int rowCount=0;
            for(int[]row:boardP1){
            System.out.print(twoDigits.format(rowCount+1));
            int colCount=0; 
               for(int temp:row){
                              colCount++;
               
               
               if(temp==1){
               
               System.out.print("o ");
               
               }else if(temp==0){
                System.out.print("* ");
          
               }else if(temp==2){
               
               }else if(temp==3){
               
               }
               
               }
               ++rowCount;
               System.out.println();
            
            }
            
   }
   public void showCompBoard(){
   
   System.out.println();
        System.out.println("   1 2 3 4 5 6 7 8 9 10");
            int rowCount=0;
            for(int[]row:boardComp){
            
           System.out.print(twoDigits.format(rowCount+1));
            int colCount=0; 
               for(int temp:row){
                          colCount++;
               
               
               if(temp==1){
               
               System.out.print("o ");
               
               }else if(temp==0){
                System.out.print("* ");
          
               }else if(temp==2){
               
               }else if(temp==3){
               
               }
               
               
               }
               ++rowCount;
               System.out.println();
               

            }
            
   }
    public void initBoard1(){
     int boardTemp[][] = {
     {0,1,0,0,1,0,0,0,0,1},
     {0,1,0,0,1,0,0,0,0,1},
     {0,1,0,0,1,0,0,0,0,1},
     {0,1,0,0,0,0,0,0,0,1},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,1,1,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,1,0,0,0,0,0,0}
     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     
   
   }
    public void initBoard2(){
    int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,1,1,1},
     {0,0,0,0,1,0,0,0,0,0},
     {0,1,0,0,1,0,0,0,0,0},
     {0,1,0,0,1,0,0,1,0,0},
     {0,1,0,0,1,0,0,1,0,0},
     {0,0,0,0,1,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   
   }
    public void initBoard3(){
      int boardTemp[][] = {
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,1,1,1,1,1,0,0,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,1,0,0,0,0},
     {0,0,1,0,0,1,0,1,0,0},
     {0,0,1,0,0,1,0,1,0,0},
     {0,0,0,0,0,1,0,1,0,0},
     {0,0,0,0,0,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     
   
   }
    public void initBoard4(){
     int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,1,1,1,1,1,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,1,1,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,1,1,1,0,0,1,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,1,1,1,0,0,0,0,0},
     {0,0,0,0,0,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   
   }
    public void initBoard5(){
     int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,1,1,0,0,0,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,1,1,1,0,0,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,1,1,1,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {1,1,1,1,1,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   
   }
    public void initBoard6(){
     int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {0,1,0,0,1,0,0,0,0,0},
     {0,1,0,0,1,0,0,0,0,0},
     {0,1,0,0,1,0,0,0,0,0},
     {0,1,0,0,1,0,1,1,1,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,1,1,1,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,1,1,0,0},
     {0,0,0,0,0,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   
   }
    public void initBoard7(){
     int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {1,1,1,0,0,0,0,0,0,0},
     {0,0,0,0,1,0,0,0,0,1},
     {0,0,0,0,1,0,0,0,0,1},
     {0,0,0,0,1,0,0,0,0,1},
     {0,0,0,0,0,0,0,0,0,1},
     {0,0,0,0,1,1,1,1,0,1},
     {0,0,0,0,0,0,0,0,0,0},
     {0,1,1,1,0,0,0,1,1,0},
     {0,0,0,0,0,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   
   }
    public void initBoard8(){
    int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,0,0,0,0,0},
     {0,1,0,0,0,1,1,1,1,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,1,1,1},
     {0,0,0,0,0,0,1,1,0,0},
     {0,0,0,0,0,0,0,1,1,1}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   }
    public void initBoard9(){
    int boardTemp[][] = {
     {1,1,0,0,0,0,0,1,1,1},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,1,1,1,1,1,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,1,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,1,1,1}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   }
    public void initBoard10(){
    int boardTemp[][] = {
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,1,1,0,0,0,0,0,0},
     {0,0,0,0,1,1,1,0,0,1},
     {0,0,0,0,0,0,0,0,0,1},
     {0,0,0,1,1,1,1,1,0,1},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,1,1,1,1},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,0,0,0},
     {0,0,0,0,0,0,0,0,0,0}     
     
     };
     
     int rowCount = 0;

           for(int[]row:boardTemp){
            int colCount=0;
            
               for(int temp:row){
               
              
               //System.out.print(
             

               boardComp[rowCount][colCount] = temp;
               colCount++;
               }
              
              rowCount++;
              }
     
     

   }


}