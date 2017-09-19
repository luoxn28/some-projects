package com.luo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Person类
 * @author luo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {
    private String name;
    private int age;
}
