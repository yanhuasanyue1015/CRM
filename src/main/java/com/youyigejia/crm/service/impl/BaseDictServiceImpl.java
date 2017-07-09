package com.youyigejia.crm.service.impl;

import com.youyigejia.crm.domain.BaseDict;
import com.youyigejia.crm.mapper.BaseDictMapper;
import com.youyigejia.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张磊 on 2017/7/8.
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> searchByDictTypeCode(String dictTypeCode) {
        return baseDictMapper.searchByDictTypeCode(dictTypeCode);
    }
}
