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
 * 包厢信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
@TableName("baoxiangxinxi")
public class BaoxiangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoxiangxinxiEntity() {
		
	}
	
	public BaoxiangxinxiEntity(T t) {
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
	 * 包厢号
	 */
					
	private String baoxianghao;
	
	/**
	 * 包厢名称
	 */
					
	private String baoxiangmingcheng;
	
	/**
	 * 包厢图片
	 */
					
	private String baoxiangtupian;
	
	/**
	 * 包厢面积
	 */
					
	private String baoxiangmianji;
	
	/**
	 * 包厢详情
	 */
					
	private String baoxiangxiangqing;
	
	/**
	 * 包厢状态
	 */
					
	private String baoxiangzhuangtai;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 商家姓名
	 */
					
	private String shangjiaxingming;
	
	
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
	 * 设置：包厢号
	 */
	public void setBaoxianghao(String baoxianghao) {
		this.baoxianghao = baoxianghao;
	}
	/**
	 * 获取：包厢号
	 */
	public String getBaoxianghao() {
		return baoxianghao;
	}
	/**
	 * 设置：包厢名称
	 */
	public void setBaoxiangmingcheng(String baoxiangmingcheng) {
		this.baoxiangmingcheng = baoxiangmingcheng;
	}
	/**
	 * 获取：包厢名称
	 */
	public String getBaoxiangmingcheng() {
		return baoxiangmingcheng;
	}
	/**
	 * 设置：包厢图片
	 */
	public void setBaoxiangtupian(String baoxiangtupian) {
		this.baoxiangtupian = baoxiangtupian;
	}
	/**
	 * 获取：包厢图片
	 */
	public String getBaoxiangtupian() {
		return baoxiangtupian;
	}
	/**
	 * 设置：包厢面积
	 */
	public void setBaoxiangmianji(String baoxiangmianji) {
		this.baoxiangmianji = baoxiangmianji;
	}
	/**
	 * 获取：包厢面积
	 */
	public String getBaoxiangmianji() {
		return baoxiangmianji;
	}
	/**
	 * 设置：包厢详情
	 */
	public void setBaoxiangxiangqing(String baoxiangxiangqing) {
		this.baoxiangxiangqing = baoxiangxiangqing;
	}
	/**
	 * 获取：包厢详情
	 */
	public String getBaoxiangxiangqing() {
		return baoxiangxiangqing;
	}
	/**
	 * 设置：包厢状态
	 */
	public void setBaoxiangzhuangtai(String baoxiangzhuangtai) {
		this.baoxiangzhuangtai = baoxiangzhuangtai;
	}
	/**
	 * 获取：包厢状态
	 */
	public String getBaoxiangzhuangtai() {
		return baoxiangzhuangtai;
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
	 * 设置：商家姓名
	 */
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
	}

}
