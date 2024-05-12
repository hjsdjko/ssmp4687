package com.entity.model;

import com.entity.JishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 技师信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public class JishixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 技师名称
	 */
	
	private String jishimingcheng;
		
	/**
	 * 技师性别
	 */
	
	private String jishixingbie;
		
	/**
	 * 技师头像
	 */
	
	private String jishitouxiang;
		
	/**
	 * 服务价格
	 */
	
	private Float fuwujiage;
		
	/**
	 * 技师简介
	 */
	
	private String jishijianjie;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：技师名称
	 */
	 
	public void setJishimingcheng(String jishimingcheng) {
		this.jishimingcheng = jishimingcheng;
	}
	
	/**
	 * 获取：技师名称
	 */
	public String getJishimingcheng() {
		return jishimingcheng;
	}
				
	
	/**
	 * 设置：技师性别
	 */
	 
	public void setJishixingbie(String jishixingbie) {
		this.jishixingbie = jishixingbie;
	}
	
	/**
	 * 获取：技师性别
	 */
	public String getJishixingbie() {
		return jishixingbie;
	}
				
	
	/**
	 * 设置：技师头像
	 */
	 
	public void setJishitouxiang(String jishitouxiang) {
		this.jishitouxiang = jishitouxiang;
	}
	
	/**
	 * 获取：技师头像
	 */
	public String getJishitouxiang() {
		return jishitouxiang;
	}
				
	
	/**
	 * 设置：服务价格
	 */
	 
	public void setFuwujiage(Float fuwujiage) {
		this.fuwujiage = fuwujiage;
	}
	
	/**
	 * 获取：服务价格
	 */
	public Float getFuwujiage() {
		return fuwujiage;
	}
				
	
	/**
	 * 设置：技师简介
	 */
	 
	public void setJishijianjie(String jishijianjie) {
		this.jishijianjie = jishijianjie;
	}
	
	/**
	 * 获取：技师简介
	 */
	public String getJishijianjie() {
		return jishijianjie;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
