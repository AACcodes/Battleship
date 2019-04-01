class Board
{
      public static void showBoard(int[][] board)
    {
    
        System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
        
        
        for(int row=0 ; row < 10 ; row++ )
        {
            System.out.print((row+1)+ "");
            
            for(int column=0 ; column < 10 ; column++)
            {
                if(board[row][column]==-1)
                  {
                    System.out.print("\t"+"~");
                  }
                
                 if(board[row][column]==0)
                  {
                    System.out.print("\t"+"*");
                  }
                
                else if(board[row][column]==1)
                  {
                    System.out.print("\t"+"X");
                  }    
            }
            
            System.out.println();
        }
   
    }
                       
       }
