class Solution {
    private boolean isvalid(char[][] B,int r,int c,char ch){
        for(int i=0;i<9;i++){
            if(B[i][c]==ch) return false;
            if(B[r][i]==ch) return false;
            if(B[3*(r/3)+i/3][3*(c/3)+i%3]==ch) return false;
        }
        return true;
    }
    private boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isvalid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)==true) return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }
    public void solveSudoku(char[][] board) {
        solve(board);

        
    }
}