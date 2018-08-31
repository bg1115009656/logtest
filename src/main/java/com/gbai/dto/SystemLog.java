package com.gbai.dto;

import lombok.Data;

/**
 * @program: logproject
 * @description:
 * @author: gbai
 * @create: 2018-08-31 18:00
 **/
@Data
public class SystemLog {

    private String type;

    private String describe;

    private Exception e;
}
