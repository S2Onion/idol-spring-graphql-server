package com.test.idol.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.idol.dao.IdolDao;
import com.test.idol.vo.Idol;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class IdolQueryResolver implements GraphQLQueryResolver {

    @Resource(name = "idolDao")
    private IdolDao idolDao;

    public Idol idol(Integer id, String nm) {

        log.info("id=[" + id +"] nm=[" + nm + "]");

        Idol idol = new Idol();
        idol.setId(id);
        idol.setNm(nm);
        return idol;
    }

    public List<Idol> selectIdolList() {
        List<Idol> returnList = new ArrayList<>();
        Idol idol = new Idol();
        idol.setId(1);
        idol.setNm("아이유");
        returnList.add(idol);

        idol = new Idol();
        idol.setId(2);
        idol.setNm("트와이스");
        returnList.add(idol);

        return returnList;
    }
}
