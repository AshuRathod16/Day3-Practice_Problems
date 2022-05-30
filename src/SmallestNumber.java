public class SmallestNumber {
    public static void main(String[] args) {

        int [] array = new int [] {7, 2, 3, 5, 8 };
        int small=array[0];
        for(int i = 0; i<array.length; i++)
        {
            if(array[i]<small)
            {
                small = array[i];
            }
        }
        System.out.println("Smallest element of Array  :"+small);
    }
}
