package uz.pdp.univer.domain;

import lombok.Data;

@Data
public class Subject {
    static int counter = 0;
    {
        counter++;
    }
    private Integer subjectId = counter;
    private String subjectName;
}
