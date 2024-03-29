package uz.pdp.univer.service;

import uz.pdp.univer.domain.GroupSubject;

import java.util.ArrayList;
import java.util.List;

public interface GroupSubjectService {
    List<GroupSubject> GROUP_SUBJECTS = new ArrayList<>();
    String addSubjectToGroup(Integer groupId,Integer subjectId);
    String removeSubjectFromGroup(Integer groupId,Integer subjectId);
    void showSubjectsByGroupId(Integer groupId);
}
