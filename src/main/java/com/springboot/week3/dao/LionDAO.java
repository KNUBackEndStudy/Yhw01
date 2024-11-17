package com.springboot.week3.dao;

import com.springboot.week3.entity.Lion;

public interface LionDAO {
    Lion insertLion(Lion lion);

    Lion selectLion(Long snum) throws Exception;

    Lion updateLionName(Long snum, String name) throws Exception;

    void deleteLion(Long snum) throws Exception;
}
