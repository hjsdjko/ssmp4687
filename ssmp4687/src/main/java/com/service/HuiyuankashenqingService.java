package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuankashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuankashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuankashenqingView;


/**
 * 会员卡申请
 *
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public interface HuiyuankashenqingService extends IService<HuiyuankashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuankashenqingVO> selectListVO(Wrapper<HuiyuankashenqingEntity> wrapper);
   	
   	HuiyuankashenqingVO selectVO(@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);
   	
   	List<HuiyuankashenqingView> selectListView(Wrapper<HuiyuankashenqingEntity> wrapper);
   	
   	HuiyuankashenqingView selectView(@Param("ew") Wrapper<HuiyuankashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuankashenqingEntity> wrapper);
   	

}

