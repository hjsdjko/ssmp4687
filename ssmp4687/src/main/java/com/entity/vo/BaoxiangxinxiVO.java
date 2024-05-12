package com.entity.vo;

import com.entity.BaoxiangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 包厢信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public class BaoxiangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
