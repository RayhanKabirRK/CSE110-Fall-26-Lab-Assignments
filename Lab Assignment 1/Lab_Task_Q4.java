public class Lab_Task_Q4 {
    public static void main(String[]args){
        int a= 1234567;

        int last_digit = a % 10;
        int second_last_digit = (a / 10) % 10;

        System.out.println("Second last digit: " + second_last_digit);
        System.out.println("Last digit: " + last_digit);
    }
}
