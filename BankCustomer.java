/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
abstract class Bank{
    String bankName;
    double principal;
    int years;

    //Constructor
    Bank(String bankName, double principal, int years){
        this.bankName = bankName;
        this.principal = principal;
        this.years = years;
    }

    //Abstract method 
    abstract void calculateInterest();
}

//MCB Class
class MCB extends Bank{

    MCB(double principal, int years){
        super("MCB", principal, years);
    }

    //Overriding method
    @Override
    void calculateInterest(){

        double rate = 6.4;

        //Conditional statement
        if (years > 5) {
            rate += 1;
        }

        double interest = (principal * rate * years) / 100;

        System.out.println("Bank: " + bankName);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Calculated Interest: " + interest);
        System.out.println();
    }
}

//HBL Class
class HBL extends Bank{

    HBL(double principal, int years){
        super("HBL", principal, years);
    }

    //Overriding method
    @Override
    void calculateInterest(){

        double rate = 9.3;

        //Conditional statement
        if (principal > 500000){
            rate += 0.5;
        }

        double interest = (principal * rate * years) / 100;

        System.out.println("Bank: " + bankName);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Calculated Interest: " + interest);
        System.out.println();
    }
}

//SCB Class
class SCB extends Bank{

    SCB(double principal, int years){
        super("SCB", principal, years);
    }

    //Overriding method
    @Override
    void calculateInterest(){

        double rate = 9.7;

        //Conditional statement
        if (years >= 10) {
            rate += 1.2;
        }

        double interest = (principal * rate * years) / 100;

        System.out.println("Bank: " + bankName);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Calculated Interest: " + interest);
        System.out.println();
    }
}

//Main Class
public class BankCustomer{

    public static void main(String[] args){

        //Polymorphism
        Bank b1 = new MCB(100000, 6);
        Bank b2 = new HBL(600000, 4);
        Bank b3 = new SCB(200000, 10);

        //Runtime Polymorphism + Method Overriding
        b1.calculateInterest();
        b2.calculateInterest();
        b3.calculateInterest();
    }
}

