/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_server;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author M Gamal
 */
 class Game_logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
}
     static Integer check_winner(Integer [][]mat) { 
     int principal = 0, secondary = 0,col_1=0,col_2=0,col_3=0,row_1 = 0,row_2=0,row_3=0; 
     int n=3;
     int winner=-1;
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
      if(i==0){row_1+=mat[0][j];}
      else if(i==1){row_2+=mat[1][j];}
      else if(i==2){row_3+=mat[2][j];}
      if(j==0){col_1+=mat[i][0];}
      else if(j==1){col_2+=mat[i][1];}
      else if(j==2){col_3+=mat[i][2];}

                // Condition for principal 
                // diagonal 
                if (i == j) 
                    principal += mat[i][j]; 
                // Condition for secondary 
                // diagonal 
                if ((i + j) == (n - 1)) 
                    secondary += mat[i][j]; 
            } 
        } 
      List <Integer> list=new ArrayList();
      list.add(principal);
      list.add(secondary);
      list.add(row_1);
      list.add(row_2);
      list.add(row_3);
      list.add(col_1);
      list.add(col_2);
      list.add(col_3);
      for (Integer x:list ){
      if(x==0){winner=0; 
                break;        }
      if(x==3){winner=1;
                break;         }      
      }
      return winner ;
    } 
}