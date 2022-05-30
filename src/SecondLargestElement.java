public class SecondLargestElement {

        public static void main(String[] args) {

            int [] array = new int [] {7, 2, 3, 5, 8, 9 };
            int SecondLarge=array[0];
            int large =0;
            for(int i = 0; i<array.length; i++)
            {
                for(int j = i+1; j<array.length; j++)
                    if(array[i]>SecondLarge)
                    {
                        large = SecondLarge;
                        SecondLarge = array[i];
                    }
            }
            System.out.println("Largest element of Array  :"+SecondLarge);
        }
    }

