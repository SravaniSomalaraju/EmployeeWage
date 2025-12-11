
    import java.util.ArrayList;

    public class ListEmployee {

        // Class to hold company wage details
        class TotalWage {
            String company;
            int wagePerHour;
            int maxDays;
            int maxHours;
            int totalWage;
            ArrayList<Integer> dailyWages = new ArrayList<>();

            TotalWage(String company, int wagePerHour, int maxDays, int maxHours) {
                this.company = company;
                this.wagePerHour = wagePerHour;
                this.maxDays = maxDays;
                this.maxHours = maxHours;
            }

            @Override
            public String toString() {
                return company + " => Total Wage = " + totalWage + ", Daily Wages = " + dailyWages;
            }
        }

        // Refactored: Using ArrayList instead of Array
        ArrayList<TotalWage> companyList = new ArrayList<>();

        public void addCompany(String company, int wagePerHour, int maxDays, int maxHours) {
            companyList.add(new TotalWage(company, wagePerHour, maxDays, maxHours));
        }

        public void computeWages() {
            for (TotalWage c : companyList) {
                c.totalWage = computeCompanyWage(c);
                System.out.println(c);
            }
        }

        private int computeCompanyWage(TotalWage company) {
            int totalHours = 0, totalDays = 0;

            while (totalHours <= company.maxHours && totalDays < company.maxDays) {
                totalDays++;

                int empCheck = (int)(Math.random() * 3);
                int hours = (empCheck == 1 ? 8 : (empCheck == 2 ? 4 : 0));

                int dailyWage = hours * company.wagePerHour;
                company.dailyWages.add(dailyWage);

                totalHours += hours;
            }

            return totalHours * company.wagePerHour;
        }

        public static void main(String[] args) {
            ListEmployee obj = new ListEmployee();

            obj.addCompany("TCS", 20, 20, 100);
            obj.addCompany("Wipro", 25, 18, 90);

            obj.computeWages();
}
    }

