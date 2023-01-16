import java.util.Scanner;
class Input{
    public static void main(String[] args) {
        int i;
        float f;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        s = in.nextLine();
        System.out.println("You entered sting " + s);

        System.out.println("Enter an integer: ");
        i = in.nextInt();
        System.out.println("You entered integer " + i);

        System.out.println("Enter an float: ");
        f = in.nextFloat();
        System.out.println("You entered float " + f);
    }
}