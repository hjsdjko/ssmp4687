package com.dao;

import com.entity.BaoxiangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiangxinxiVO;
import com.entity.view.BaoxiangxinxiView;


/**
 * 包厢信息
 * 
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public interface BaoxiangxinxiDao extends BaseMapper<BaoxiangxinxiEntity> {
	
	List<BaoxiangxinxiVO> selectListVO(@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);
	
	BaoxiangxinxiVO selectVO(@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);
	
	List<BaoxiangxinxiView> selectListView(@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);

	List<BaoxiangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);
	
	BaoxiangxinxiView selectView(@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);
	

}
