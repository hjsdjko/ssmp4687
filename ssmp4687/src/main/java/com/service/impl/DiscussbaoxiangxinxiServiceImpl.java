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


import com.dao.DiscussbaoxiangxinxiDao;
import com.entity.DiscussbaoxiangxinxiEntity;
import com.service.DiscussbaoxiangxinxiService;
import com.entity.vo.DiscussbaoxiangxinxiVO;
import com.entity.view.DiscussbaoxiangxinxiView;

@Service("discussbaoxiangxinxiService")
public class DiscussbaoxiangxinxiServiceImpl extends ServiceImpl<DiscussbaoxiangxinxiDao, DiscussbaoxiangxinxiEntity> implements DiscussbaoxiangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaoxiangxinxiEntity> page = this.selectPage(
                new Query<DiscussbaoxiangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussbaoxiangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaoxiangxinxiEntity> wrapper) {
		  Page<DiscussbaoxiangxinxiView> page =new Query<DiscussbaoxiangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaoxiangxinxiVO> selectListVO(Wrapper<DiscussbaoxiangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaoxiangxinxiVO selectVO(Wrapper<DiscussbaoxiangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaoxiangxinxiView> selectListView(Wrapper<DiscussbaoxiangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaoxiangxinxiView selectView(Wrapper<DiscussbaoxiangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
