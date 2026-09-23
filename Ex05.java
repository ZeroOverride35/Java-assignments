public class Ex05 {
    public static void main(String[] args) {
        int totalSlices = 7;
        int people = 2;
        System.out.println("Integer division: " + (totalSlices / people));
        System.out.println("Remainder: " + (totalSlices % people));
        System.out.println("Decimal division: " + (totalSlices / 2.0));
        System.out.println("Decimal division with a cast: " + ((double) totalSlices / people));

// first and third line give different results because I divided total slices by 2 instead of number of people
    }
    
}
