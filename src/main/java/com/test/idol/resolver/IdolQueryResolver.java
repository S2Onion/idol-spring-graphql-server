package com.test.idol.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.idol.dao.IdolDao;
import com.test.idol.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class IdolQueryResolver implements GraphQLQueryResolver {

    @Resource(name = "idolDao")
    private IdolDao idolDao;

    public List<IdolGroup> selectIdolGroup(Integer id, String groupNm) throws Exception {
        IdolGroup paramVO  = new IdolGroup();
        paramVO.setId(id);
        paramVO.setGroupNm(groupNm);
        return idolDao.selectIdolGroupList(paramVO);
    }

    public IdolMembers selectIdolInfo(String idolNm) throws Exception{
        IdolMembers paramVO = new IdolMembers();
        paramVO.setIdolNm(idolNm);
        return idolDao.selectIdolInfo(paramVO);
    }

    public List<IdolGroupMembers> selectIdolGroupMembers(Integer id, String groupNm) throws Exception {
        List<IdolGroupMembers> resultList = new ArrayList<>();
        List<IdolGroup> idolGroupList = selectIdolGroup(id, groupNm);

        for (IdolGroup vo : idolGroupList) {
            IdolGroupMembers setVO = new IdolGroupMembers();
            BeanUtils.copyProperties(vo, setVO, IdolGroupMembers.class);
            List<IdolMembers> membersListVO = idolDao.selectIdolGroupMembers(vo);
            setVO.setIdolMembers(membersListVO);
            resultList.add(setVO);
        }
        return resultList;
    }

    public List<IdolGroupAlbums> selectIdolGroupAlbums(Integer id, String groupNm) throws Exception {
        List<IdolGroupAlbums> resultList = new ArrayList<>();
        List<IdolGroup> idolGroupList = selectIdolGroup(id, groupNm);

        for (IdolGroup vo : idolGroupList) {
            IdolGroupAlbums setVO = new IdolGroupAlbums();
            BeanUtils.copyProperties(vo, setVO, IdolGroupAlbums.class);
            List<IdolAlbums> membersListVO = idolDao.selectIdolGroupAlbums(vo);
            setVO.setIdolAlbums(membersListVO);
            resultList.add(setVO);
        }
        return resultList;
    }
}
