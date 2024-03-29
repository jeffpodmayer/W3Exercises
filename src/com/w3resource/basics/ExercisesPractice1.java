package com.w3resource.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//HERE Are THE SOLUTIONS --> https://www.w3resource.com/java-exercises/basic/index.php

//Write methods to solve each exercise and then call the methods in the Application class.

public class ExercisesPractice1 {

//	1. Write a Java program to print 'Hello' on screen and your name on a separate line.
//	Expected Output :
//	Hello
//	Alexandra Abramov

	void exercise1(String name) {
		System.out.println("Hello " + name);
	}

////////////////////	
//	2. Write a Java program to print the sum of two numbers.
//	Test Data:
//	74 + 36
//	Expected Output :
//	110

	void exercise2(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		System.out.println(sum);
	}

////////////////////	
//	3. Write a Java program to divide two numbers and print them on the screen.
//	Test Data :
//	50/3
//	Expected Output :
//	16

	void exercise3(int numberOne, int numberTwo) {
		int solution = numberOne / numberTwo;
		System.out.println(solution);
	}

////////////////////	
//	4.Write a Java program to print the results of the following operations.
//	Test Data:
//	a. -5 + 8 * 6
//	b. (55+9) % 9
//	c. 20 + -3*5 / 8
//	d. 5 + 15 / 3 * 2 - 8 % 3
//	Expected Output :
//	43
//	1
//	19
//	13

	void exercise4() {
		int a = -5 + 8 * 6;
		int b = (55 + 9) % 9;
		int c = 20 + -3 * 5 / 8;
		int d = 5 + 15 / 3 * 2 - 8 % 3;

		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
	}

////////////////////
//	5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//	Test Data:
//	Input first number: 25
//	Input second number: 5
//	Expected Output :
//	25 x 5 = 125

	void exercise5(int one, int two) {
		int total = one * two;
		System.out.println(one + " x " + two + " = " + total);
	}

/////////////////////
//	6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//	Test Data:
//	Input first number: 125
//	Input second number: 24
//	Expected Output :
//	125 + 24 = 149
//	125 - 24 = 101
//	125 x 24 = 3000
//	125 / 24 = 5
//	125 mod 24 = 5

	void exercise6(int one, int two) {
		int sum = one + two;
		int subtract = one - two;
		int multiply = one * two;
		int divide = one / two;
		int remainder = one % two;
		System.out.println(one + " + " + two + " = " + sum);
		System.out.println(one + " - " + two + " = " + subtract);
		System.out.println(one + " x " + two + " = " + multiply);
		System.out.println(one + " / " + two + " = " + divide);
		System.out.println(one + " % " + two + " = " + remainder);

	}

/////////////////////
//	7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//	Test Data:
//	Input a number: 8
//	Expected Output :
//	8 x 1 = 8
//	8 x 2 = 16
//	8 x 3 = 24
//	...
//	8 x 10 = 80

	public void exercise7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		int userEntry = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= 10; i++) {
			int solution = userEntry * i;
			System.out.println(userEntry + " x " + i + " = " + solution);

		}
	}

/////////////////////	
//	8. Write a Java program to display the following pattern.
//	Sample Pattern :
//
//	   J    a   v     v  a                                                  
//	   J   a a   v   v  a a                                                 
//	J  J  aaaaa   V V  aaaaa                                                
//	 JJ  a     a   V  a     a

	void exercise8() {
		System.out.println("   J    a   v     v  a");
		System.out.println("   J   a a   v   v  a a  ");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");
		System.out.println();

	}

///////////////////	
//	9. Write a Java program to compute the specified expressions and print the output.
//	Test Data:
//	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//	Expected Output
//	2.138888888888889

	void exercise9() {
		double output = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(output);
	}

////////////////////
//	10. Write a Java program to compute a specified formula.
//	Specified Formula :
//	4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//	Expected Output
//	2.9760461760461765

	void exercise10() {
		double solution = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println(solution);
	}

////////////////////	
//	11. Write a Java program to print the area and perimeter of a circle.
//	Test Data:
//	Radius = 7.5
//	Expected Output
//	Perimeter is = 47.12388980384689
//	Area is = 176.71458676442586

	void exercise11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your radius?");
		Double radius = scanner.nextDouble();
		scanner.close();

		Double perimeter = radius * Math.PI * 2;
		Double area = Math.pow(radius, 2) * Math.PI;

		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}

