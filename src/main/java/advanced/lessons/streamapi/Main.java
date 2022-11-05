package advanced.lessons.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Transaction t1 = new Transaction(1, 100, TransactionType.MARKET);
        Transaction t3 = new Transaction(3, 80, TransactionType.GROCERY);
        Transaction t6 = new Transaction(6, 120, TransactionType.GROCERY);
        Transaction t7 = new Transaction(7, 40, TransactionType.MARKET);
        Transaction t10 = new Transaction(10, 50, TransactionType.GROCERY);

        final List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(t1);
        transactionList.add(t3);
        transactionList.add(t6);
        transactionList.add(t7);
        transactionList.add(t10);

        Stream<Transaction> stream = transactionList.stream();

        //---Java Fundamentals---
        List<Transaction> listOfGroceryTypeTransactions = new ArrayList<>();
        for (int i = 0; i < transactionList.size(); i++) {
            if (transactionList.get(i).getTransactionType().equals(TransactionType.GROCERY)) {
                listOfGroceryTypeTransactions.add(transactionList.get(i));
            }
        }
        for (int i = 0; i < listOfGroceryTypeTransactions.size(); i++) {
            System.out.println(listOfGroceryTypeTransactions.get(i));
        }
        //-----------------------
        System.out.println("-------------------------------------");
        //---Java Advanced (Stream API) ---

        transactionList.stream()
                .filter(transaction -> transaction.getTransactionType().equals(TransactionType.GROCERY))
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //--------------------------------------

    }


}
