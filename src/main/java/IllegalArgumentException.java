//thrown When the argument passed to a method is out of range
public class IllegalArgumentException {
    int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new java.lang.IllegalArgumentException("Age must be greater than zero");
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        IllegalArgumentException person = new IllegalArgumentException();
        person.setAge(-1);
    }
}
    /*The main() method  calls the setAge() method with the age code> argument set to-1. Since setAge() code>
    expects age to be a positive number, throws an IllegalArgumentException code>*/







