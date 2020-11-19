/*
The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.

Input
The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.

Output
Write a single integer to output, denoting how many integers ti are divisible by k.

Example
Input:
7 3
1
51
966369
7
9
999996
11

Output:
4

*/






import java.io.*;
import java.util.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while(n-- != 0) {
            int t = sc.nextInt();
            if(t % k == 0)
                count++;
        }
        System.out.println(count);
	}
}







