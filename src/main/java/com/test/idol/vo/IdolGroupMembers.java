package com.test.idol.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IdolGroupMembers extends  IdolGroup{

    private List<IdolMembers> idolMembers;

}
