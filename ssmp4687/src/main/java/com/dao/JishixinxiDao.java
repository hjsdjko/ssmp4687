package com.dao;

import com.entity.JishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishixinxiVO;
import com.entity.view.JishixinxiView;


/**
 * 技师信息
 * 
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public interface JishixinxiDao extends BaseMapper<JishixinxiEntity> {
	
	List<JishixinxiVO> selectListVO(@Param("ew") Wrapper<JishixinxiEntity> wrapper);
	
	JishixinxiVO selectVO(@Param("ew") Wrapper<JishixinxiEntity> wrapper);
	
	List<JishixinxiView> selectListView(@Param("ew") Wrapper<JishixinxiEntity> wrapper);

	List<JishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JishixinxiEntity> wrapper);
	
	JishixinxiView selectView(@Param("ew") Wrapper<JishixinxiEntity> wrapper);
	

}
