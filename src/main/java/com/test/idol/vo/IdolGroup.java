package com.test.idol.vo;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdolGroup {

    @GraphQLQuery(name = "id")
    private Integer id;

    @GraphQLQuery(name = "groupNm")
    private String groupNm;

    @GraphQLQuery(name = "agency")
    private String agency;

}
