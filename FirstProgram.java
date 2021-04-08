/*
Let B be an array of size n 26 containing integers from 1 to n-5 inclusive, five of which are repeated.
 Describe an algorithm for finding the five integers in B that are repeated
 */
public class FirstProgram {

        static class eleCount {
            int e;
            int c;
        };

        static void moreThanNdK(int arr[], int n, int k)
        {
            if (k < 2)
                return;

            eleCount []temp = new eleCount[k - 1];
            for (int i = 0; i < k - 1; i++)
                temp[i] = new eleCount();
            for (int i = 0; i < k - 1; i++) {
                temp[i].c = 0;
            }


            for (int i = 0; i < n; i++)
            {
                int j;

                for (j = 0; j < k - 1; j++)
                {
                    if (temp[j].e == arr[i])
                    {
                        temp[j].c += 1;
                        break;
                    }
                }


                if (j == k - 1) {
                    int l;

                    for (l = 0; l < k - 1; l++)
                    {
                        if (temp[l].c == 0)
                        {
                            temp[l].e = arr[i];
                            temp[l].c = 1;
                            break;
                        }
                    }
                    if (l == k - 1)
                        for (l = 0; l < k-1; l++)
                            temp[l].c -= 1;
                }
            }

            for (int i = 0; i < k - 1; i++)
            {
                int ac = 0; // actual count
                for (int j = 0; j < n; j++)
                    if (arr[j] == temp[i].e)
                        ac++;
                if (ac > n / k)
                    System.out.print("Number:" +  temp[i].e
                            + " Count:" +  ac +"\n");
            }
        }


        public static void main(String[] args)
        {
            System.out.print("First Test\n");
            int arr1[] = { 4, 5, 6, 7, 8, 4, 4 };
            int size = arr1.length;
            int k = 3;
            moreThanNdK(arr1, size, k);

            System.out.print("\nSecond Test\n");
            int arr2[] = { 4, 2, 2, 7 };
            size = arr2.length;
            k = 3;
            moreThanNdK(arr2, size, k);

            System.out.print("\nThird Test\n");
            int arr3[] = { 2, 7, 2 };
            size = arr3.length;
            k = 2;
            moreThanNdK(arr3, size, k);

            System.out.print("\nFourth Test\n");
            int arr4[] = { 2, 3, 3, 2 ,3,4,4,4,5,5,6,6,6,6,6};
            size = arr4.length;
            k = 7;
            moreThanNdK(arr4, size, k);

        }
    }

