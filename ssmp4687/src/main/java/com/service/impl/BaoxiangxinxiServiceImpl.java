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


import com.dao.BaoxiangxinxiDao;
import com.entity.BaoxiangxinxiEntity;
import com.service.BaoxiangxinxiService;
import com.entity.vo.BaoxiangxinxiVO;
import com.entity.view.BaoxiangxinxiView;

@Service("baoxiangxinxiService")
public class BaoxiangxinxiServiceImpl extends ServiceImpl<BaoxiangxinxiDao, BaoxiangxinxiEntity> implements BaoxiangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiangxinxiEntity> page = this.selectPage(
                new Query<BaoxiangxinxiEntity>(params).getPage(),
                new EntityWrapper<BaoxiangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiangxinxiEntity> wrapper) {
		  Page<BaoxiangxinxiView> page =new Query<BaoxiangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiangxinxiVO> selectListVO(Wrapper<BaoxiangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiangxinxiVO selectVO(Wrapper<BaoxiangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiangxinxiView> selectListView(Wrapper<BaoxiangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiangxinxiView selectView(Wrapper<BaoxiangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
