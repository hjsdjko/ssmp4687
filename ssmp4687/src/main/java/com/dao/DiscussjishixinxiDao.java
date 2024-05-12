package com.dao;

import com.entity.DiscussjishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjishixinxiVO;
import com.entity.view.DiscussjishixinxiView;


/**
 * 技师信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public interface DiscussjishixinxiDao extends BaseMapper<DiscussjishixinxiEntity> {
	
	List<DiscussjishixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);
	
	DiscussjishixinxiVO selectVO(@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);
	
	List<DiscussjishixinxiView> selectListView(@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);

	List<DiscussjishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);
	
	DiscussjishixinxiView selectView(@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);
	

}
