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
 * 项目订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
@TableName("xiangmudingdan")
public class XiangmudingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmudingdanEntity() {
		
	}
	
	public XiangmudingdanEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
	 * 技师号
	 */
					
	private String jishihao;
	
	/**
	 * 技师名称
	 */
					
	private String jishimingcheng;
	
	/**
	 * 服务价格
	 */
					
	private Float fuwujiage;
	
	/**
	 * 会员优惠
	 */
					
	private Float huiyuanyouhui;
	
	/**
	 * 其他费用
	 */
					
	private Float qitafeiyong;
	
	/**
	 * 总消费
	 */
					
	private Float zongxiaofei;
	
	/**
	 * 订单时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dingdanshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
	 * 设置：会员优惠
	 */
	public void setHuiyuanyouhui(Float huiyuanyouhui) {
		this.huiyuanyouhui = huiyuanyouhui;
	}
	/**
	 * 获取：会员优惠
	 */
	public Float getHuiyuanyouhui() {
		return huiyuanyouhui;
	}
	/**
	 * 设置：其他费用
	 */
	public void setQitafeiyong(Float qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	/**
	 * 获取：其他费用
	 */
	public Float getQitafeiyong() {
		return qitafeiyong;
	}
	/**
	 * 设置：总消费
	 */
	public void setZongxiaofei(Float zongxiaofei) {
		this.zongxiaofei = zongxiaofei;
	}
	/**
	 * 获取：总消费
	 */
	public Float getZongxiaofei() {
		return zongxiaofei;
	}
	/**
	 * 设置：订单时间
	 */
	public void setDingdanshijian(Date dingdanshijian) {
		this.dingdanshijian = dingdanshijian;
	}
	/**
	 * 获取：订单时间
	 */
	public Date getDingdanshijian() {
		return dingdanshijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
