package uz.pdp.univer.domain;

import lombok.Data;

@Data
public class Group {
    static int sequence = 0;
    {
        sequence++;
    }
    private String name;
    private int groupId = sequence;
    private int facultyId;
}
