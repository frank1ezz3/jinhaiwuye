package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResBody<T> {
    public Integer code;
    public String msg;
    public long count;
    public List<T> data  = new ArrayList<T>();

}