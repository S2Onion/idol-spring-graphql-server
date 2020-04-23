package com.test.idol.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IdolGroup {

    private Integer id;
    private String groupNm;
    private String agency;
    private List<IdolMembers> idolMembers;
}
