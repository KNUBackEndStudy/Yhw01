package com.springboot.week3.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangeNameRequestDto {
    private Long snum;
    private String name;

    public Long getSnum() {
        return snum;
    }

    public String getName() {
        return name;
    }

    public void setSnum(Long snum) {
        this.snum = snum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "ChangeNameRequestDto(Student_Name=" + this.getSnum() + ", name=" + this.getName() + ")";
    }
}
