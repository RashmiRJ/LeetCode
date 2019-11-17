package rashmirj;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashmirj
 */
public class LCP136_SingleNumberInArray {
     public int singleNumber(int[] nums) {
        int r = 0;
        Map<Integer, Integer> oc = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(oc.containsKey(nums[i]))
                oc.put(nums[i],oc.get(nums[i])+1);
            else
                oc.put(nums[i],1);
        }
        
        Iterator it = oc.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
            if((int)pair.getValue()==1){
               r = (int)pair.getKey();
            }
        it.remove(); 
        }
        
        return r;
    }
     
      public static void main(String args[]){
        int[] nums = new int[]{4,1,2,1,2};
        LCP136_SingleNumberInArray single = new LCP136_SingleNumberInArray();
        single.singleNumber(nums);
        
        System.out.println(single.singleNumber(nums));
        
    }
}
