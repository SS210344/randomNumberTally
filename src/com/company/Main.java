package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int[] rolledNum;
        System.out.println("number of side on dice: ");
        int sides = input.nextInt();
        rolledNum = new int[sides];
        for(int i = 0;i < sides; i++){
            rolledNum[i] =0;
        }


        System.out.println("number of times to roll dice: ");
        int rollswanter = input.nextInt();
        for(int i=0;i < rollswanter; i++) {
            int rolled = random.nextInt(sides) + 1;
            rolledNum[rolled-1] = rolledNum[rolled-1]+1;

        }
        for (int i = 0; i < rolledNum.length; i++) {
            System.out.println("rolled "+ (i+1) +":"+ rolledNum[i]+" times" );
            System.out.println("rolled "+ (i+1) +":"+((double)rolledNum[i]/rollswanter*100)+" % of the time");
        }
    }
}
