package com.test.idol.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IdolGroupAlbums extends IdolGroup {

    private List<IdolAlbums> idolAlbums;
}
