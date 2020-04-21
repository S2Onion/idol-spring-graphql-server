package com.test.idol.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("idolDao")
public interface IdolDao {

    List<Object> selectIdolList() throws Exception;
}
