package com.luo.dao.master;

import com.luo.entity.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao {

    PersonEntity selectList();

}
