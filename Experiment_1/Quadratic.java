package Experiment_1;

import java.util.Scanner;
import java.lang.Math;
class Quadratic {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sx = new Scanner(System.in);
        System.out.println("Enter value of a");
        a = sx.nextFloat();
        System.out.println("Enter value of b");
        b = sx.nextFloat();
        System.out.println("Enter value of c");
        c = sx.nextFloat();
        float D = (b*b)-(4*a*c);
        if (D==0) {
            float X1 = Math.abs(((-b)/(2*a)));
            System.out.println("Roots are real and equal : " + X1);
        }
        else if(D>0){
            float X1 = (float) (((-b+Math.sqrt(D))/(2*a)));
            float X2 = (float) (((-b-Math.sqrt(D))/(2*a)));
            System.out.println("Roots are real and Distinct : ");
            System.out.println("X1 : " + X1+"X2 : "+X2);
        }
        else if(D<0){
            float X1 = (float) (((-b)/(2*a)));
            System.err.println("There are no real solutions");
            //System.out.println("Roots are Imaginary and Distinct : ");
            //System.out.println("X1 : " + X1+"i"+Math.sqrt(Math.abs(D))+"X2 : "+X1+"-i"+Math.sqrt(Math.abs(D)));
        }

    }
}
