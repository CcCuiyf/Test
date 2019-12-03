package test;

import java.util.Scanner;

public class Exam implements ExamInterface{
    public String Targeting(){
        int n,tar;
        int[] nums=new int[100];
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input the length of array:");
        n=scan.nextInt();
        System.out.println("Please input the target number:");
        tar=scan.nextInt();
        System.out.println("Please input the element of the array");
        for(int i=0;i<n;++i) nums[i]=scan.nextInt();
        loop:for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(nums[i]+nums[j]==tar && j!=i && nums[i]<=tar && nums[j]<=tar) {
                    System.out.println("["+i+','+j+']');
                    break loop;
                }
            }
        }
        return "0";
    }
}
