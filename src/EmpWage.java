
    import java.util.*;

    public class EmpWage {

        HashMap<String, Integer> companyWageMap = new HashMap<>();

        public void addCompany(String company, int totalWage) {
            companyWageMap.put(company, totalWage);
        }

        public int getWage(String company) {
            return companyWageMap.getOrDefault(company, -1);
        }

        public static void main(String[] args) {
            EmpWage query = new EmpWage();

            query.addCompany("TCS", 30000);
            query.addCompany("Wipro", 25000);

            System.out.println("Wage for TCS = " + query.getWage("TCS"));
            System.out.println("Wage for Wipro = " + query.getWage("Wipro"));
}
    }

