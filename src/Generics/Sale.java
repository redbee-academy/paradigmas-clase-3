package Generics;

import java.time.LocalDateTime;

public class Sale<T> {
    private LocalDateTime date;
    private Long amount;
    private T item;
}
