public class EvenPosition {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7,8};

        System.out.println("Elements of given array present on even position: ");
        //Here, i will start from 1 as first even positioned element is present at position 1.
        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
