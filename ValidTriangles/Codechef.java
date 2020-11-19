/*


Write a program to check whether a triangle is valid or not, when the three angles of the triangle are the inputs. A triangle is valid if the sum of all the three angles is equal to 180 degrees.

Input
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three angles A, B and C, of the triangle separated by space.

Output
For each test case, display 'YES' if the triangle is valid, and 'NO', if it is not, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 180
Example
Input

3 
40 40 100
45 45 90
180 1 1
Output

YES
YES
NO

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
        int sum = 0;
        while(n-- != 0) {
            int i = 3;
            while( i-- != 0) 
                sum += sc.nextInt();
            if(sum == 180)
                System.out.println("YES");
            else
                System.out.println("NO");
            sum = 0;
        }// your code goes here
	}
}











