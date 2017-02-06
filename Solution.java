import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    //written by Suraj Kamdi
        Scanner suraj =new Scanner(System.in);
        int num= suraj.nextInt();
        long sum=0;
        for(int i=0;i<num;i++){
            long a=suraj.nextLong();
            sum=sum+a;
        }
        System.out.print(sum);
    }
}
