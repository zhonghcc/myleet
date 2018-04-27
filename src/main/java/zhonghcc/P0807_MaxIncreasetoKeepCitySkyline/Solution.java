package zhonghcc.P0807_MaxIncreasetoKeepCitySkyline;


public class Solution {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length;
        int colums = grid[0].length;
        int [] h = new int[rows];
        int [] w = new int[colums];

        for(int i=0; i< rows; i++){
            for(int j=0; j< colums;j++){
                int item = grid[i][j];
                if(item > h[i]){
                    h[i]=item;
                }
                if(item > w[j]){
                    w[j]=item;
                }
            }
        }

        int count = 0;
        for(int i=0; i< rows; i++){
            for(int j=0; j< colums;j++){
                int item = grid[i][j];
                int target = h[i]>w[j]?w[j]:h[i];
                count = count + target - item;
            }
        }

        return count;
    }

}
