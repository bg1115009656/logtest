package com.gbai.tips;

/**
 * 返回给前台的成功提示
 *
 */
public class SuccessTip extends Tip {
	
	public SuccessTip(TipEnum tipEnum,Object obj){
		super.code = tipEnum.getCode();
		super.message = tipEnum.getMessage();
		super.data = obj ;
	}

}
