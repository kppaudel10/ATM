package com.company;

import java.util.Scanner;

public class UserDATA {
    public int valid=0;
    public int userID[]={985632, 982536, 984523, 981420, 980000, 982036};
    public int password[]={4582, 3695, 1203, 1523, 8848, 2036};
    public int validate_check(int userid, int pin){
        for (int i =0;i<6;i++){
            if (userid == userID[i] && pin == password[i]){
                valid++;
            }
        }
        return valid;
    }
    public void display(int condition){
        if (condition == 1){
            System.out.println("Please wait...");
            //call constructor of Account class to continues the process
            Account ac_obj = new Account();
        }
        else {
            System.out.println("Invalid Userid and Password.");
            System.out.println("Try Again.");
        }
    }
    public UserDATA() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Your UserID:\t");
        int userid = scan.nextInt();
        System.out.printf("Password:\t");
        int password = scan.nextInt();
        //lets check userID validate or not
        int valid = validate_check(userid,password);
        display(valid);
    }
    public static void main(String[] args) {
//       UserDATA obj_UD = new UserDATA();
    }
}
