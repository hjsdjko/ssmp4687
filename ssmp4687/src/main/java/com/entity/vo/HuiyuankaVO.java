package com.entity.vo;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员卡
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public class HuiyuankaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员价格
	 */
	
	private Float huiyuanjiage;
		
	/**
	 * 会员优惠
	 */
	
	private String huiyuanyouhui;
				
	
	/**
	 * 设置：会员价格
	 */
	 
	public void setHuiyuanjiage(Float huiyuanjiage) {
		this.huiyuanjiage = huiyuanjiage;
	}
	
	/**
	 * 获取：会员价格
	 */
	public Float getHuiyuanjiage() {
		return huiyuanjiage;
	}
				
	
	/**
	 * 设置：会员优惠
	 */
	 
	public void setHuiyuanyouhui(String huiyuanyouhui) {
		this.huiyuanyouhui = huiyuanyouhui;
	}
	
	/**
	 * 获取：会员优惠
	 */
	public String getHuiyuanyouhui() {
		return huiyuanyouhui;
	}
			
}
