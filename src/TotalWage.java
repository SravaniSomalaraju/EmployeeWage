public class TotalWage {

        String company;
        int totalWage;

        TotalWage(String company, int totalWage) {
            this.company = company;
            this.totalWage = totalWage;
        }

        @Override
        public String toString() {
            return company + " => Total Wage: " + totalWage;
}
    }

