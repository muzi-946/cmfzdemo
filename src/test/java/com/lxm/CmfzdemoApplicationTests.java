package com.lxm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmfzdemoApplicationTests {

    @Test
    public boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> integerIntegerHashMap = new HashMap<>();
        for (int num:nums
             ) {
            integerIntegerHashMap.put(num,num);
            if(integerIntegerHashMap.containsKey(num)){
                System.out.println(integerIntegerHashMap.get(num));
                return true;
            }
        }
        return  false;
    }

    @Test
    public  void  containsD(){
        int[] nums =new  int[]{1,2,3,4};
        CmfzdemoApplicationTests cmfzdemoApplicationTests = new CmfzdemoApplicationTests();
        boolean b = cmfzdemoApplicationTests.containsDuplicate(nums);
        System.out.println(b);
    }



}
