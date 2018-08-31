package com.gbai.tips;

/**
 * @program: logproject
 * @description:
 * @author: gbai
 * @create: 2018-08-30 18:23
 **/
public class Result {

    public static Tip success(){
        return new SuccessTip(TipEnum.SUCCESS,null);
    }

    public static Tip success(Object obj){
        return new SuccessTip(TipEnum.SUCCESS,obj);
    }
    public static Tip fail(){
        return new ErrorTip(TipEnum.FAIL,null);
    }

}
