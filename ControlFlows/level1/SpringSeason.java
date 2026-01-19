package ControlFlows.level1;

/**
 * The SpringSeason class determines if a given date (month and day)
 * falls within the Spring season range. In this logic, Spring is defined
 * from March 20th to June 20th. It uses command-line arguments for input.
 */
class SpringSeason {
    public static void main(String[] args) {

        // Parse command-line arguments into integers for month and day
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Logic to determine if the date is within the Spring range:
        // 1. Starts from March 20 (month 3, day >= 20)
        // 2. Includes all of April and May (month > 3 and < 6)
        // 3. Ends on June 20 (month 6, day <= 20)
        boolean isSpring = (month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20);

        // Evaluate the boolean and print the corresponding message
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}