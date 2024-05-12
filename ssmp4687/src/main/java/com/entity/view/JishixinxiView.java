package com.entity.view;

import com.entity.JishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技师信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
@TableName("jishixinxi")
public class JishixinxiView  extends JishixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JishixinxiView(){
	}
 
 	public JishixinxiView(JishixinxiEntity jishixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jishixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
