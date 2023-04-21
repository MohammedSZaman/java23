//When an attempt is made to retrieve an element at an index that falls outside the range of the array
public class ArrayOutOfBoundsException {
    public static void main(String[] args) {
        String[] arr = new String[10];
        System.out.println(arr[10]);

    }

}

/*a String array of length 10 is created. An attempt is then made to access an element at index 10,
which falls outside the range of the array, throwing an ArrayOutOfBounds*/
