public class UseSwitch {

    public static void main(String[] args) {

        int FULL_DAY = 1;
        int PART_TIME = 2;
        int WAGE_PER_HOUR = 20;

        int empCheck = (int)(Math.random() * 3);

        int hours = switch (empCheck) {
            case 1 -> 8;
            case 2 -> 4;
            default -> 0;
        };

        int wage = hours * WAGE_PER_HOUR;

        System.out.println("Employee Wage = " +wage);
}
}