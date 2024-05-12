package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 技师信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
@TableName("jishixinxi")
public class JishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JishixinxiEntity() {
		
	}
	
	public JishixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 技师号
	 */
					
	private String jishihao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：技师号
	 */
	public void setJishihao(String jishihao) {
		this.jishihao = jishihao;
	}
	/**
	 * 获取：技师号
	 */
	public String getJishihao() {
		return jishihao;
	}
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
