package BinarySearch;

import java.util.Arrays;

public class binarySearchInSortedMatrix {
    public static void main(String[] args) {
        int [][]matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(matrix, 1)));

    }
//    static int[] BinarySearchMatrix(int [][] matrix ,int rows,int colStart,int colEnd,int target){
//        while (colStart <= colEnd) {
//            int mid=colStart+(colEnd-colStart)/2;
//            if(target==matrix[rows][mid]){
//                return new int[]{rows,mid};
//            }
//            if(target>matrix[rows][mid]){
//                colStart=mid+1;
//            }
//            else{
//                colEnd=mid-1;
//            }
//
//        }
//        return new int[]{-1,-1};
//    }
//    static int[] search(int [][] matrix,int target){
//        int rows=matrix.length;
//        int columns=matrix[0].length;
//        if(rows==1){
//            return BinarySearchMatrix(matrix,rows,0,columns-1,target);
//        }
//        int rowStart=0;
//        int rowEnd=rows-1;
//        int midColumn=columns/2;
//        while(rowStart<rowEnd-1){
//            int midRow=rowStart+(rowEnd-rowStart)/2;
//            if(target== matrix[midRow][midColumn]){
//                return new int[]{midRow,midColumn};
//            }
//            if(target<matrix[midRow][midColumn]){
//               rowEnd=midRow;
//            }
//            else{
//                rowStart=midRow;
//            }
//        }
//        if(target<=matrix[rowStart][midColumn-1]){
//            return BinarySearchMatrix(matrix,rowStart,0,midColumn-1,target);
//
//        }
//        if(target>=matrix[rowStart][midColumn]&& target<=matrix[rowStart][columns-1] ){
//            return BinarySearchMatrix(matrix,rowStart,midColumn+1,columns-1,target);
//
//        }
//        if(target<=matrix[rowStart+1][midColumn-1]){
//            return BinarySearchMatrix(matrix,rowStart+1,0,midColumn-1,target);
//
//        }
//       else{
//            return BinarySearchMatrix(matrix,rowStart+1,midColumn+1,columns-1,target);
//        }
//    }
    public static int[] bsearchMatrix(int matrix[][],int rows,int colStart,int colEnd,int target){
        while(colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if(matrix[rows][mid]==target){
                return new int[] {rows,mid};
            }
            if(target<matrix[rows][mid]){
                colEnd=mid-1;
            }
            else{
                colStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int [][]matrix,int target){
        int rows=matrix.length;
        int columns= matrix[0].length;
        if(rows==1){
            return bsearchMatrix(matrix,rows,0,columns-1,target);
        }
        int rowStart=0;
        int rowEnd=rows-1;
        int midColumn=columns/2;
        while(rowStart<rowEnd-1){
            int midRow=rowStart+(rowEnd-rowStart)/2;
            if(target==matrix[midRow][midColumn]){
                return new int[]{midRow,midColumn};
            }
            if(target>matrix[midRow][midColumn]){
                rowStart=midRow;
            }
            else{
                rowEnd=midRow;
            }


        }
        if(target<matrix[rowStart][midColumn]){
            return bsearchMatrix(matrix,rowStart,0,midColumn-1,target);

        }
        if(target>matrix[rowStart][midColumn] && target<=matrix[rowStart][columns-1]){
            return bsearchMatrix(matrix,rowStart,midColumn+1,columns-1,target);

        }
        if(target<matrix[rowStart+1][midColumn]){
            return bsearchMatrix(matrix,rowStart+1,0,midColumn-1,target);

        }
        if(target>matrix[rowStart][midColumn]){
            return bsearchMatrix(matrix,rowStart+1,midColumn+1,columns-1,target);

        }
        return new int[]{-1,-1};
    }
}
