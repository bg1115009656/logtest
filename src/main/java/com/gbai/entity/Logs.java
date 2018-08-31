package com.gbai.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: logproject
 * @description:
 * @author: gbai
 * @create: 2018-08-31 16:23
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("logs")
public class Logs {

    private Long id;

    private String type;

    private String username;

    private String operate;

    private Date operateTime;

    private String ip;

}
