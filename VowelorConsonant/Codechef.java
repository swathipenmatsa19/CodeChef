/*

Write a program to take a character (C)
 as input and check whether the given character is a vowel or a consonant.

NOTE:−
 Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.

Input:
First line will contain the character C
.
Output:
Print "Vowel" if the given character is a vowel, otherwise print "Consonant".

Constraints
C
 will
 be
 an
 upper
 case
 English
 alphabet
Sample Input:
Z
Sample Output:
Consonant

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
        String s = sc.next();
        if(s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");	// your code goes here
	}
}













