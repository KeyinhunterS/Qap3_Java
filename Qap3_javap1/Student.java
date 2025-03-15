public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Call superclass constructor
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Getter and Setter Methods
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
