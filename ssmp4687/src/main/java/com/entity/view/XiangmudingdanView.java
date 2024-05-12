package com.entity.view;

import com.entity.XiangmudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
@TableName("xiangmudingdan")
public class XiangmudingdanView  extends XiangmudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmudingdanView(){
	}
 
 	public XiangmudingdanView(XiangmudingdanEntity xiangmudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
