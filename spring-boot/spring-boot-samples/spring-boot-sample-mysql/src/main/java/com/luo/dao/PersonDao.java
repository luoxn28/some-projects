package com.luo.dao;

import com.luo.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonDao {

    Person selectByName(@Param("name") String name);

}
