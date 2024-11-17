package com.springboot.week3.service;

import com.springboot.week3.dto.ChangeNameRequestDto;
import com.springboot.week3.dto.RequestDto;
import com.springboot.week3.dto.ResponseDto;

public interface LionService {
    ResponseDto getLion(Long snum) throws Exception;
    ResponseDto saveLion(RequestDto requestDto);
    ResponseDto changeLionName(ChangeNameRequestDto changeNameRequestDto) throws Exception;
    void deleteLion(Long snum) throws Exception;
}
