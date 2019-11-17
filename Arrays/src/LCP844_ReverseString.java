/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashmirj
 */
public class LCP844_ReverseString {
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++) {
            char t = s[i];
            s[i] = s[s.length-1-i];
            s[s.length -1-i] = t;            
        }        
        System.out.println("Reversed String:");
        System.out.println(s);
    }
    
    public static void main(String args[]){
        char[]s ={'h','e','l','l','o'};
        LCP844_ReverseString reverse = new LCP844_ReverseString();
        reverse.reverseString(s);
    }
}
