package com.zqr.study.api.vo;

import java.io.Serializable;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-06-26 10:15
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4797501753390333194L;

    private Integer id;
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
