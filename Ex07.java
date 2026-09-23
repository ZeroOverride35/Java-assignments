public class Ex07 {
    public static void main(String[] args) {
        double exactScore = 87.9;
        int intWholeScore = (int) exactScore;

        int studentCount = 24;
        char grade = 'A';
        int A = 65;


        System.out.println("Exact score: " + exactScore);
        System.out.println("After casting to int: " + intWholeScore);
        System.out.println("Student count as double: " + (double) studentCount);
        System.out.println("The character " + grade + " is number " + A);

        // when 87.9 i cast to an int, the value was cut off instead of rounded. if rounded it would be `88`





    }
}
