//SECOND LARGEST NUMBER WITHOUT USING ARRAY
import java.util.Scanner;

class Aum04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        int length = input.nextInt();
        int temp, max, smax=0;
        temp = input.nextInt();
        max = temp;

        while(length > 1)
        {
            temp = input.nextInt();
            if(temp > max)
            {
                smax = max;
                max = temp;
            } else if(temp > smax)
            {
                smax = temp;
            }
            length--;
        }
        System.out.println("Second largest number is: "+smax);
    }
}