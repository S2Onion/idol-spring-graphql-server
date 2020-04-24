package com.test.idol.vo;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IdolGroupAlbums extends IdolGroup {

    @GraphQLQuery(name = "idolAlbums")
    private List<IdolAlbums> idolAlbums;
}
