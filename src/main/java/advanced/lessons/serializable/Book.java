package advanced.lessons.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Book implements Serializable {
    private int id;
    private String title;
    private String author;
}