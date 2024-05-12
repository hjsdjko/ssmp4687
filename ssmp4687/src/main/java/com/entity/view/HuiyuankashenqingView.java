package com.entity.view;

import com.entity.HuiyuankashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员卡申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
@TableName("huiyuankashenqing")
public class HuiyuankashenqingView  extends HuiyuankashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuankashenqingView(){
	}
 
 	public HuiyuankashenqingView(HuiyuankashenqingEntity huiyuankashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuankashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
