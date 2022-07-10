package PayMoney;

public class TransactionCalculator {

    //Program run from the following main method:

    public static void main(String args[]) {
        UserInput uObj = new UserInput();
        int[] transactions = uObj.transactionCollector();
        int targets=uObj.valueCollector(), verdict;
        for (int index = 1; index<=targets; index++)
            verdict=targetCalculator(transactions,uObj.tranGet());
    }

    //Iterates over targets and provides required output

    public static int targetCalculator(int[] tranArr, int val) {
        long total = 0;
        int counter = 0;
        for (int element : tranArr) {
            total=total+element;
            counter++;
            if (total>=val) {
                System.out.println("Target is achieved after " + counter + " transactions.");
                return 1;
            }
        }
        System.out.println("Given Target is not achieved.");
        return 0;
    }

}
