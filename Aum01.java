//BIO-DATA
import java.util.Scanner;

class Aum01 {
    public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = obj.nextLine();
    System.out.println("Enter your age: ");
    int age = obj.nextInt();
    obj.nextLine();
    System.out.println("Enter your city: ");
    String city = obj.nextLine();
    System.out.println("Enter your college: ");
    String college = obj.nextLine();
    System.out.println("Enter your department: ");
    String dept = obj.nextLine();
    System.out.println("Enter your semester: ");
    String sem = obj.nextLine();

    System.out.println("-------------------------------------");

    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("City: "+city);
    System.out.println("College: "+college);
    System.out.println("Department: "+dept);
    System.out.println("Semester: "+sem);
    }
}
