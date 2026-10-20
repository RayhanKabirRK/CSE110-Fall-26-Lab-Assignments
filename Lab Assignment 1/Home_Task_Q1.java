public class Home_Task_Q1 {
    public static void main(String[]args){
        int number_of_minutes = 3456789;

        int number_of_minutes_in_a_year = 365*24*60;
        int number_of_minutes_in_a_day = 24*60;

        int years = number_of_minutes / number_of_minutes_in_a_year;
        int leftover_minutes = number_of_minutes % number_of_minutes_in_a_year;
        int days = leftover_minutes / number_of_minutes_in_a_day;

        System.out.println(number_of_minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
