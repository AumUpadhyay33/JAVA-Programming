//FIRST N PRIME NUMBERS
import java.util.Scanner;
class Aum02
{
    public static void main(String[] args) 
    {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter any number: ");
		int n = myobj.nextInt();
        System.out.print("The prime numbers between 1 and "+n+" are: ");
		
		for(int i=2; i<=n; i++) {
			int count = 0;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i+" ");
			}
		}
	}
}
