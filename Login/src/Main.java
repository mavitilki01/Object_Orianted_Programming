import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;

        System.out.println("Enter your username:");
        userName= input.nextLine();
        System.out.println("Enter your password:");
        password= input.nextLine();


        if(userName.equals("sovyetRusya") && password.equals("mavitilki9")){
            System.out.println("You Login.");
        }
        else if(password.equals("mavitilki9"))
            System.out.println("Username is wrong.");
        else if(userName.equals("sovyetRusya")){
            System.out.println("Something went wrong.");
            System.out.println("Do you want to reset your password?\n1-yes\n2-no");
            int i = input.nextInt();


            switch(i) {
                case 1:
                    while (i<2) {

                        System.out.println("Enter new password:");
                        password = input.next();
                        if (password.equals("mavitilki9")) {
                            System.out.println("The password could not be created, please enter another password.");
                        } else{
                            System.out.println("Password created.");
                            System.out.println("New pasword is "+ password);
                            break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Log out."); break;
                default:
                    System.out.println("Wrong valid.");
            }
        }
        else
            System.out.println("Everything is wrong");

    }
}