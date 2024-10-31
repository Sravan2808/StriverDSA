package Recursion.TryingoutallCombosHard;

import java.util.ArrayList;

// TC:O(3)^N2 SC:O(Length*no of paths)
public class RatMaze {
        public void solveMaze(ArrayList<String> ans ,int r,int c,int m[][] ,int n,String p,boolean[][] vis){
        if(r==n-1 && c==n-1 && m[r][c]!=0){
            ans.add(p);
            return;
        }
        if(r>=0 && r<n && c>=0 && c<n){
            if(vis[r][c] == true || m[r][c] == 0) return;
        vis[r][c] = true;
        solveMaze(ans,r+1,c,m,n,p+'D',vis);//down
        solveMaze(ans,r,c-1,m,n,p+'L',vis);//left
        solveMaze(ans,r,c+1,m,n,p+'R',vis);//right
        solveMaze(ans,r-1,c,m,n,p+'U',vis);//Up
        vis[r][c] = false;
        
        }
        
    }
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n = mat[0].length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        solveMaze(ans,0,0,mat,n,"",visited);
        return ans;
    }

    
}
