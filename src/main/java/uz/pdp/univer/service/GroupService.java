package uz.pdp.univer.service;

import uz.pdp.univer.domain.Group;

import java.util.ArrayList;
import java.util.List;

public interface GroupService {
    List<Group> GROUPS = new ArrayList<>();
    String addGroup(Group group);
}
