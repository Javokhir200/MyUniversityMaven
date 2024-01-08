package uz.pdp.univer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserStatusEnum {
    REKTOR(1),
    STUDENT(2),
    GUEST(3);
    private final Integer index;
    public static UserStatusEnum getById(Integer id){
        for (UserStatusEnum status:UserStatusEnum.values()){
            if (status.getIndex().equals(id)){
                return status;
            }
        }
        return UserStatusEnum.GUEST;
    }
}
