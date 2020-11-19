/*

Shivam is the youngest programmer in the world, he is just 12 years old. Shivam is learning programming and today he is writing his first program. 

Program is very simple, Given two integers A and B, write a program to add these two numbers.

Input
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains two Integers A and B.

Output
For each test case, add A and B and display it in a new line.

Constraints
1 ≤ T ≤ 1000
0 ≤ A,B ≤ 10000
Example
Input
3 
1 2
100 200
10 40

Output
3
300
50

*/


import java.io.*;
import java.util.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
           int n1 = sc.nextInt();
           int n2 = sc.nextInt();
           System.out.println(n1 + n2);
       }
	}
}






