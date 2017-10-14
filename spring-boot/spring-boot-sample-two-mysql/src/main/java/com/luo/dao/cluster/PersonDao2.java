package com.luo.dao.cluster;

import com.luo.entity.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao2 {

    PersonEntity selectList();

}

