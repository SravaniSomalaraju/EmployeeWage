public class PartTimeEmployee {

    public static void main(String[] args) {

        int FULL_DAY = 1;
        int PART_TIME = 2;

        int WAGE_PER_HOUR = 20;

        int empCheck = (int)(Math.random() * 3);

        int hours = 0;

        switch(empCheck) {
            case 1: hours = 8; break;
            case 2: hours = 4; break;
            default: hours = 0;
        }

        int wage = hours * WAGE_PER_HOUR;

        System.out.println("Employee Wage = " +wage);
}
}
