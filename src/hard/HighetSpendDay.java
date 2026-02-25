package hard;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighetSpendDay {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", LocalDate.of(2024,1,1),300),
                new Transaction("T1", LocalDate.of(2024,1,1),200),
                new Transaction("T1", LocalDate.of(2024,1,2),500),
                new Transaction("T1", LocalDate.of(2024,1,2),300),
                new Transaction("T1", LocalDate.of(2024,1,3),100)
        );

        Map.Entry<LocalDate, Double> localDateDoubleEntry = transactions.stream()
                .collect(
                        Collectors.groupingBy(
                                Transaction::getDate,
                                Collectors.summingDouble(Transaction::getAmount)
                        )
                ).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(localDateDoubleEntry);
    }
}
