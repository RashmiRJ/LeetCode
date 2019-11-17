/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rashmirj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rashmirj
 */
public class LCP412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<String>();
        for(int i = 1; i<=n;i++) {
            if((i%3==0) && (i%5 ==0))
                r.add("FizzBuzz");
            else if(i%3==0)
                r.add("Fizz");
            else if(i%5==0)
                r.add("Buzz");
            else
                r.add(String.valueOf(i));
        }
        
        return r;
    }
    
    public static void main(String args[]){         
        LCP412_FizzBuzz list = new LCP412_FizzBuzz();
        System.out.println("412 -> Fizz Buzz:");
        System.out.println(list.fizzBuzz(15));
     }
    
}
