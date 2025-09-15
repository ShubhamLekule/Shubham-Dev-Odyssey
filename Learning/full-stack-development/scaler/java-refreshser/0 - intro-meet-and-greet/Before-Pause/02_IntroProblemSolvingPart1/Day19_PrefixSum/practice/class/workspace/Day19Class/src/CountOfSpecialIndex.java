/*
 * Given an array of Size N. Count the number of special index in array.
 * Note: Special indices are those after removing which, sum of all EVEN indexed elements is equal to sum of
 * 		all ODD indexed elements.
 * arr[]={4,3,2,7,6,-2}
 * 
 *  Removed Index  		arr				IsSpecialIndex
 *  	0			{3,2,7,6,-2}			yes(SumEvenIndex(3+7-2=8) SumOddIndex(2+6=8) both are 8 so yes
 *  	1			{4,2,7,6,-2}			no(SumEvenIndex(4+7-2=9) SumOddIndex(2+6=8) both are 9&8 so no
 *  	2			{4,3,7,6,-2}			yes
 *  	3			{4,3,2,6,-2}			no
 *  	4			{4,3,2,7,-2}			no
 *  	5			{4,3,2,7,6}				no
 *  	
 */
public class CountOfSpecialIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
