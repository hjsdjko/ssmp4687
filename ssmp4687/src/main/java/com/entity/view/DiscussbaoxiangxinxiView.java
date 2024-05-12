package com.entity.view;

import com.entity.DiscussbaoxiangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 包厢信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
@TableName("discussbaoxiangxinxi")
public class DiscussbaoxiangxinxiView  extends DiscussbaoxiangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaoxiangxinxiView(){
	}
 
 	public DiscussbaoxiangxinxiView(DiscussbaoxiangxinxiEntity discussbaoxiangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaoxiangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
