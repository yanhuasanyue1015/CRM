package com.youyigejia.crm.domain;

/**
 * Created by 张磊 on 2017/7/9.
 */
public class TestDomain {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
