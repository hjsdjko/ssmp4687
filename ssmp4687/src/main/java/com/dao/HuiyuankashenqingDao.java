package com.dao;

import com.entity.HuiyuankashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuankashenqingVO;
import com.entity.view.HuiyuankashenqingView;


/**
 * 会员卡申请
 * 
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public interface HuiyuankashenqingDao extends BaseMapper<HuiyuankashenqingEntity> {
	
	List<HuiyuankashenqingVO> selectListVO(@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);
	
	HuiyuankashenqingVO selectVO(@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);
	
	List<HuiyuankashenqingView> selectListView(@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);

	List<HuiyuankashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);
	
	HuiyuankashenqingView selectView(@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);
	

}
