package uz.pdp.univer.domain;

import lombok.Data;

@Data
public class Faculty {
    static int sequence =0;
    {
        sequence++;
    }
    private int facultyId = sequence;
    private String facultyName;
}
