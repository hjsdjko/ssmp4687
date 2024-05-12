package com.dao;

import com.entity.DiscussbaoxiangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaoxiangxinxiVO;
import com.entity.view.DiscussbaoxiangxinxiView;


/**
 * 包厢信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public interface DiscussbaoxiangxinxiDao extends BaseMapper<DiscussbaoxiangxinxiEntity> {
	
	List<DiscussbaoxiangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
	
	DiscussbaoxiangxinxiVO selectVO(@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
	
	List<DiscussbaoxiangxinxiView> selectListView(@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);

	List<DiscussbaoxiangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
	
	DiscussbaoxiangxinxiView selectView(@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
	

}
