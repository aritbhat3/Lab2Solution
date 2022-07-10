package PayMoney;

import java.util.Scanner;

public class UserInput {

    //method to return the list of transactions
    public int[] transactionCollector() {
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter the number of transactions: ");
        int transactions = scObj.nextInt();
        System.out.println("Enter the transactions:");
        int[] transactionArr = new int[transactions];

        for (int index=0;index<transactions;index++) {
            transactionArr[index]=scObj.nextInt();
        }

        return transactionArr;
    }

    //method to return number of targets
    public int valueCollector() {
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter the number of Targets: ");
        return scObj.nextInt();
    }

    //method to return each target amount
    public int tranGet() {
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter the Target: ");
        return scObj.nextInt();
    }
}
