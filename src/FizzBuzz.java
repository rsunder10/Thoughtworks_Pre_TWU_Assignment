/**
 * Created by sunder on 30/11/16.
 */
public class FizzBuzz {
    public void fizzbuzz(){
        for(int i=1;i<=100;i++){
            if(i%3==0)
                System.out.print("Fizz");
            if(i%5==0)
                System.out.print("Buzz");

            else if(i%3!=0 && i%5!=0)
                System.out.print(i);

            System.out.print("\n");
        }
    }
    public static void main(String [] args){
        FizzBuzz n = new FizzBuzz();
        n.fizzbuzz();
    }
}
