public class Lab_Task_Q6 {
   // a. Using a third variable 
    public static void main(String[]args){
        int a = 5;
        int b = 9;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

       // b. Without using a third variable
        int a = 5;
        int b = 9;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
}
