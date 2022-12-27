// Assign zero
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a sequence of 5 integers A.
// Initially, Ai (1 ≤ i ≤ 5) assigns i.

// But due to some glitch, one of the integers in the array becomes 0.
// Find out which integer of A assigned 0.
// Input
// The first line contains 5 integers A1, A2 ... A5.

// Constraints
// The values of A1, A2, A3, A4, A5 given as input are a possible outcome of the assignment.
// Output
// If the integer assigned 0 was Ai, print the integer i.
// Example
// Sample Input 1:
// 0 2 3 4 5

// Sample Output 1:
// 1


// Sample Input 2:
// 1 2 0 4 5

// Sample Output 2:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    int arr[]  = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
      if (arr[i] == 0) {
        System.out.println(i + 1); 
      }
    }
  }
}
