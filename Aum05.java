import java.util.Scanner;
class Aum05
{
    public static void main(String args[]) 
    {
        int n, reverse = 0;
        System.out.println("Enter the numbers you want to reverse: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        while(n!=0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        System.out.println("Reversal of numbers you entered is: "+reverse);
    }
}