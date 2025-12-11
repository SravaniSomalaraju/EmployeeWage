
    import java.util.*;

    public class StoreDailyWage {
        String company;
        int wagePerHour;
        int maxDays;
        int maxHours;
        int totalWage;

        ArrayList<Integer> dailyWages = new ArrayList<>();

        public StoreDailyWage(String company, int wagePerHour, int maxDays, int maxHours) {
            this.company = company;
            this.wagePerHour = wagePerHour;
            this.maxDays = maxDays;
            this.maxHours = maxHours;
        }

        public void computeWage() {
            int totalHours = 0, totalDays = 0;

            while (totalHours <= maxHours && totalDays < maxDays) {
                totalDays++;
                int hours = (int)(Math.random() * 3) == 1 ? 8 : 4;
                int dailyWage = hours * wagePerHour;

                dailyWages.add(dailyWage);
                totalHours += hours;
            }

            totalWage = totalHours * wagePerHour;
        }

        @Override
        public String toString() {
            return company + " => Total Wage = " + totalWage + ", Daily Wages = " + dailyWages;
}
    }

