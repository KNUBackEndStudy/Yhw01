package com.springboot.week3.controller;

import com.springboot.week3.dto.ChangeNameRequestDto;
import com.springboot.week3.dto.RequestDto;
import com.springboot.week3.dto.ResponseDto;
import com.springboot.week3.service.LionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lion")
public class LionController {
    private final LionService lionService;

    @Autowired
    public LionController(LionService lionService){
        this.lionService = lionService;
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getLion(@RequestParam Long snum) throws Exception{
        ResponseDto responseDto = lionService.getLion(snum);

        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseDto> createLion(@RequestBody RequestDto requestDto){
        ResponseDto responseDto = lionService.saveLion(requestDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    @PutMapping("/put")
    public ResponseEntity<ResponseDto> changeLionName(@RequestBody ChangeNameRequestDto changeNameRequestDto) throws Exception{
        ResponseDto responseDto = lionService.changeLionName(changeNameRequestDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteLion(Long snum) throws Exception{
        lionService.deleteLion(snum);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
