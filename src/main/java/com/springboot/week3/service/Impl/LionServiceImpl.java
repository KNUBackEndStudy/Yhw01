package com.springboot.week3.service.Impl;

import com.springboot.week3.dao.LionDAO;
import com.springboot.week3.dto.ChangeNameRequestDto;
import com.springboot.week3.dto.RequestDto;
import com.springboot.week3.dto.ResponseDto;
import com.springboot.week3.entity.Lion;
import com.springboot.week3.service.LionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LionServiceImpl implements LionService {
    private final LionDAO lionDAO;

    @Autowired
    public LionServiceImpl(LionDAO lionDAO) {
        this.lionDAO = lionDAO;
    }

    @Override
    public ResponseDto getLion(Long snum) throws Exception{
        Lion lion = lionDAO.selectLion(snum);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(lion.getId());
        responseDto.setName(lion.getName());
        responseDto.setEmail(lion.getEmail());
        responseDto.setSnum(lion.getSnum());
        responseDto.setDepartment(lion.getDepartment());

        return responseDto;
    }

    @Override
    public ResponseDto saveLion(RequestDto requestDto){
        Lion lion = new Lion();

        lion.setName(requestDto.getName());
        lion.setEmail(requestDto.getEmail());
        lion.setSnum(requestDto.getSnum());
        lion.setDepartment(requestDto.getDepartment());

        Lion savedLion = lionDAO.insertLion(lion);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(savedLion.getId());
        responseDto.setName(savedLion.getName());
        responseDto.setEmail(savedLion.getEmail());
        responseDto.setSnum(savedLion.getSnum());
        responseDto.setDepartment(savedLion.getDepartment());

        return responseDto;
    }

    @Override
    public ResponseDto changeLionName(ChangeNameRequestDto changeNameRequestDto) throws Exception{
        Lion findLion = lionDAO.updateLionName(changeNameRequestDto.getSnum(), changeNameRequestDto.getName());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(findLion.getId());
        responseDto.setName(findLion.getName());
        responseDto.setEmail(findLion.getEmail());
        responseDto.setSnum(findLion.getSnum());
        responseDto.setDepartment(findLion.getDepartment());

        return responseDto;
    }

    @Override
    public void deleteLion(Long snum) throws Exception{
        lionDAO.deleteLion(snum);
    }
}
