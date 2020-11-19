/*


Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

Output
For each test case, display the second largest among A, B and C, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 1000000
Example
Input
3 
120 11 400
10213 312 10
10 3 450

Output

120
312
10

*/



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[3];
        while(n-- != 0) {
            for(int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
        }// your code goes here
	}
}









