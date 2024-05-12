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


import com.dao.HuiyuankashenqingDao;
import com.entity.HuiyuankashenqingEntity;
import com.service.HuiyuankashenqingService;
import com.entity.vo.HuiyuankashenqingVO;
import com.entity.view.HuiyuankashenqingView;

@Service("huiyuankashenqingService")
public class HuiyuankashenqingServiceImpl extends ServiceImpl<HuiyuankashenqingDao, HuiyuankashenqingEntity> implements HuiyuankashenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuankashenqingEntity> page = this.selectPage(
                new Query<HuiyuankashenqingEntity>(params).getPage(),
                new EntityWrapper<HuiyuankashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuankashenqingEntity> wrapper) {
		  Page<HuiyuankashenqingView> page =new Query<HuiyuankashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuankashenqingVO> selectListVO(Wrapper<HuiyuankashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuankashenqingVO selectVO(Wrapper<HuiyuankashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuankashenqingView> selectListView(Wrapper<HuiyuankashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuankashenqingView selectView(Wrapper<HuiyuankashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
