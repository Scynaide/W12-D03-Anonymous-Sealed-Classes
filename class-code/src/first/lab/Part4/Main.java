package first.lab.Part4;

import java.util.Scanner;
public interface UserValidation {

    static void main(String[] args) {
        // Scanner
        Scanner input=new Scanner(System.in);

        int row=0;
        int col=0;
        String cont="";

        // ask user to choose between admin or student
        System.out.print("Enter a for admin and q for guest: ");
        String user=input.next();

        System.out.println("ADMIN");
        // ask them to enter the password for admin
        System.out.println("Enter the password: ");
        String pass=input.next();
        // if they enter the password 'admin'
        if (pass.equals("admin123")) {
            System.out.print("Login success full! Welcome Admin!\n\n");
        }
        // else password is incorrect
        else {
            System.out.println("Incorrect password");
        }
        System.out.println("GUEST");
        // ask them to enter the password for guest
        System.out.println("Enter the password: ");

        String pass=input.next();
        // if they enter the password 'guest'
        if (pass.equals("guest123")) {
            System.out.print("Login success full! Welcome Guest!\n\n");
        }
        // else password is incorrect
        else {
            System.out.println("Incorrect password");
        }


    }

}