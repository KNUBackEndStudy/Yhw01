package com.springboot.week3.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {
    private String name;
    private String email;
    private Long snum;
    private String department;

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public Long getSnum() {
        return this.snum;
    }
    public String getDepartment(){
        return this.department;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSnum(Long snum){
        this.snum = snum;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public String ToString(){
        return "RequestDto(name=" + this.getName() + ", email=" + this.getEmail() + ", Student Number=" + this.getSnum() + ", Department=" + this.getDepartment() + ")";
    }
}
