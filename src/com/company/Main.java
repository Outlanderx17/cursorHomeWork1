package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //x+y-a/2*(x+w)
        //a*(x+x)/y-a*3
        //a+b/x-y
        //X-e/2%e+1
        int x = 1,y = 2, a = 3,w = 4,b = 6, X = 4,e = 2;
        int answer1,answer2,answer3,answer4;
        answer1 = x+y-a/2*(x+w);
        answer2 = a*(x+x)/y-a*3;
        answer3 = a+b/x-y;
        answer4 = X-e/2%e+1;
        System.out.println("Results");
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }
}
