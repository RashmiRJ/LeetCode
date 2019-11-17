/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rashmirj;

/**
 *
 * @author rashmirj
 */
public class Exec {
     public static void main(String args[]){
         
         //844 reverse a string
        char[]s ={'h','e','l','l','o'};
        LCP844_ReverseString reverse = new LCP844_ReverseString();
        reverse.reverseString(s);
        System.out.println("-------------------------------------------------------------------------------");
        
        //136 all nums are repeated twice except 1, fund that single number
        int[] nums = new int[]{4,1,2,1,2};
        LCP136_SingleNumberInArray single = new LCP136_SingleNumberInArray();
        single.singleNumber(nums);
        System.out.println("136 -> The Single number is:");
        System.out.println(single.singleNumber(nums));
        System.out.println("-------------------------------------------------------------------------------");
        
        //412 if %3 replace by fizz, %5 buzz , both FizzBuzz, none then retain number
        LCP412_FizzBuzz list = new LCP412_FizzBuzz();
        System.out.println("412 -> Fizz Buzz:");
        System.out.println(list.fizzBuzz(15));
        System.out.println("-------------------------------------------------------------------------------");
    }
}
