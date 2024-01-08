package uz.pdp.univer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    static int sequence = 0;
//    asd
    {
        sequence++;
    }
    private int userId = sequence;
    private String fullName;
    private String email;
    private String username;
    private String localPassword;
    private int groupId;
    private int facultyId;
}
