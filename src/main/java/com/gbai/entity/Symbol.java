package com.gbai.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: logproject
 * @description: 系统标识类
 * @author: gbai
 * @create: 2018-08-31 18:04
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("symbol")
public class Symbol {

    private Integer id;

    private String symbol;

    private String describe;

}