////////////////////
//	12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

	void exercise12() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter three numbers --> Hit ENTER after each one!");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		scanner.close();

		System.out.println("The average of those number is: " + ((num1 + num2 + num3) / 3));
	}
////////////////////
//	13. Write a Java program to print the area and perimeter of a rectangle.
//	Test Data:
//	Width = 5.5 Height = 8.5
//	Expected Output
//	Area is 5.6 * 8.5 = 47.60
//	Perimeter is 2 * (5.6 + 8.5) = 28.20

	void exercise13() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the width of your rectangle:");
		Double width = scanner.nextDouble();
		System.out.println("Enter the heght of your rectangle:");
		Double height = scanner.nextDouble();
		scanner.close();

		Double area = width * height;
		Double perimeter = (width + height) * 2;

		System.out.println("Area is " + area);
		System.out.println("Perimeter is " + perimeter);

	}

////////////////////	
//	14. Write a Java program to print an American flag on the screen.
//	Expected Output
//
//	* * * * * * ==================================                          
//	 * * * * *  ==================================                          
//	* * * * * * ==================================                          
//	 * * * * *  ==================================                          
//	* * * * * * ==================================                          
//	 * * * * *  ==================================                          
//	* * * * * * ==================================                          
//	 * * * * *  ==================================                          
//	* * * * * * ==================================                          
//	==============================================                          
//	==============================================                          
//	==============================================                          
//	==============================================                          
//	==============================================                          
//	==============================================

	void exercise14() {
		for (int i = 0; i < 6; i++) {
			System.out.println("* * * * * * ==================================");
			System.out.println(" * * * * *  ==================================");
		}
		System.out.println("* * * * * * ==================================");

		for (int i = 0; i < 6; i++) {
			System.out.println("==============================================");
		}

	}
///////////////////
//	15. Write a Java program to swap two variables.

	void exercise15() {
		String a = "rowdy";
		String b = "donkey";
		String temp;

		System.out.println("Before swap: " + a + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After swap: " + a + b);

	}

///////////////////	
//	16. Write a Java program to print a face.
//	Expected Output
//
//	 +"""""+                                                 
//	[| o o |]                                                
//	 |  ^  |                                                 
//	 | '-' |                                                 
//	 +-----+

	void exercise16() {
		System.out.println("  +\"\"\"\"\"+");
		System.out.println(" [| o o |] ");
		System.out.println("  |  ^  |");
		System.out.println("  | '-' |");
		System.out.println("  +-----+");
	}

	// NUMBERS ORIENTED EXERCISES BELOW
///////////////////		
//	17. Write a Java program to add two binary numbers.
//	Input Data:
//	Input first binary number: 10
//	Input second binary number: 11
//	Expected Output
//
//	Sum of two binary numbers: 101

	void exercise17() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input first binary number: ");
		Integer firstNumber = scanner.nextInt();
		System.out.println("Input first binary number: ");
		Integer secondNumber = scanner.nextInt();
		scanner.close();

		System.out.println("The SUM of those two numbers is: " + (firstNumber + secondNumber));

	}

///////////////////	
//	18. Write a Java program to multiply two binary numbers.
//	Input Data:
//	Input the first binary number: 10
//	Input the second binary number: 11
//	Expected Output
//
//	Product of two binary numbers: 110 

//////////////////	
//	19. Write a Java program to convert an integer number to a binary number.
//	Input Data:
//	Input a Decimal Number : 5
//	Expected Output
//
//	Binary number is: 101 

//////////////////	
//	20. Write a Java program to convert a decimal number to a hexadecimal number.
//	Input Data:
//	Input a decimal number: 15
//	Expected Output
//
//	Hexadecimal number is : F 

//////////////////
//	21. Write a Java program to convert a decimal number to an octal number.
//	Input Data:
//	Input a Decimal Number: 15
//	Expected Output
//
//	Octal number is: 17 

//////////////////
//	22. Write a Java program to convert a binary number to a decimal number.
//	Input Data:
//	Input a binary number: 100
//	Expected Output
//
//	Decimal Number: 4 

//////////////////	
//	23. Write a Java program to convert a binary number to a hexadecimal number.
//	Input Data:
//	Input a Binary Number: 1101
//	Expected Output
//
//	HexaDecimal value: D

