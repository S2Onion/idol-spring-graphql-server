package com.test.idol.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.idol.dao.IdolDao;
import com.test.idol.vo.IdolGroup;
import com.test.idol.vo.IdolMembers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class IdolQueryResolver implements GraphQLQueryResolver {

    @Resource(name = "idolDao")
    private IdolDao idolDao;

    public IdolMembers selectIdolInfo(String idolNm) throws Exception{
        IdolMembers paramVO = new IdolMembers();
        paramVO.setIdolNm(idolNm);
        return idolDao.selectIdolInfo(paramVO);
    }

    public List<IdolGroup> selectIdolGroupMembers(Integer id, String groupNm) throws Exception {
        IdolGroup paramVO  = new IdolGroup();
        paramVO.setId(id);
        paramVO.setGroupNm(groupNm);
        List<IdolGroup> resultList = idolDao.selectIdolGroupList(paramVO);

        for(IdolGroup vo : resultList){
            List<IdolMembers> membersListVO = idolDao.selectIdolGroupMembers(vo);
            vo.setIdolMembers(membersListVO);
        }
        return resultList;
    }

}
