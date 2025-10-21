package Patterns;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;

public class Patterns {
//            1.
//            *****
//            *****
//            *****
//            *****
//            *****
    public static void pattern1(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//  2. *
//     **
//     ***
//     ****
//     ******

    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


//    3.      1
//            12
//            123
//            1234
//            12345


    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    4.
//            1
//            22
//            333
//            4444
//            55555


    public static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

//    6.
//            *****
//            ****
//            ***
//            **
//            *

    public static void pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    6.
//            12345
//            1234
//            123
//            12
//            1

    public static void pattern6(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    7.
//                *
//               ***
//              *****
//             *******
//            *********
    public static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


//    8.
//            *********
//             *******
//              *****
//               ***
//                *

    public static void pattern8(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

//    9.
//                *
//               ***
//              *****
//             *******
//            *********
//            *********
//             *******
//              *****
//               ***
//                *


public static void pattern9(int n){
        pattern7(n);
        pattern8(n);
}

//    10.
//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *

    public static void pattern10(int n){
        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars = i <= n ? i : 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//    11.
//            1
//            0 1
//            1 0 1
//            0 1 0 1
//            1 0 1 0 1

    public static void pattern11(int n){
        int start=1;
        for (int i = 0; i < n; i++) {

            if(i%2==0) start=1;
            else start=0;

            for(int j=0;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    // 12.
//            1        1
//            12      21
//            123    321
//            1234  4321
//            1234554321

    public static void pattern12(int n)
    {
        int spaces=2*(n-1);
        for(int i = 1; i <= n; i++){


            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            spaces-=2;
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //13.
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15

    public static void pattern13(int n){
        int count=1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

//    14.
//    A
//    AB
//    ABC
//    ABCD
//    ABCDE


    public static void pattern14(int n)
    {
        for(char i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }


//    15.
//    ABCDE
//    ABCD
//    ABC
//    AB
//    A

public static void pattern15(int n){

        for(int i = 0; i < n; i++){

            for(char j='A';j<'A'+n-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

}
    public static void main(String[] args) {

        pattern15(5);
    }

}
