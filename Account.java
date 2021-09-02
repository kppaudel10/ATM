package com.company;

import java.util.Scanner;

public class Account {
    Scanner scan = new Scanner(System.in);
    public double current_ac_balance =0;
    public double saving_ac_balance=0;

    public void balance_show(int accountType){
        if (accountType == 1) {
            System.out.println("Your Balance: Rs. " +current_ac_balance);
        }
        else {
            System.out.println("Your Balance: Rs.  " +saving_ac_balance);
        }
    }

    public void deposit(int accountType){
        if (accountType == 1){
            System.out.println("Enter amount you want to deposit:\t");
            double amount = scan.nextDouble();
            current_ac_balance += amount;
        }
        else {
            System.out.println("Enter amount you want to deposit:\t");
            double amount = scan.nextDouble();
           saving_ac_balance += amount;
        }
    }

    public void withdraw( int accountType){
        if (accountType == 1){
            System.out.print("Enter amount you want to withdraw:\t");
            double withdraw_amount = scan.nextDouble();
            if (withdraw_amount <current_ac_balance)
            {
                current_ac_balance = current_ac_balance - withdraw_amount;
                System.out.println("You withdraw balance "+withdraw_amount +" from your current account.");
            }
            else {
                System.out.println("insufficient balance.");
            }
        }
        else {
            System.out.print("Enter amount you want to withdraw:\t");
            double withdraw_amount = scan.nextDouble();
            if (withdraw_amount <saving_ac_balance){
                saving_ac_balance = saving_ac_balance - withdraw_amount;
                System.out.println("You withdraw balance "+withdraw_amount +" from your Saving account.");
            }
            else{
                System.out.println("insufficient balance.");
            }
        }
    }

    public void operation(int accountType){
        int j =1;
        while (j>=1 && j <=3){
            System.out.print("\nOperation Menu\n");
            System.out.print("1.\tShow Balance\n");
            System.out.print("2.\tDeposit\n");
            System.out.print("3.\tWithdraw\n");
            System.out.print("4.\tBack\n");
            System.out.print("Choice:\t");
           int  choice = scan.nextInt();
           j = choice;
            switch (choice){
                case 1:
                    balance_show(accountType);
                    break;
                case 2:
                    deposit(accountType);
                    break;
                case 3:
                    withdraw(accountType);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    public void current_account(){
        operation(1);
    }
    public void saving_account(){
        operation(2);
    }
    public void account_choose() {
        int i = 1;
        while (i >= 1 && i <= 2) {
            System.out.print("Account Menu:\n");
            System.out.print("1.\tCurrent account\n");
            System.out.print("2.\tSaving account\n");
            System.out.print("3.\tExit\n");
            System.out.print("Choice:\t");
            int choice = scan.nextInt();
            i = choice;
            switch (choice) {
                case 1:
                    current_account();
                    break;
                case 2:
                    saving_account();
                case 3:
                    System.out.println("Thanks for visit.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        }
    }
    public Account(){
        account_choose();
    }
    public static void main(String[] args) {
        Account objAC = new Account();
//        objAC.account_choose();
    }
}
