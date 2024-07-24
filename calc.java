import java.util.Scanner; //import scanner for inputs
public class calc {
    public static void main(String[] args) {
        //taking inputs
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt(); 
        char opt = sc.next().charAt(0); // char at 0 gives char input at 0 index
        int y = sc.nextInt();
        int ans = 0;  //final ans will be stored in this var
        switch (opt) {
            case '+':
                ans = x+y;
                break;
            case '-':
                ans = x-y;
                break;
            case '*':
                ans = x*y;
                break;
            case '/':
                ans = x/y;
                break;
            case '%':
                ans = x%y;
                break;
            default:
                System.out.println("invalid input"); //error msg for invalid input
        }
        System.out.println("==> "+ans); //displaying final answer
        
        sc.close(); //closing scanner, you should to avoid resource leak
    }
}
