package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmudingdanView;


/**
 * 项目订单
 *
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public interface XiangmudingdanService extends IService<XiangmudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmudingdanVO> selectListVO(Wrapper<XiangmudingdanEntity> wrapper);
   	
   	XiangmudingdanVO selectVO(@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
   	
   	List<XiangmudingdanView> selectListView(Wrapper<XiangmudingdanEntity> wrapper);
   	
   	XiangmudingdanView selectView(@Param("ew") Wrapper<XiangmudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmudingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XiangmudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XiangmudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XiangmudingdanEntity> wrapper);
}

