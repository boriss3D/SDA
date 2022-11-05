package advanced.lessons.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    Integer id;
    Integer value;
    TransactionType transactionType;


}
