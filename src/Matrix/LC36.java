package Matrix;

public class LC36 {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
//        char[][] board = {
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'}
//        };

        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        int r=-1;
        int c=-1;
        boolean isValid=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.') {
                    r = i;
                    c = j;
                    if(isSafe(r,c,board,board[i][j])){
                        isValid=true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    isValid=true;
                }

            }
        }
        return isValid;


    }
    public static boolean isSafe(int r,int c,char[][]arr,char number){
        for(int i=0;i<arr.length;i++){
            if(i!=r&&arr[i][c]==number){
                return false;
            }
        }
        for(int i=c+1;i<arr[r].length;i++){
            if(i!=c&&arr[r][i]==number){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(arr.length));
        int BoxRowStart=r-r%sqrt;
        int BoxColStart=c-c%sqrt;
        for(int i=BoxRowStart;i<BoxRowStart+sqrt;i++){
            for(int j=BoxColStart;j<BoxColStart+sqrt;j++){
                if(i!=r && j!=c && arr[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }
}
