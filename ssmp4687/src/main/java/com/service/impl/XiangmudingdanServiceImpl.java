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


import com.dao.XiangmudingdanDao;
import com.entity.XiangmudingdanEntity;
import com.service.XiangmudingdanService;
import com.entity.vo.XiangmudingdanVO;
import com.entity.view.XiangmudingdanView;

@Service("xiangmudingdanService")
public class XiangmudingdanServiceImpl extends ServiceImpl<XiangmudingdanDao, XiangmudingdanEntity> implements XiangmudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmudingdanEntity> page = this.selectPage(
                new Query<XiangmudingdanEntity>(params).getPage(),
                new EntityWrapper<XiangmudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmudingdanEntity> wrapper) {
		  Page<XiangmudingdanView> page =new Query<XiangmudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmudingdanVO> selectListVO(Wrapper<XiangmudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmudingdanVO selectVO(Wrapper<XiangmudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmudingdanView> selectListView(Wrapper<XiangmudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmudingdanView selectView(Wrapper<XiangmudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XiangmudingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XiangmudingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XiangmudingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
