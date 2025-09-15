//Problem Description
//
//Given an english sentence, take it in the input and print it in the output.
//Input Format
//
//Single line containing an english sentence.
//Output Format
//
//Print in a single line the sentence in the input.
//Example Input
//
//Input 1:
//
//Harry loves Hagrid !
//Input 2:
//
//I am a Scaler
//Example Output
//
//Output 1:
//
//Harry loves Hagrid !
//Output 2:
//
//I am a Scaler
import java.util.Scanner;
public class PrintSentence {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        String sentence = ip.nextLine();
        System.out.print(sentence);

	}

}
