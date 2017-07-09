package com.youyigejia.crm.service;

import com.youyigejia.crm.domain.BaseDict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 张磊 on 2017/7/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext*.xml"})
public class BaseDictServiceTest {
    @Autowired
    BaseDictService baseDictService;
    @Test
    public void searchByDictTypeCode() throws Exception {
        List<BaseDict> baseDicts = baseDictService.searchByDictTypeCode("002");
        System.out.println(baseDicts);
    }

}