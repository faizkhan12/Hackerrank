import java.util.Scanner;

 class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter interger: \n");
        int i = scan.nextInt();
        // Write your code here.
	System.out.println("Enter double: \n");
        double d = scan.nextDouble();
        scan.nextLine();
	System.out.println("Enter string: \n");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}