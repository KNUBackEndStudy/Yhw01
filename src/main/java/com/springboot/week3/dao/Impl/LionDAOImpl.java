package com.springboot.week3.dao.Impl;

import com.springboot.week3.dao.LionDAO;
import com.springboot.week3.entity.Lion;
import com.springboot.week3.repository.LionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LionDAOImpl implements LionDAO {
    private final LionRepository lionRepository;

    @Autowired
    public LionDAOImpl(LionRepository lionRepository) {
        this.lionRepository = lionRepository;
    }

    @Override
    public Lion insertLion(Lion lion){
        Lion result = lionRepository.save(lion);
        return result;
    }

    @Override
    public Lion selectLion(Long snum) throws Exception{
        Optional<Lion> lion = lionRepository.findBySnum(snum);

        if(lion.isPresent()) {
            Lion result = lion.get();
            return result;
        }else{
            throw new Exception("없음");
        }
    }

    @Override
    public Lion updateLionName(Long snum, String name) throws Exception{
        Optional<Lion> findLion = lionRepository.findBySnum(snum);

        Lion result;

        if(findLion != null) {
            Lion lion = findLion.get();

            lion.setName(name);

            result = lionRepository.save(lion);
        }else {
            throw new Exception("없음");
        }

        return result;
    }

    @Override
    public void deleteLion(Long snum) throws Exception{
        Optional<Lion> findLion = lionRepository.findBySnum(snum);

        if(findLion != null) {
            Lion lion = findLion.get();
            lionRepository.delete(lion);
        }else{
            throw new Exception("없음");
        }
    }
}

