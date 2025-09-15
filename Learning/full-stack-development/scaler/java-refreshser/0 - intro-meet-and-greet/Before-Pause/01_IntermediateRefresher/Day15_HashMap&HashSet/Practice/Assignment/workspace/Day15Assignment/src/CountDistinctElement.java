import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElement {
	public int solve(ArrayList<Integer> A) {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i:A)
        hs.add(i);

        return hs.size();
    }
	public static void main(String[] args) {
		// call solve 

	}

}