//////////////////
//	24. Write a Java program to convert a binary number to an octal number.
//	Input Data:
//	Input a Binary Number: 111
//	Expected Output
//
//	Octal number: 7 

//////////////////
//	25. Write a Java program to convert a octal number to a decimal number.
//	Input Data:
//	Input any octal number: 10
//	Expected Output
//
//	Equivalent decimal number: 8

//////////////////
//	26. Write a Java program to convert a octal number to a binary number.
//	Input Data:
//	Input any octal number: 7
//	Expected Output
//
//	Equivalent binary number: 111 

//////////////////
//	27. Write a Java program to convert a octal number to a hexadecimal number.
//	Input Data:
//	Input a octal number : 100
//	Expected Output
//
//	Equivalent hexadecimal number: 40

//////////////////
//	28. Write a Java program to convert a hexadecimal value into a decimal number.
//	Input Data:
//	Input a hexadecimal number: 25
//	Expected Output
//
//	Equivalent decimal number is: 37

//////////////////
//	29. Write a Java program to convert a hexadecimal number into a binary number.
//	Input Data:
//	Enter Hexadecimal Number : 37
//	Expected Output
//
//	Equivalent Binary Number is: 110111

//////////////////
//	30. Write a Java program to convert a hexadecimal value into an octal number.
//	Input Data:
//	Input a hexadecimal number: 40
//	Expected Output
//
//	Equivalent of octal number is: 100 

//////////////////
//	31. Write a Java program to check whether Java is installed on your computer.
//	Expected Output
//
//	Java Version: 1.8.0_71                                                            
//	Java Runtime Version: 1.8.0_71-b15                                                
//	Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
//	Java Vendor: Oracle Corporation                                                   
//	Java Vendor URL: http://Java.oracle.com/                                          
//	Java Class Path: .

	void exercise31() {
		System.out.println("Jave Version: " + System.getProperty("java.version"));
		System.out.println("Jave Runtime Version: " + System.getProperty("java.runtime"));
		System.out.println("Jave Home: " + System.getProperty("java.home"));
		System.out.println("Jave Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Jave Venodr URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Jave Class Path: " + System.getProperty("java.class.path"));

	}

//////////////////
//	32. Write a Java program to compare two numbers.
//	Input Data:
//	Input first integer: 25
//	Input second integer: 39
//	Expected Output
//
//	25 != 39                                                                          
//	25 < 39                                                                           
//	25 <= 39

	void exercise32() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input first integer: ");
		Integer firstInteger = scanner.nextInt();
		System.out.println("Input second integer: ");
		Integer secondInteger = scanner.nextInt();

		System.out.println(firstInteger + " != " + secondInteger);
		System.out.println(firstInteger + " < " + secondInteger);
		System.out.println(firstInteger + " <= " + secondInteger);

	}

//////////////////
//	33. Write a Java program and compute the sum of an integer's digits.
//	Input Data:
//	Input an integer: 25
//	Expected Output
//
//	The sum of the digits is: 7

	void exercise33() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an integer: ");
		Integer input = scanner.nextInt();
		scanner.close();

		Integer sum = 0;

		while (input != 0) {
			sum += input % 10;
			input /= 10;
		}

		System.out.println("The sum of the digits is: " + sum);
	}

//////////////////
//	34. Write a Java program to compute hexagon area.
//	Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//	where s is the length of a side
//	Input Data:
//	Input the length of a side of the hexagon: 6
//	Expected Output
//
//	The area of the hexagon is: 93.53074360871938

//////////////////
//	35. Write a Java program to compute the area of a polygon.
//	Area of a polygon = (n*s^2)/(4*tan(π/n))
//	where n is n-sided polygon and s is the length of a side
//	Input Data:
//	Input the number of sides on the polygon: 7
//	Input the length of one of the sides: 6
//	Expected Output
//
//	The area is: 130.82084798405722

//////////////////
//	36. Write a Java program to compute the distance between two points on the earth's surface.
//	Distance between the two points [ (x1,y1) & (x2,y2)]
//	d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//	Radius of the earth r = 6371.01 Kilometers
//	Input Data:
//	Input the latitude of coordinate 1: 25
//	Input the longitude of coordinate 1: 35
//	Input the latitude of coordinate 2: 35.5
//	Input the longitude of coordinate 2: 25.5
//	Expected Output
//
//	The distance between those points is: 1480.0848451069087 km 

