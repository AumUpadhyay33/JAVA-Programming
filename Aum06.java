//CONVERSION OF A NUMBER INTO WORD
import java.util.Scanner;

class Aum06
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upto 999): ");
        int num = input.nextInt();

        int t = num / 10; //Ten's place
        int u = num % 10; //Unit's place

        int tensdigit;
        String result;
        String unit[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sisteen", "Seventeen", "Eighteen", "Nineteen"};
        String tens[] = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};

        if(num >= 0 && num <= 19) {
            System.out.println(unit[num]);
        } else if(num >= 20 && num <= 99) {
            System.out.println(tens[t] +" "+ unit[u]);
        } else if(num >= 100 && num <= 999) {
            tensdigit = num / 100; //Hundred's place
            result = unit[tensdigit] +" Hundred ";
            tensdigit = num / 10;
            tensdigit = tensdigit % 10;
            result = result + tens[tensdigit];
            tensdigit = num % 100;
            tensdigit = num % 10;
            result = result +" "+ unit[tensdigit];
            System.out.println(result);
        } else {
            System.out.println("Your Input is out of range!");
        }
    }
}