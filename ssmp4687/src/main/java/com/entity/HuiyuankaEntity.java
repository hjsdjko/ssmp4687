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
 * 会员卡
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
@TableName("huiyuanka")
public class HuiyuankaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuankaEntity() {
		
	}
	
	public HuiyuankaEntity(T t) {
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
	 * 会员周期
	 */
					
	private String huiyuanzhouqi;
	
	/**
	 * 会员价格
	 */
					
	private Float huiyuanjiage;
	
	/**
	 * 会员优惠
	 */
					
	private String huiyuanyouhui;
	
	
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
