package com.youyigejia.crm.queryvo;

import com.youyigejia.crm.config.PageConfig;

/**
 * Created by 张磊 on 2017/7/8.
 */
public class CustomerQueryVo {
    private String custName;
    private String custSource;
    private String custIndustry;

    private String custLevel;
    private Integer start;
    //每页显示数据条数
    private final int rows = PageConfig.Rows;
    //当前页数
    private Integer page = 1;

    //从数据库哪条数据开始查
    public Integer getStart() {
        start = (page - 1) * rows;
        return start;
    }

    public int getRows() {
        return rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }
}
