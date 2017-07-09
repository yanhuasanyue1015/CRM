package com.youyigejia.crm.util;

import com.youyigejia.crm.config.PageConfig;

import java.util.List;

public class Page<T> {
    //总条数
    private int total;
    //当前页数
    private int page;
    //每页最多显示个数
    private int size = PageConfig.Rows;
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }


}
