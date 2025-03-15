public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // Getter and Setter Methods
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        this.myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}
