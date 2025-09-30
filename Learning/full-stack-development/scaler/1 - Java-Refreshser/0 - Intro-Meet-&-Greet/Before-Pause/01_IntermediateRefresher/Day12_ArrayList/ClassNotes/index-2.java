import java.lang.*;
import java.util.*;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Array
// -> fixed Size
// -> Size should be known

// ArrayList
// Dynamic Size
// train coahes
// shopping cart
// new tabs



public class Main {

  /*
  Q1: Given as arraylist as input, return an arraylist of the multiples
  of either 5 or 7.

  Input: [1, 5, 3, 0, 7]
  Output: [5, 0, 7]

  */

  public static ArrayList<Integer> multiples(ArrayList<Integer> list){
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0;i<list.size();i++){
      int temp = list.get(i);
      if(temp%5==0 || temp %7==0){
        ans.add(temp);
      }
    }

    return ans;

  }

  /*
  Q2: Given 2 integers A and B as input, return an arraylist containing
  first B multiples of A.

  Input: A = 2, B = 4
  Output: [2, 4, ,6, 8]
  2*1, 2*2, 2*3, 2*4
  A*1, A*2, ....., A*B
  */
// a = 3, b = 5
  public static ArrayList<Integer> firstB(int a, int b){
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=1;i<=b;i++){
      int temp = a*i;
      ans.add(temp);
    }

    return ans;
  }


  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
      // Syntax
      // ArrayList<Type> list = new ArrayList<>();
      // Type -> Class

      // Primitives -> int, long, double, float, boolean
      // Wrapper Class -> Integer, Long, Double, Float, Boolean

      ArrayList<Integer> list = new ArrayList<>();
      // System.out.println(list);
      // System.out.println("size is "+list.size());

      // // Basic Ops

      // //add
      // list.add(2);
      // list.add(-1);
      // list.add(5);

      // System.out.println(list);

      //get
      // System.out.println(list.get(1));
      // System.out.println(list.get(-1));
      // System.out.println(list.get(3));

      //size
      // System.out.println("size is "+list.size());

      //remove
      // list.remove(1);
      // System.out.println(list);

      //set/update
      // list.set(1,8);
      // System.out.println(list);

    int n = scn.nextInt();
    for(int i=0;i<n;i++){
      // int temp = scn.nextInt();
      list.add(scn.nextInt());
    }

    // list.add(500);
    // list.add(1000);

    System.out.println(list);
    // ArrayList<Integer> res = multiples(list);
    // System.out.println(res);

    // ArrayList<Integer> res = firstB(3,5);
    // System.out.println(res);




  }
}