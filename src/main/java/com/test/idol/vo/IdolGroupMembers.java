package com.test.idol.vo;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IdolGroupMembers extends  IdolGroup{

    @GraphQLQuery(name = "idolMembers")
    private List<IdolMembers> idolMembers;

}
