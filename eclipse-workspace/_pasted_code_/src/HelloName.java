/*
 ** file:    HelloName.java
 ** purpose: get user name and print “Hello name”
 */

import java.util.Scanner;
 
public class HelloName {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       		System.out.printf("Enter your name: ");
       		String name = scan.nextLine();
       		System.out.printf("Hello " + name + "\n");

	} 
}