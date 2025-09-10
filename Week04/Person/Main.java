public class Main {
    public static void main(String[] args) {
        Worker test = new Worker("Andy", 35, "Librarian", 1000);
        
        System.out.println(test);
        
        test.setName("John");
        
        System.out.println(test);
    }

}
