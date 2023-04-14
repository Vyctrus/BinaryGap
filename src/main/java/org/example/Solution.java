package org.example;

import java.util.ArrayList;

public class Solution {


    public static String toBinary(int num){
        String binary="";
        while(num>0){
            binary= (num%2)+binary;
            num /=2;
        }
        return binary;
    }

    public int solution(int N){
        int maxSpace=0;
        int currentSpace=0;
        boolean readyToCount=false;
        char[] number=toBinary(N).toCharArray();
        for(int i=0;i< number.length;i++){
            if(number[i]=='1'){
                readyToCount=true;
                maxSpace= (currentSpace>maxSpace)? currentSpace : maxSpace;
            }else{
                if(readyToCount){
                    //we have 0 here
                    currentSpace++;
                }
            }
        }
        return maxSpace;
    }
}
