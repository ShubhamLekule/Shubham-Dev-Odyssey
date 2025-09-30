
public class TwoSum {

	public static void main(String[] args) {
		int[] A= {1,2,1};
		int B=11;
		System.out.println(A.length);
//		for(int i=0;i<A.length-1;i++){
//            for(int j=0;j<A.length-1;j++){
//                if(A[i]+A[j]==B)
//                System.out.println(A[i]+" "+A[j]);
//            }
//        }
		
		 for(int i=0;i<A.length-1;i++){
			 System.err.println(A[i]);
			 System.err.println(A[i+1]);
	            if(A[i]<=A[i+1])
	            continue;
	            else
	            System.out.println("1");
	        }
		 System.out.println("0");
       
	}

}
