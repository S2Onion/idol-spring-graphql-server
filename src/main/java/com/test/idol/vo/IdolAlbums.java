package com.test.idol.vo;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdolAlbums {

    private Integer id;
    private Integer groupId;

    @GraphQLQuery(name = "albumNm")
    private String albumNm;

    @GraphQLQuery(name = "detail")
    private String detail;
}
