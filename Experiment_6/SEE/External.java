package Experiment_6.SEE;

import Experiment_6.CIE.Student;

public class External extends Student{
    public int external[];
    public External(String USN,String Sname,int Sem,int [] mark){
    super(USN,Sname,Sem);
    external=mark;
    }
}
