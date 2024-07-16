import java.util.Scanner;

public class cheeseBurger {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        int t = sc.nextInt(); //number of test cases
        for (int index = 1; index <= t; index++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();
            int totalBun = 2*(s+d);
            int totalPatties = s+(2*d);
            
            if(totalBun >= k+1 && totalPatties >= k ){
                System.out.println("Case #"+index+": YES" );
            }
            else {System.out.println("Case #"+index+": NO" );}
        }
       

       
        
    }
}
