package Cases;

class InvalidVoterException extends Exception {
    public InvalidVoterException() {
        super("InvalidVoterException");
    }
}

class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidVoterException();
            } else {
                System.out.println("Thankyou for Voting");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("At The End");
    }
}
