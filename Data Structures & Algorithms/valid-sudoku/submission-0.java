class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        //checking row
        //row if fixed if first row then(0,1)(0,2)
        //in this 0-row,1,2-col  
        //row is fixed so outer loop,col changes so inner loop
        for(int row=0;row<n;row++){
            HashSet<Character>st = new HashSet<>();
            for(int col=0;col<n;col++){
                char ch = board[row][col];
                if(ch=='.'){
                    continue;
                }
                if(st.contains(ch)){
                    return false;
                }
                st.add(ch);
            
            }
        }
        //checking col
        //col is fixed (0,1)(1,1)
         //next line we switch row first row ,second row
         //row changes so inner loop(switch row)
         //col is fixed so outer loop;
           for(int col=0;col<n;col++){
            HashSet<Character>st = new HashSet<>();
            for(int row=0;row<n;row++){
                char ch = board[row][col];
                if(ch=='.'){
                    continue;
                }
                if(st.contains(ch)){
                    return false;
                }
                st.add(ch);
            
            }
        }

        //box 3*3
        /*
    Sudoku Board Layout (9 × 9)

         Col
         0 1 2 | 3 4 5 | 6 7 8
       -------------------------
Row 0 |       |       |       |
Row 1 |       |       |       |
Row 2 |       |       |       |
       -------------------------
Row 3 |       |       |       |
Row 4 |       |       |       |
Row 5 |       |       |       |
       -------------------------
Row 6 |       |       |       |
Row 7 |       |       |       |
Row 8 |       |       |       |
       -------------------------

    3×3 Box Starting Positions:

    (0,0)  (0,3)  (0,6)
    (3,0)  (3,3)  (3,6)
    (6,0)  (6,3)  (6,6)

    Outer loops select the starting cell of each box.
    Inner loops visit all 9 cells inside that box.


    we have to check every next +3row +3col
*/

for(int row=0;row<n;row=row+3){
    for(int col=0;col<n;col=col+3){
        HashSet<Character>st = new HashSet<>();
        for(int c=row;c<row+3;c++){
            for(int r=col;r<col+3;r++){
                char ch = board[r][c];
                if(ch=='.'){
                    continue;
                }
                if(st.contains(ch)){
                    return false;
                }
                st.add(ch);
            }
        }

    }
}
return true;
    }
        
    
}
