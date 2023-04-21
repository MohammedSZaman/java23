//thrown when the length() method of a null String object is called
public class NullPointerException {
    private static void printLength(String str){
        System.out.println(str.length());

    }
public static void main(String args[]) {
        String myString = null;
        printLength(myString);
}

}
/*The printLength() method calls the length() method of a String without performing a null check prior to
calling the method. Since the value from String is passed from the main() method is null, running the above code gives
you NullPointerException*/
