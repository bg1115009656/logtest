package com.gbai.tips;

/**
 * 返回给前台的错误提示
 *
 */
public class ErrorTip extends Tip {

    public ErrorTip(TipEnum tipEnum,Object obj){
        super.code = tipEnum.getCode();
        super.message = tipEnum.getMessage();
        super.data = obj ;
    }

}
