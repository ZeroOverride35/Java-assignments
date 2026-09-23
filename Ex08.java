public class Ex08 {
    public static void main(String[] args) {
        int points = 100;
        System.out.println("Starting points = " + points);
        System.out.println("After += 50: " + (points += 50));
        System.out.println("After -= 20: " + (points -= 20));
        System.out.println("After *= 2: " + (points *= 2));
        System.out.println("After ++: " + (points ++));
    }
    
}
