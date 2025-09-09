public class Person {
    private String name;
    protected int age;
    public String occupation;
    
    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    
    // Getter and setter for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}