//////////////////
//	37. Write a Java program to reverse a string.
//	Input Data:
//	Input a string: The quick brown fox
//	Expected Output
//
//	Reverse string: xof nworb kciuq ehT

	void exercise37() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string: ");
		String input = scanner.nextLine();
		scanner.close();

		Integer index = input.length() - 1;

		while (index >= 0) {
			System.out.print(input.charAt(index));
			index--;
		}
	}

//////////////////
//	38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
//	Expected Output
//
//	The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//	letter: 23                                               
//	space: 9                                                 
//	number: 10                                               
//	other: 6

	void exercise38() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string: ");
		String input = scanner.nextLine();
		scanner.close();

		char[] countThem = input.toCharArray();

		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int other = 0;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(countThem[i])) {
				letters++;
			} else if (Character.isDigit(countThem[i])) {
				numbers++;
			} else if (Character.isSpaceChar(countThem[i])) {
				spaces++;
			} else {
				other++;
			}
		}

		System.out.println("The strng you entered was: " + input);
		System.out.println("Letters: " + letters);
		System.out.println("Spaces: " + spaces);
		System.out.println("Numbers: " + numbers);
		System.out.println("Other: " + other);

	}

//////////////////
////	39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
//	Expected Output
//
//	123                                                      
//	124                                                      
//	...                                            
//	                                                   
//	431                                                      
//	432                                                      
//	Total number of the three-digit-number is 24

	void exercise39() {
		int counter = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (k != i && k != j && i != j) {
						counter++;
						System.out.println(i + "" + j + "" + k);
					}

				}
			}
		}
		System.out.println("The total number of numbers is: " + counter);
	}

//////////////////
//	40. Write a Java program to list the available character sets in charset objects.
//	Expected Output
//
//	List of available character sets:                                       
//	Big5                                                                    
//	Big5-HKSCS                                                              
//	CESU-8                                                                  
//	EUC-JP                                                                  
//	EUC-KR                                                                  
//	GB18030                                                                 
//	GB2312                                                                  
//	GBK                                                                     
//	                                                     
//	...                                            
//	                                                   
//	x-SJIS_0213                                                             
//	x-UTF-16LE-BOM                                                          
//	X-UTF-32BE-BOM                                                          
//	X-UTF-32LE-BOM                                                          
//	x-windows-50220                                                         
//	x-windows-50221                                                         
//	x-windows-874                                                           
//	x-windows-949                                                           
//	x-windows-950                                                           
//	x-windows-iso2022jp

//////////////////
//	41. Write a Java program to print the ASCII value of a given character.
//	Expected Output
//
//	The ASCII value of Z is :90

//////////////////
//	42. Write a Java program to input and display your password.
//	Expected Output
//
//	Input your Password:                                                    
//	Your password was: abc@123

	void exercise42() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your password: ");

		String password = scanner.nextLine();
		scanner.close();

		System.out.println("Your password was: " + password);
		;
	}

//////////////////
//	43. Write a Java program to print the following string in a specific format (see output).
//	Sample Output
//
//	Twinkle, twinkle, little star,
//		How I wonder what you are! 
//			Up above the world so high,   		
//			Like a diamond in the sky. 
//	Twinkle, twinkle, little star, 
//		How I wonder what you are

//////////////////
//	44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//	Sample Output:
//
//	Input number: 5                                                        
//	5 + 55  + 555

	void exercise44() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		String input = scanner.nextLine();

		scanner.close();

		System.out.println(input + " + " + input + "" + input + " + " + input + "" + input + "" + input);
	}

//////////////////
//	45. Write a Java program to find the size of a specified file.
//	Sample Output:
//
//	/home/students/abc.txt  : 0 bytes                                      
//	/home/students/test.txt : 0 bytes

//////////////////
//	46. Write a Java program to display system time.
//	Sample Output:
//
//	Current Date time: Fri Jun 16 14:17:40 IST 2017 

	void exercise46() {
		DateTimeFormatter formatted = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss a");
		LocalDateTime now = LocalDateTime.now();

		System.out.println(now.format(formatted));
	}

//////////////////
//	47. Write a Java program to display the current date and time in a specific format.
//	Sample Output:
//
//	Now: 2017/06/16 08:52:03.066 

	void exercise47() {
		DateTimeFormatter formatit = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss.SSS");
		LocalDateTime now = LocalDateTime.now();

		System.out.println(now.format(formatit));
	}

