package com.cyzs.frontendentire.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description:
 * @Author xh
 * @create 2020-03-18 12:08
 */
@Data
@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue()
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String email;

    @Column
    private Integer gender;

    @Column
    private String address;
}
