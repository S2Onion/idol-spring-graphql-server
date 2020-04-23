package com.test.idol.dao;

import com.test.idol.vo.IdolGroup;
import com.test.idol.vo.IdolMembers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("idolDao")
public interface IdolDao {

    List<IdolGroup> selectIdolGroupList(IdolGroup paramVO) throws Exception;

    IdolMembers selectIdolInfo(IdolMembers paramVO) throws Exception;

    List<IdolMembers> selectIdolGroupMembers(IdolGroup paramVO) throws Exception;

}
