//board class
//Ayush C, Ananya G
//Battleship game


public class BattleshipBoard{

   boolean boardP1[][];
   boolean boardP2[][];
   
   public BattleshipBoard(){
   
   boardP1 = new boolean[10][10]; //makes new board FOR PLAYER with all false
   
   showBoard();


}
   public void showBoard(){
   
   
   int colCount=0;
   for(boolean[]row:boardP1){
   
      for(boolean bool:row){
      
      colCount++;
      //System.out.print(
      
      if(bool==true){
      
      System.out.print("o ");
      
      }else{
       System.out.print("* ");
 
      }
      
      }
      System.out.println();
   
   }
   
   }


}