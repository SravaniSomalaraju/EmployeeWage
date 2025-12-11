public class CalcHours {
        public static void main(String[] args) {

            int MAX_HOURS = 100;
            int MAX_DAYS = 20;
            int WAGE_PER_HOUR = 20;

            int totalHours = 0, totalDays = 0;

            while (totalHours <= MAX_HOURS && totalDays < MAX_DAYS) {
                totalDays++;
                int hours = (int)(Math.random() * 3) == 1 ? 8 : 4;
                totalHours += hours;
            }

            int wage = totalHours * WAGE_PER_HOUR;
            System.out.println("Total Wage = " +wage);
}
    }

