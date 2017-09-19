package com.luo.dao;

import com.luo.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Person操作类
 * @author luo
 */
@Mapper
@Repository
public interface PersonDao {

    List<PersonEntity> selectAll();

}
