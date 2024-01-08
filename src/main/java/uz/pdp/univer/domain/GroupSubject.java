package uz.pdp.univer.domain;

import lombok.Data;

@Data
public class GroupSubject {
    private static int sequence = 0;
    {
        sequence++;
    }
    private int grSubId = sequence;
    private int groupId;
    private int subjectId;
}
