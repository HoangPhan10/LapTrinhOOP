package Bai13;

import java.time.LocalDate;

public class Certificate {
    private long id;
    private String name;
    private String rank;
    private LocalDate date;

    public Certificate() {
    }

    public Certificate(long id, String name, String rank, LocalDate date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }
}
