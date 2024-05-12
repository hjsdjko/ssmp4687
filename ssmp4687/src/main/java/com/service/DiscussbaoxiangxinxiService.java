package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaoxiangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaoxiangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaoxiangxinxiView;


/**
 * 包厢信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-12 14:16:32
 */
public interface DiscussbaoxiangxinxiService extends IService<DiscussbaoxiangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaoxiangxinxiVO> selectListVO(Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
   	
   	DiscussbaoxiangxinxiVO selectVO(@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
   	
   	List<DiscussbaoxiangxinxiView> selectListView(Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
   	
   	DiscussbaoxiangxinxiView selectView(@Param("ew") Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaoxiangxinxiEntity> wrapper);
   	

}

