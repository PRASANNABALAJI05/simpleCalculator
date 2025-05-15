import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        double result;
        System.out.print("Enter First value: ");
        double input = sc.nextDouble();
        System.out.println("Enter Second Value");
        double input2 = sc.nextDouble();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
do{
        switch (operator){
        case '+':
        result=input+input2;
        System.out.println(result);
        break;
        case '-':
        result=input-input2;
        break;
        case '*':
        result=input*input2;
        System.out.println(result);
        break;
        case '/':
        result=input/input2;
        System.out.println(result);
        break;
        default:
        System.out.println("Operator not exist");
        break;
       }
       System.out.println("Do you want to use again?(YES=1/NO=2)");
       int reRun = sc.nextInt();
    }while(reRun==1);
    }
}
