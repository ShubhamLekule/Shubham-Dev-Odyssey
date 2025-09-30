//Problem Description
//Given a matrix of N rows and M columns, print it column by column. Firstly print 0th column, then 1st column, 2nd column and so on.
//
//Note: Make sure to receive the matrix input row by row.
//
//
//Problem Constraints
//1 <= N <= 100
//1 <= M <= 100
//1 <= mat[i][j] <= 10000
//
//
//Input Format
//Two values denoting N and M,
//Next N lines contain M space separated integers representing the matrix Mat
//
//
//Output Format
//M lines denoting each column
//
//Note: Ensure there is a space character (' ') at the end of the line.
//
//
//Example Input
//3 4
//10 20 30 40
//50 60 70 80
//90 100 110 120
//
//
//Example Output
//10 50 90
//20 60 100
//30 70 110
//40 80 120
//
//
//Example Explanation
//0th column -> 10 50 90
//1st column -> 20 60 100
//2nd column -> 30 70 80
//3rd column -> 40 80 120
public class PrintMatrixColumnByColumn {

	public static void main(String[] args) {
		/*
		 * 	10	20	30	40
		 * 	50	60	70	80
		 * 	90	100	110	120
		 * 
		 * 	00	01	02	03
		 * 10	11	12	13
		 * 20	21	22	23
		 * 
		 */
		int N=3,M=4;
		int[][] mat= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
	}

}
