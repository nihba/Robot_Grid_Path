public class Robot_Grid_Path{ 
 
 int count;
  
  private void start(int x, int y,boolean grid[][]){
  
    grid[x][y] = true;
    traverse_Up(x,y,grid);
    traverse_Down(x,y,grid);     
    traverse_Left(x,y,grid);     
    traverse_Right(x,y,grid);
             
}

 public void traverse_Up(int x, int y, boolean grid[][]){
    
    if(y == 0) {
    return;
    }
    
    else{
        if (grid[x][y-1]){
         return;
         }
        grid[x][y-1] = true;
        start(x,y-1,grid);
        grid[x][y-1] = false;
    }
}
  
  public void traverse_Down(int x, int y, boolean grid[][]){
    if(x == 3 && y == 3){
        count++;
        grid[x][y] = true;
        return;
    }
    
    else if(y == 3){
     return;
     }
    
    else{
        if (grid[x][y+1]){
         return;
         }
        
        grid[x][y+1] = true;
        start(x,y+1,grid);
        grid[x][y+1] = false;
    }
}

  public void traverse_Left(int x, int y, boolean grid[][]){
    
    if(x == 0){
     return;
     }
    
    else{
        if (grid[x-1][y]){
         return;
         }
        grid[x-1][y] = true;
        start(x-1,y,grid);
        grid[x-1][y] = false; 
    }
}
 

public void traverse_Right(int x, int y, boolean grid[][]){
    if(x == 3 && y == 3){
        count++;
        grid[x][y] = true;
        return;
    }
    else if(x == 3){
     return;
     }
     
    else{
        if (grid[x+1][y]){
         return;
         }
         
        grid[x+1][y] = true;
        start(x+1,y,grid);
        grid[x+1][y] = false; 
    } 
    
    }
    
public static void main(String[] args) {
    Robot_Grid_Path rgp = new Robot_Grid_Path();
    boolean grid [][] = new boolean [4][4];
    
    grid[0][0] = true;
    rgp.count = 0;
    rgp.start(0,1,grid);
    System.out.println("Total number of exclusive paths are: " + rgp.count);
}

}