public class Home_Task_Q3 { 
    public static void main(String[]args){
        int id = 1000054943;

        int lastDigit = id % 10;
        int secondLastDigit = (id / 10) % 10;

        System.out.println(lastDigit);
        System.out.println(secondLastDigit);
    }

}
