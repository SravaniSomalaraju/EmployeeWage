public class RefactorMethod {


        static int WAGE_PER_HOUR = 20;

        public static int computeWage(int hours) {
            return hours * WAGE_PER_HOUR;
        }

        public static void main(String[] args) {
            int wage = computeWage(8);
            System.out.println("Wage = " +wage);
}
    }

