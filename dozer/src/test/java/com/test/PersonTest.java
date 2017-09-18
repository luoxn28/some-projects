package com.test;

import com.luo.bean.PersonBean;
import com.luo.entity.PersonEntity;
import org.dozer.DozerBeanMapper;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPerson() {
        DozerBeanMapper mapper = new DozerBeanMapper();

        PersonEntity person = new PersonEntity("luo", 25);

        System.out.println(person);
        System.out.println(mapper.map(person, PersonBean.class));;
    }

}
