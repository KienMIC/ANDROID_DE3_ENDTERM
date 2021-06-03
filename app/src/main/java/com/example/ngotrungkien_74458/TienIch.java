package com.example.ngotrungkien_74458;

import java.util.ArrayList;
import java.util.Random;

public class TienIch {
    public static ArrayList<Integer>K = new ArrayList<>();
    public static int sum = 0;
    public static int Random(){
        Random r = new Random();
        return r.nextInt(255);
    }
    public static void Push(int N){
        if(N>Integer.MAX_VALUE/2)
            K.add(0,N);
        else
            K.add(N);
    }
    public static boolean KTChanLe(int N){
        if(N%2 == 0)
            return true;
        else
            return false;
    }
    public static int Tong_GT_Chan(){
        for(int number : K){
            if(KTChanLe(number))
                sum += number;
        }
        return sum;
    }
}
