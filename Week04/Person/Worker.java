public class Worker extends Person {
    private int salary;
    
    public Worker(String name, int age, String occupation, int salary) {
        super(name, age, occupation);
        this.salary = salary;
    }
    
    // Getter and setter for salary
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        // This will throw an error because name has private access in Person class
        return "Name: " + name + ", age: " + age + ", occupation: " + occupation + ", salary: " + salary;
    }
}