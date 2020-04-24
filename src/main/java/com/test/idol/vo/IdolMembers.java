package com.test.idol.vo;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdolMembers {

    private Integer id;
    private Integer groupId;

    @GraphQLQuery(name = "idolNm")
    private String idolNm;

    @GraphQLQuery(name = "birth")
    private String birth;

}
