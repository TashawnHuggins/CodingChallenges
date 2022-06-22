import java.util.Arrays;
import java.util.Scanner;

public class POWeek1CodingChallenge
{
    public static int[] median(int m,int n,int[] nums1, int[] nums2)
    {
        int o = m+n;
        int[] mergedArray = new int[o];


        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m + n; k++)
                {
                    if(nums1.length == 1 || nums2.length == 1)
                    {

                    }
                    else
                    {
                        if (nums1[i] < nums2[j])
                        {
                            mergedArray[k] = nums1[i];
                            System.out.print(mergedArray[k]);
                            k++;
                            System.out.print(" ");
                            i++;
                        }
                        else if (nums1[i] > nums2[j])
                        {
                            mergedArray[k] = nums2[j];
                            System.out.print(mergedArray[k]);
                            k++;
                            System.out.print(" ");
                            j++;
                        }
                    }

                }
            }
        }
        return mergedArray;

    }
//    public static int[] merge()
//    {
//        return null;
//    }





    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);

        //INPUT [uncomment & modify if required]
        System.out.println("input an integer for amount of m");
        int m = sc.nextInt ();
        int[] nums1 = new int[m];
        System.out.println("Please input value(s) for m");
        for (int i = 0; i < m; i++)
        {
            nums1[i] = sc.nextInt ();
        }


        System.out.println("input an integer for amount of n");
        int n = sc.nextInt ();
        int[] nums2 = new int[n];
        System.out.println("Please input value(s) for n");
        for (int i = 0; i < n; i++)
        {
            nums2[i] = sc.nextInt ();
        }


        sc.close ();

        //OUTPUT [uncomment & modify if required]
        //int[] storage = median(m,n,nums1,nums2);
        System.out.print(median(m,n,nums1,nums2));
        //System.out.print(merge(N,A));


    }
}
