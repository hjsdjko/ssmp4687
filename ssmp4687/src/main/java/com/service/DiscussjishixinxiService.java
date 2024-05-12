package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjishixinxiView;


/**
 * 技师信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public interface DiscussjishixinxiService extends IService<DiscussjishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjishixinxiVO> selectListVO(Wrapper<DiscussjishixinxiEntity> wrapper);
   	
   	DiscussjishixinxiVO selectVO(@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);
   	
   	List<DiscussjishixinxiView> selectListView(Wrapper<DiscussjishixinxiEntity> wrapper);
   	
   	DiscussjishixinxiView selectView(@Param("ew") Wrapper<DiscussjishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjishixinxiEntity> wrapper);
   	

}

