package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjishixinxiDao;
import com.entity.DiscussjishixinxiEntity;
import com.service.DiscussjishixinxiService;
import com.entity.vo.DiscussjishixinxiVO;
import com.entity.view.DiscussjishixinxiView;

@Service("discussjishixinxiService")
public class DiscussjishixinxiServiceImpl extends ServiceImpl<DiscussjishixinxiDao, DiscussjishixinxiEntity> implements DiscussjishixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjishixinxiEntity> page = this.selectPage(
                new Query<DiscussjishixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjishixinxiEntity> wrapper) {
		  Page<DiscussjishixinxiView> page =new Query<DiscussjishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjishixinxiVO> selectListVO(Wrapper<DiscussjishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjishixinxiVO selectVO(Wrapper<DiscussjishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjishixinxiView> selectListView(Wrapper<DiscussjishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjishixinxiView selectView(Wrapper<DiscussjishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
