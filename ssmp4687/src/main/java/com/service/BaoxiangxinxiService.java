package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiangxinxiView;


/**
 * 包厢信息
 *
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public interface BaoxiangxinxiService extends IService<BaoxiangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiangxinxiVO> selectListVO(Wrapper<BaoxiangxinxiEntity> wrapper);
   	
   	BaoxiangxinxiVO selectVO(@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);
   	
   	List<BaoxiangxinxiView> selectListView(Wrapper<BaoxiangxinxiEntity> wrapper);
   	
   	BaoxiangxinxiView selectView(@Param("ew") Wrapper<BaoxiangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiangxinxiEntity> wrapper);
   	

}

