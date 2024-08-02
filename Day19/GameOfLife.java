class GameOfLife {

    int[][] dir={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

    public void gameOfLife(int[][] board) {

        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                for(int[] c:dir){
                    int p=i+c[0];
                    int q=j+c[1];

                    if(p>=0 && p<m && q>=0 && q<n && (board[p][q]==1|| board[p][q]==2)){
                        count++;
                    }
                }

                if(board[i][j]==1){
                         if(count<2||count>3){
                            board[i][j]=2;
                         }
                }
                else{
                       if(count==3){
                        board[i][j]=3;
                       }
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]%=2;
            }
        }
        
    }
}