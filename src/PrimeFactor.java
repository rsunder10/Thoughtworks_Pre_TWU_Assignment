import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sunder on 30/11/16.
 */
public class PrimeFactor {

    public ArrayList<Integer> generate(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(n%2==0){
            list.add(2);
            n/=2;
        }
        for(int i=3;i<Math.sqrt(n);i+=2){
            while(n%i==0){
                list.add(i);
                n/=i;
            }
        }
        if(n>2){
            list.add(n);
        }


        return list;
    }

    public static void main(String [] args){
        PrimeFactor cls = new PrimeFactor();
        ArrayList<Integer> local_list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        local_list = cls.generate(in.nextInt());

        for(int x:local_list){
            System.out.println(x);
        }
    }

}
