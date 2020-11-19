/*


Given a binary number (of N
 bits) X
. Find the highest power of 2 that divides this number.

Note: If the binary number is "100" then the highest power of 2 that divides it is 2 (as 22
= 4)
Input:
The first line contains N the number of bits in the number
The next line contains a binary number of N bits
Output:
The first and only line contains the max power of 2 that divides the given number
Constraints:
1≤N≤105
1≤X
Sample Input:
5
10100
Sample Output:
2

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
        String s = sc.next();
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                System.out.println(n - 1 - i);
                break;
            }
        }// your code goes here
	}
}











