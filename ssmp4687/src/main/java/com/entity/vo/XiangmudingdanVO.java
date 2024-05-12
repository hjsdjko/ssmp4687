package com.entity.vo;

import com.entity.XiangmudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 项目订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public class XiangmudingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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