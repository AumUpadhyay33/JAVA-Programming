import java.util.Scanner;

class Aum03
{
    public static void main(String args[]) 
    {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = myobj.nextInt();
        System.out.println("Enter the value of b: ");
        int b = myobj.nextInt();
        System.out.println("Enter the value of c: ");
        int c = myobj.nextInt();

        {
            if(a>b && a>c) {
                System.out.println("A is the greatest number.");
            }
            else if(b>c) {
                System.out.println("B is the greatest number.");
            }
            else {
                System.out.println("C is the greatest number.");
            }
        }
    }
}