package sort;

import org.junit.Test;

import java.util.Random;

public class mergeSort {
    public void sort(int [] nums,int begin,int mid,int end){
        if(begin==end)return;
        sort(nums,begin,(begin+mid)/2,mid);
        sort(nums,mid+1,(mid+end+1)/2,end);
        //System.out.println("begin:"+begin+"  mid:"+mid+"  end:"+end);
        int index1=begin;
        int index2=mid+1;
        int [] copy=new int[end-begin+1];
        int index=0;
        while (index<copy.length){
            if(index2==end+1||(index1<mid+1&&nums[index1]<=nums[index2])){
                copy[index++]=nums[index1++];
            }else{
                copy[index++]=nums[index2++];
            }
        }
        for(int i=0;i<copy.length;i++){
            nums[begin++]=copy[i];
        }
    }

    @Test
    public void tees(){
        int [] num=new int[100];
        Random r=new Random();
        for(int i=0;i<num.length;i++){
            num[i]= r.nextInt(100);
        }
        sort(num,0,(num.length-1)/2,num.length-1);
        for (int i : num) {
            System.out.print(i+"\t");
        }
    }
}
