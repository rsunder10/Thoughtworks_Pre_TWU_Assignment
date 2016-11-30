import java.util.Scanner;

/**
 * Created by sunder on 30/11/16.
 */
public class DrawAVerticalLine {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }
}
