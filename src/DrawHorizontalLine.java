import java.util.Scanner;

/**
 * Created by sunder on 30/11/16.
 */
public class DrawHorizontalLine {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
}
