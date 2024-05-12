package com.dao;

import com.entity.XiangmudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmudingdanVO;
import com.entity.view.XiangmudingdanView;


/**
 * 项目订单
 * 
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public interface XiangmudingdanDao extends BaseMapper<XiangmudingdanEntity> {
	
	List<XiangmudingdanVO> selectListVO(@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
	
	XiangmudingdanVO selectVO(@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
	
	List<XiangmudingdanView> selectListView(@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);

	List<XiangmudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
	
	XiangmudingdanView selectView(@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
}
