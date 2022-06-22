import java.util.Scanner;

public class POWeek2CodingChallenge
{
    public static int squares(int a, int b)
    {
        int count = 0;

        for(int i = a; i <= b; i++)
        {
            for(int j = 1; j < 100000; j++)
            {
                if(j*j <= b)
                {
                    if(j*j == i)
                    {
                        count+=1;
                        i++;
                    }
                    else if(j*j != i)
                    {
                        count+=0;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);

        //INPUT [uncomment & modify if required]
//        System.out.println("input an integer a");
//        int a = sc.nextInt ();
//
//        System.out.println("input an integer for b");
//        int b = sc.nextInt ();


        sc.close ();

        //OUTPUT [uncomment & modify if required]
        System.out.println(squares(3,9)); //ans: 2
        System.out.println(squares(17,24)); //ans: 0
        System.out.println(squares(1,100)); //ans: 10
        squares(1, 1000000000); //ans: 31622


    }

}
