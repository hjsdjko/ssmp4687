package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishixinxiView;


/**
 * 技师信息
 *
 * @author 
 * @email 
 * @date 2022-04-12 14:16:31
 */
public interface JishixinxiService extends IService<JishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishixinxiVO> selectListVO(Wrapper<JishixinxiEntity> wrapper);
   	
   	JishixinxiVO selectVO(@Param("ew") Wrapper<JishixinxiEntity> wrapper);
   	
   	List<JishixinxiView> selectListView(Wrapper<JishixinxiEntity> wrapper);
   	
   	JishixinxiView selectView(@Param("ew") Wrapper<JishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishixinxiEntity> wrapper);
   	

}

