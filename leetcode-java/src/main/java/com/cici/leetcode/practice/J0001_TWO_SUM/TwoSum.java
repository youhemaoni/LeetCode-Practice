package com.cici.leetcode.practice.J0001_TWO_SUM;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname TwoSum
 * @Description TODO
 * @Date 2022/9/2 11:10
 * @Created by wjf
 */
public class TwoSum {

  //哈希表
  public int[] solution1(int[] nums,int target)
  {
    Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    for(int i=0;i<nums.length;i++)
    {
      if(map.containsKey(target-nums[i]))
      {
        return new int[]{map.get(target-nums[i]),i};
      }
      map.put(nums[i],i);
    }

    return new int[0];
  }





}
