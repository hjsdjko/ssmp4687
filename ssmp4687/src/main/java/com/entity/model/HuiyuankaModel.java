package com.entity.model;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会员卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public class HuiyuankaModel  implements Serializable {
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
