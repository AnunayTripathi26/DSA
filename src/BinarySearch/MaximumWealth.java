package BinarySearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(MaxWealth(arr));
    }

    static int MaxWealth(int[][] arr) {

        int maxWealth=0;
        for(int i=0;i<arr.length;i++){
            int wealth=0;
            for(int j=0;j<arr[i].length;j++){
                wealth+=arr[i][j];
            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }
        return maxWealth;
    }
}
