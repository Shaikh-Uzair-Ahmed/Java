package Experiment_7;
import java.lang.Exception;

class WrongAge extends Exception{
    public String toString(){
        return "There is an invalid Age";
    }
}


class Father {
    int age;

    Father(int age) throws WrongAge {
        if (age < 0) {
            System.out.println("Inside Father Class");
            throw new WrongAge();
        }
        this.age = age;
    }
}


class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); 
        if (sonAge >= fatherAge) {
            System.out.println("Inside Sons Class");
            throw new WrongAge();
        }
        this.sonAge = sonAge;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            
            //Father father = new Father(40);

           
            //Son son = new Son(40, 20);
            //System.out.println("Father's age: " + father.age);
            //System.out.println("Son's age: " + son.sonAge);

            
            //Father invalidFather = new Father(-10);

            
            Son invalidSon = new Son(40, 45);

        } catch (WrongAge e) {
            System.out.println(e);
        }
    }
}