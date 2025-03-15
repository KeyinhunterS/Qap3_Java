public class Teacher extends Person {
    private String subject;
    private double salary;

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call superclass constructor
        this.subject = subject;
        this.salary = salary;
    }

    // Getter and Setter Methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
    }
}
