package com.entity.vo;

import com.entity.HuiyuankashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员卡申请
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public class HuiyuankashenqingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 会员周期
	 */
	
	private String huiyuanzhouqi;
		
	/**
	 * 会员价格
	 */
	
	private String huiyuanjiage;
		
	/**
	 * 会员优惠
	 */
	
	private String huiyuanyouhui;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：会员周期
	 */
	 
	public void setHuiyuanzhouqi(String huiyuanzhouqi) {
		this.huiyuanzhouqi = huiyuanzhouqi;
	}
	
	/**
	 * 获取：会员周期
	 */
	public String getHuiyuanzhouqi() {
		return huiyuanzhouqi;
	}
				
	
	/**
	 * 设置：会员价格
	 */
	 
	public void setHuiyuanjiage(String huiyuanjiage) {
		this.huiyuanjiage = huiyuanjiage;
	}
	
	/**
	 * 获取：会员价格
	 */
	public String getHuiyuanjiage() {
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
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