//////////////////
//	48. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
//	Sample Output:
//
//	1                                                                      
//	3                                                                      
//	5                                                                      
//	7                                                                      
//	9                                                                      
//	11                                                                     
//	....                                                                     
//	                                                                    
//	91                                                                     
//	93                                                                     
//	95                                                                     
//	97                                                                     
//	99  
//	

	void exercise48() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

//////////////////
//	49. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
//	Sample Output:
//
//	Input a number: 20                                                     
//	1

	void exercise49() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a number: ");
		Integer input = scanner.nextInt();
		scanner.close();

		if (input % 2 == 1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

//////////////////
//	50. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
//	Sample Output:
//
//	Divided by 3:                                                          
//	3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
//	, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
//	                                                                       
//	Divided by 5:                                                          
//	5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
//	95,                                                                    
//	                                                                       
//	Divided by 3 & 5:                                                      
//	15, 30, 45, 60, 75, 90,

	void exercise50() {
		System.out.println("Divided by 3:");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}

		System.out.println("\n\nDivided by 5:");
		for (int j = 1; j <= 100; j++) {
			if (j % 5 == 0) {
				System.out.print(j + ", ");
			}
		}

		System.out.println("\n\nDivide by 3 & 5:");
		for (int k = 1; k <= 100; k++) {
			if (k % 5 == 0 && k % 3 == 0) {
				System.out.print(k + ", ");
			}
		}

	}

//////////////////
//	51. Write a Java program to convert a string to an integer.
//	Sample Output:
//
//	Input a number(string): 25                                             
//	The integer value is: 25

	void exercise51() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a number(string): ");
		String input = scanner.nextLine();
		scanner.close();

		Integer numInput = Integer.parseInt(input);

		System.out.println("The integer value is: " + numInput);
	}

//////////////////
//	52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//			Sample Output:
//
//			Input the first number : 5                                             
//			Input the second number: 10                                            
//			Input the third number : 15                                            
//			The result is: true

	void exercise52() {
		Scanner scanner = new Scanner(System.in);
		Boolean result = false;

		System.out.println("Input the first number: ");
		Integer firstInput = scanner.nextInt();
		System.out.println("Input the second number: ");
		Integer secondInput = scanner.nextInt();
		System.out.println("Input the third number: ");
		Integer thirdInput = scanner.nextInt();
		scanner.close();

		if (firstInput + secondInput == thirdInput) {
			result = true;
		}

		System.out.println("The result is: " + result);

	}
//////////////////
//	53. Write a Java program that accepts three integers from the user. It returns true 
//  if the second number is higher than the first number and the third number is larger than 
//	the second number. If "abc" is true, the second number does not need to be larger than the first number.
//	Sample Output:
//
//	Input the first number : 5                                             
//	Input the second number: 10                                            
//	Input the third number : 15                                            
//	The result is: true

	void exercise53() {
		Scanner scanner = new Scanner(System.in);
		Boolean result = false;

		System.out.println("Input the first number: ");
		Integer firstNum = scanner.nextInt();
		System.out.println("Input the second number: ");
		Integer secondNum = scanner.nextInt();
		System.out.println("Input the third number: ");
		Integer thirdNum = scanner.nextInt();
		scanner.close();

		if (secondNum > firstNum && thirdNum > secondNum) {
			result = true;
			System.out.println("The result is: " + result);
		} else {
			System.out.println("The result is: " + result);
		}

	}

//////////////////
//	54. Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.
//	Sample Output:
//
//	Input the first number : 5                                             
//	Input the second number: 10                                            
//	Input the third number : 15                                            
//	The result is: true

	void exercise54() {
		Scanner scanner = new Scanner(System.in);
		Boolean result = false;

		System.out.println("Input the first number(not negative): ");
		Integer firstNum = scanner.nextInt();
		System.out.println("Input the second number(not negative): ");
		Integer secondNum = scanner.nextInt();
		System.out.println("Input the third number(not negative): ");
		Integer thirdNum = scanner.nextInt();
		scanner.close();

		if (firstNum % 10 == secondNum % 10 || secondNum % 10 == thirdNum % 10 || thirdNum % 10 == firstNum % 10) {
			result = true;
			System.out.println("The result is: " + result);
		} else {
			System.out.println("The result is: " + result);
		}

	}

