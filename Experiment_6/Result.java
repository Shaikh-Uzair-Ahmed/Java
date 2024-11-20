package Experiment_6;

import Experiment_6.CIE.Internals;
import Experiment_6.SEE.External;
import java.util.Scanner;

class Result {
    public static void main(String args[]) {
        String Usn, name;
        int i, j, n, Sem;
        
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter No of Students");
        n = s.nextInt();
       
        Internals[] I = new Internals[n];
        External[] E = new External[n];
       
         
        for(i = 0; i < n; i++) {
            int[] marki = new int[5];
            int[] marke = new int[5];
            s.nextLine();  // To consume the leftover newline character from previous input
            System.out.println("Enter The Usn, Name and Sem of student For Internals");
            Usn = s.nextLine();
            name = s.nextLine();
            Sem = s.nextInt();
           
            System.out.println("Enter The 5 internal marks each out of 50 in proper order");
            for (j = 0; j < 5; j++) {
                marki[j] = s.nextInt();
            }
            I[i] = new Internals(Usn, name, Sem, marki);

            System.out.println("Enter The 5 external marks each out of 100 in proper order");
            for (j = 0; j < 5; j++) {
                marke[j] = s.nextInt();
            }
            E[i] = new External(Usn, name, Sem, marke);
        }    
        // Print results
        for(i = 0; i < n; i++) {
            
                System.out.println("Result of Courses for USN " + I[i].USN + " Name: " + I[i].Sname + " Sem: " + I[i].Sem);
                for (j = 0; j < 5; j++) {
                    double courseResult = ((I[i].internal[j] + ((E[i].external[j])/2)));
                    System.out.println("Course " + (j + 1) + " Result: " + courseResult);
                }
            
        }
       
        s.close(); // Close the scanner
    }
}