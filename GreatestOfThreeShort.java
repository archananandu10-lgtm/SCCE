public class GreatestOfThreeShort {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }

        System.out.println("Greatest number is: " + greatest);
    }
}