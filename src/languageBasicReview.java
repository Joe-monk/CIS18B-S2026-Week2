import java.util.List;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class languageBasicReview {
    public void sayHello() {
        System.out.println("Hello from instance method!");
    }

    public static void sayStaticHello() {
        System.out.println("Hello from static method!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void chkNum(int num) throws CustomException {
        if (num < 0) {
            throw new CustomException("Number cannot be negative!");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {

        var review = new languageBasicReview();

        review.sayHello();

        languageBasicReview.sayStaticHello();

        System.out.println("Add ints: " + review.add(10, 20));
        System.out.println("Add doubles: " + review.add(5.5, 24.5));

        var fruits = List.of("Apple", "Banana", "Orange");
        System.out.println("Fruits: " + fruits);


        try {
            review.chkNum(25);
            review.chkNum(-10);
        } catch (CustomException e) {
            System.out.println("Caught Exeption: " + e.getMessage());
        }

        var day = 1;

        var dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };

        System.out.println("Day is: " + dayName);
    }
}