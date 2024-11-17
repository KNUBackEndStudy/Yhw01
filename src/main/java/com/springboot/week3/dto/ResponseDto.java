package com.springboot.week3.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private Long id;
    private String name;
    private String email;
    private Long snum;
    private String department;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getSnum() {
        return snum;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "ResponseDto(id=" + this.getId() +", name=" + this.getName() + ", email=" + this.getEmail() + ", Snum=" + this.getSnum() + ", Department=" + this.getDepartment() + ")";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSnum(Long snum) {
        this.snum = snum;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
