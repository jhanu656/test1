import java.util.*;
public class cals{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        System.out.println("Enter an operand:+ - *  / ");
        char s=sc.next().charAt(0);
        double total;
        switch(s)
        {
            case '+':
            total=a+b;
            break;
            case '-':
            total=a-b;
            break;
            case '*':
            total=a*b;
            break;
            case '/':
            total=a/b;
            break;
        default:
        System.out.println("Invalid:");
        return;
        }
        System.out.printf("%.1f%c%.1f=%.1f",total);

    }
}
