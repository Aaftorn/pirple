package fizzbuzz;
/**
 * @author Seydel
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(1);
        int i = 2;
        boolean prime = true;
        boolean already_printed = false;
        while(i<=100)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0) prime = false;
            }
            
            if(prime) System.out.println("prime");
            else {
                /*switch(i%15)
                {
                    case 3: case 6: case 9: case 12: System.out.println("Fizz"); break;
                    case 5: case 10: System.out.println("Buzz"); break;
                    case 0: System.out.println("FizzBuzz"); break;
                    default: System.out.println(i);
                }*/
                if(i%3 == 0)
                {
                    System.out.print("Fizz");
                    already_printed = true;
                }
                if(i%5 == 0)
                {
                    System.out.print("Buzz");
                    already_printed = true;
                }
                if(!already_printed)
                    System.out.print(i);
                System.out.print("\n");
                already_printed = false;
            }
            i++;
            prime = true;
        }
        
    }
    
}
