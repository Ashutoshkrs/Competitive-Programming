// Roots of a Quadratic Equation 
// Problem Code: QUADROOT

// Write a program to take the values for A, B, C of a quadratic equation A∗X2+B∗X+C=0 and then find all the roots of the equation. It is guaranteed that A ≠ 0 and that the equation has at least one real root.

// x1=−b+(b2−4ac)√2a
// x2=−b−(b2−4ac)√2a
// Input:
// First line will contain the value of A
// Second line will contain the value of B
// Third line will contain the value of C
// Output:
// Output two lines. First line contains the value of root 1 (x1) and second line contains the value of root 2 (x2). Your output will be considered to be correct if the difference between your output and the actual answer is not more than 10−6.

// Constraints
// −1000≤A≤1000
// −1000≤B≤1000
// −1000≤C≤1000
// Sample Input:
// 1
// -8
// 15
// Sample Output:
// 5
// 3


// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int A,B,C;
	    Scanner sc=new Scanner(System.in);
	    A=sc.nextInt();
	    B=sc.nextInt();
	    C=sc.nextInt();
	    double x1=(-B+Math.sqrt((B*B)-4*A*C))/(2*A);
	    double x2=(-B-Math.sqrt((B*B)-4*A*C))/(2*A);
	    System.out.println(x1+"\n"+x2);
	}
}