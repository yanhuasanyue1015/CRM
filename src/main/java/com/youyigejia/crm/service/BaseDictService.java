package com.youyigejia.crm.service;

import com.youyigejia.crm.domain.BaseDict;

import java.util.List;

/**
 * Created by 张磊 on 2017/7/8.
 */
public interface BaseDictService {
    List<BaseDict> searchByDictTypeCode(String dictTypeCode);
}
