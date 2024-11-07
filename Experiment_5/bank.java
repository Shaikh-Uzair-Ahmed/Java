import java.util.Scanner;

class Account {
    String cname, acctype;
    long accno;

   
    Account(String name, String atype, long N) {
        cname = name;
        acctype = atype;
        accno = N;
    }
}

class Sav_accnt extends Account {
    double bal;

    Sav_accnt(String name, String atype, long N, double B) {
        super(name, atype, N);
        bal = B;
    }

    void serv_charge() {
        System.out.println("Minimum Balance < 10000");
        bal = bal - 250;
        System.out.println("Funds withdrawn 250 from Acc " + accno + " of Type " + acctype + " for Service Charge");
    }

    double get_compound_interest() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter in the order: Principal, rate of annual interest, number of times interest is compounded in a year, number of years borrowed:");
       
        long p = s.nextLong();
        double r = s.nextDouble();
        int n = s.nextInt();
        int t = s.nextInt();
       
        System.out.println("Deposited " + p + " into Acc " + accno + " of Type " + acctype);
        bal = bal + p;

        double Tamt = p * Math.pow((1 + r / n), (n * t)); // Compound interest formula
        s.close();
       
        return Tamt;
    }

    void check_cheque() {
        System.out.println("Cheque facilities not available");
    }


    void withdraw(double B) {
        if (B > bal || B < 0) {
            System.out.println("Insufficient Funds");
            return;
        } else {
            bal = bal - B;
            System.out.println("Funds withdrawn " + B + " from Acc " + accno + " of Type " + acctype);
            System.out.println("Funds Left: " + bal);
        }
        if (bal < 10000) {
            serv_charge(); // Apply service charge if balance is less than 10,000
        }
    }

    void Deposit(double B) {
        if (B < 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        } else {
            bal = bal + B;
            System.out.println("Deposited " + B + " into Acc " + accno + " of Type " + acctype);
        }
        if (bal < 10000) {
            serv_charge(); // Apply service charge if balance is less than 10,000
        }
    }
    void balance() {
        System.out.println("Funds Left: " + bal + " in Acc " + accno + " of Type " + acctype);
    }
}

class Cur_accnt extends Account {
    double bal;


    Cur_accnt(String name, String atype, long N, double B) {
        super(name, atype, N);
        bal = B;
    }


    void Deposit(double B) {
        if (B < 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        } else {
            bal = bal + B;
            System.out.println("Deposited " + B + " into Acc " + accno + " of Type " + acctype);
        }
        if (bal < 10000) {
            serv_charge();
        }
    }

    void withdraw(double B) {
        if (B > bal || B < 0) {
            System.out.println("Insufficient Funds");
            return;
        } else {
            bal = bal - B;
            System.out.println("Funds withdrawn " + B + " from Acc " + accno + " of Type " + acctype);
            System.out.println("Funds Left: " + bal);
        }
        if (bal < 10000) {
            serv_charge();
        }
    }


    void balance() {
        System.out.println("Funds Left: " + bal + " in Acc " + accno + " of Type " + acctype);
    }

    void check_cheque() {
        System.out.println("Cheque facilities available");
    }


    void get_compound_interest() {
        System.out.println("Interest facilities not available for Current Account");
    }


    void serv_charge() {
        System.out.println("Minimum Balance < 10000");
        bal = bal - 250;
        System.out.println("Funds withdrawn 250 from Acc " + accno + " of Type " + acctype + " for Service Charge");
    }
}

public class bank {
    public static void main(String[] args) {
        // Create a Savings Account and perform operations
        Sav_accnt savAcc = new Sav_accnt("John Doe", "Savings", 123456789, 15000);
        savAcc.Deposit(5000);
        savAcc.withdraw(4000);
        savAcc.get_compound_interest();
        savAcc.balance();

        System.out.println("\n BELOW STARTS CURRENT ACCOUNT TRANSACTIONS ");

        // Create a Current Account and perform operations
        Cur_accnt curAcc = new Cur_accnt("Jane Smith", "Current", 987654321, 8000);
        curAcc.Deposit(2000);
        curAcc.withdraw(1000);
        curAcc.check_cheque();
        curAcc.balance();
    }
}
