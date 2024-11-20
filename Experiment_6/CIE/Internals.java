package Experiment_6.CIE;

public class Internals extends Student{
    public int internal[];
    public Internals(String USN,String Sname,int Sem,int[] mark){
        super(USN,Sname,Sem);
        internal=mark;
    }
}