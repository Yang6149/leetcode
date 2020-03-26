package like100;

import org.junit.Test;

public class L4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] sum=new int[nums1.length+nums2.length];

        int index1=0;
        int index2=0;
        if(nums1.length<1){
            sum=nums2;
        }
        else if(nums2.length<1){
            sum=nums1;
        }
        else{
            for(int i=0;i<sum.length;i++){
                if(index1==nums1.length){
                    sum[i]=nums2[index2++];
                }else if(index2==nums2.length){
                    sum[i]=nums1[index1++];
                }else if(nums1[index1]>nums2[index2]){
                    sum[i]=nums2[index2++];
                }else{
                    sum[i]=nums1[index1++];
                }
            }
        }
        if(sum.length%2==1){
            return (double)sum[sum.length/2];
        }else{
            return ((double)(sum[sum.length/2-1]+sum[sum.length/2]))/2;
        }


    }
    @Test
    public void test(){
        int [] num1={1,2};
        int [] num2={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
