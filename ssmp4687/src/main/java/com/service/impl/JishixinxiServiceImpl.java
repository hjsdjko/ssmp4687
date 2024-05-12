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


import com.dao.JishixinxiDao;
import com.entity.JishixinxiEntity;
import com.service.JishixinxiService;
import com.entity.vo.JishixinxiVO;
import com.entity.view.JishixinxiView;

@Service("jishixinxiService")
public class JishixinxiServiceImpl extends ServiceImpl<JishixinxiDao, JishixinxiEntity> implements JishixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishixinxiEntity> page = this.selectPage(
                new Query<JishixinxiEntity>(params).getPage(),
                new EntityWrapper<JishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishixinxiEntity> wrapper) {
		  Page<JishixinxiView> page =new Query<JishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishixinxiVO> selectListVO(Wrapper<JishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishixinxiVO selectVO(Wrapper<JishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishixinxiView> selectListView(Wrapper<JishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishixinxiView selectView(Wrapper<JishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
