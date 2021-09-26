/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Seydel
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(reverseString("is it working?"));
        System.out.println(isPalindrome("is it working?"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(randBetween(5,10));
        
    }
    
    public static String reverseString(String input)
    {
        String output = "";
        for(int i=1; i<=input.length(); i++)
        {
            output += input.charAt(input.length()-i);
        }
        return output;
    }
    public static boolean isPalindrome(String input)
    {
        return input.equals(reverseString(input));
    }
    public static double randBetween(int min, int max)
    {
        return Math.random()*(max-min)+min;
    }
    
}
