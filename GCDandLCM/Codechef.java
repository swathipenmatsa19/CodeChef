/*

Two integers A and B are the inputs. Write a program to find GCD and LCM of A and B.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer A and B.

Output
Display the GCD and LCM of A and B separated by space respectively. The answer for each test case must be displayed in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B ≤ 1000000
Example
Input
3 
120 140
10213 312
10 30

Output

20 840
1 3186456
10 30

*/


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int gcd(int a, int b) {
        if(b % a == 0)
            return a;
        else
            return gcd(b%a, a);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int g;
            if(b > a)
                g = gcd(a, b);
            else
                g = gcd(b, a);
            System.out.println(g + " " + ((long)b*a)/g);
        }
    }
}











