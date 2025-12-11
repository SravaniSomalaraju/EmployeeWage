public class MulCompanies {
        public static int computeWage(String company, int wagePerHour, int maxDays, int maxHours) {

            int totalHours = 0, totalDays = 0;

            while (totalHours <= maxHours && totalDays < maxDays) {
                totalDays++;
                int hours = (int)(Math.random() * 3) == 1 ? 8 : 4;
                totalHours += hours;
            }

            int totalWage = totalHours * wagePerHour;
            System.out.println(company + " : Total Wage = " + totalWage);
            return totalWage;
}
    }

