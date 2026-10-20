public class Lab_Task_Q2 {
//2.1: Declare, initialize, and print an integer
int a = 10;
System.out.println(a);

//2.2: Add a second integer
int b = 3;
int sum = a + b;
System.out.println(sum);

//2.3: Product and division
System.out.println(a * b);
System.out.println(a / b);

2.4: Repeat with doubles
double x = 10.5;
double y = 2.5;

System.out.println(x);
System.out.println(x + y);
System.out.println(x * y);
System.out.println(x / y);

//2.5: One double and one int
double p = 7.5;
int q = 2;

System.out.println(p);
System.out.println(p + q);
System.out.println(p * q);
System.out.println(p / q);

//2.6: Strings
String s1 = "Hello";
String s2 = "World";
System.out.println(s1);
System.out.println(s1 + s2);

int n = 5;
String word = "apples";
System.out.println(n + word);
System.out.println(word + n);

// How + works with Strings: 
// If either side is a String, + joins them (concatenation) instead of adding. 
// An int plus a String works in either order, and the number is turned into text.
// You’ll also notice no space is added automatically, unlike Python’s print with commas.
}
