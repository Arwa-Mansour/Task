/*
Let A be an array of size n> 2 containing integers from I ton-1 inclusive, one of which is repeated.
Describe an algorithm for finding the integer in A that is repeated.
 */
public class ThirdProgram {
        static int findRepeating(int[] arr, int n)
        {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += arr[i];
            return sum - (((n - 1) * n) / 2);
        }

        public static void main(String args[])
        {
            int[] arr = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
            int n = arr.length;
            System.out.println( "Number repeated is : " + findRepeating(arr, n));
        }



}