//////////////////
//	55. Write a Java program to convert seconds to hours, minutes and seconds.
//	Sample Output:
//
//	Input seconds: 86399                                                   
//	23:59:59

//////////////////
//	56. Write a Java program to find the number of values in a given range divisible by a given value.
//	For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//	Sample Output:
//
//	5

//////////////////
//	57. Write a Java program to accept an integer and count the factors of the number.
//	Sample Output:
//
//	Input an integer: 25                                                   
//	3

//////////////////
//	58. Write a Java program to capitalize the first letter of each word in a sentence.
//	Sample Output:
//
//	Input a Sentence: the quick brown fox jumps over the lazy dog.         
//	The Quick Brown Fox Jumps Over The Lazy Dog.

	public void exercise58() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a lowercase sentence that is: ");
		String sentence = scanner.nextLine();

		scanner.close();

		String[] wordList = sentence.split(" ");

		for (String word : wordList) {
			String newWord = word.replace(word.charAt(0), word.toUpperCase().charAt(0));
			System.out.print(newWord + " ");
		}

	}

//////////////////
//	59. Write a Java program to convert a string into lowercase.
//	Sample Output:
//
//	Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
//	the quick brown fox jumps over the lazy dog.

	public void exercise59() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		String sentence = scanner.nextLine();

		scanner.close();

		String[] wordList = sentence.split(" ");

		for (String word : wordList) {
			String newWord = word.toLowerCase();
			System.out.print(newWord + " ");
		}

	}
//////////////////
//	60. Write a Java program to find the penultimate (next to the last) word in a sentence.
//	Sample Output:
//
//	Input a String: The quick brown fox jumps over the lazy dog.
//	Penultimate word: lazy

//////////////////
//	61. Write a Java program to reverse a word.
//	Sample Output:
//
//	Input a word: dsaf
//	Reverse word: fasd

//////////////////
//	62. Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.
//	Sample Output:
//
//	Input the first number : 15                                            
//	Input the second number: 20                                            
//	Input the third number : 25                                            
//	false

//////////////////
//	63. Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
//			Sample Output:
//
//			Input the first number : 12                                            
//			Input the second number: 13                                            
//			Result: 13

//////////////////
//	64. Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
//	Sample Output:
//
//	Input the first number : 35                                            
//	Input the second number: 45                                            
//	Result: tr

//////////////////
//	65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
//	Sample Output:
//
//	Input the first number : 19                                            
//	Input the second number: 7                                             
//	5   

//////////////////
//	66. Write a Java program to compute the sum of the first 100 prime numbers.
//	Sample Output:
//
//	Sum of the first 100 prime numbers: 24133 

//////////////////
//	67. Write a Java program to insert a word in the middle of another string.
//	Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
//	Sample Output:
//
//	Python Tutorial 3.0

//////////////////
//	68. Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above.
//	Sample Output:
//
//	3.03.03.03.0 

//////////////////
//	69. Write a Java program to extract the first half of a even string.
//	Test Data: Python
//	Sample Output:
//	Pyt

//////////////////
//	70. Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.
//	Test Data: Str1 = Python
//	Str2 = Tutorial
//	Sample Output:
//
//	PythonTutorialPython

//////////////////
//	71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
//	Test Data: Str1 = Python
//	Str2 = Tutorial
//	Sample Output:
//
//	ythonutorial

//////////////////
//	72. Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.
//	Test Data: Str1 = " "
//	Sample Output:
//
//	###

//////////////////
//	73. Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters.
//	Test Data: str1 = "Python"
//	str2 = " "
//	Sample Output:
//
//	P#

/////////////////
//	74. Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
//	Sample Output:
//	Test Data: array = 10, -20, 0, 30, 40, 60, 10
//
//	true

/////////////////
//	75. Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
//	Test Data: array = 50, -20, 0, 30, 40, 60, 10
//	Sample Output:
//
//	false

	public void exercise75() {
		Integer[] integerArray = new Integer[10];
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			Integer number = random.nextInt(5);
			integerArray[i] = number;
		}

		Integer lastNum = integerArray[9];
		Integer firstNum = integerArray[0];

		System.out.println(Arrays.toString(integerArray));

		if (lastNum == firstNum) {
			System.out.println("TRUE!!");
		} else {
			System.out.println("FALSE!!");
		}
	}

}
