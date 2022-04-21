package com.JumpSearch;

//WE CAN DO IT WITHOUT USE OF variable start ALSO;

public class JumpSearch {
    public int JumpSearch(int[] array,int number){
        int blocksize = (int)Math.sqrt(array.length);
        int start = 0;
        int next = blocksize;

        while(start < array.length && array[next-1] < number){
               start = next;
               next += blocksize;
               if(next > array.length)
                   next = array.length;
        }
        for(var i = start;i < next;i++){
            if(array[i] == number)
                return i;
        }
        return -1;
    }
}
