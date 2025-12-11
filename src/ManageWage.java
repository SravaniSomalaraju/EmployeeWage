
    import java.util.*;

    public class ManageWage {

        ArrayList<ManageWage> companies = new ArrayList<>();

        public void addCompany(String company, int wage) {
            companies.add(new ManageWage());
        }

        public void showWages() {
            for (ManageWage c : companies)
                System.out.println(c);
}
    }

