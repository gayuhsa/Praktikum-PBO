public class Main {
    public static void main(String[] args) {
        MathOperator addition = new Addition();
        System.out.println("Addition: " + addition.calculate(10, 5));
        
        MathOperator subtraction = new Subtraction();
        System.out.println("Subtraction: " + subtraction.calculate(10, 5));
    }
}
