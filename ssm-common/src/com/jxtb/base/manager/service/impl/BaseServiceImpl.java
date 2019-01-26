package com.jxtb.base.manager.service.impl;

import com.jxtb.common.page.PageList;
import com.jxtb.common.page.PageProperty;
import com.jxtb.utils.PageUtil;
import com.jxtb.base.manager.mapper.BaseMapper;
import com.jxtb.base.manager.service.IBaseService;

import java.util.List;
import java.util.Map;

public class BaseServiceImpl<T,I extends BaseMapper<T>> implements IBaseService<T> {
	
	private I baseMapper;

	public I getBaseMapper() {
		return baseMapper;
	}

	public void setBaseMapper(I baseMapper) {
		this.baseMapper = baseMapper;
	}

	public Object insert(T po) {
		return baseMapper.insert(po);
	}

	public int delete(Map<String, Object> param) {
		return baseMapper.delete(param);
	}

	public int update(T po) {
		return baseMapper.update(po);
	}

	public T get(Map<String, Object> param) {
		return baseMapper.get(param);
	}

	public List<T> list(Map<String, Object> param) {
		return baseMapper.list(param);
	}

	public int getCount(Map<String,Object> param) {
		return baseMapper.getCount(param);
	}

	public PageList<T> getPageList(PageProperty pp) {
		int count = baseMapper.getCount(pp.getParamMap());
		int start = PageUtil.getStart(pp.getNpage(), count, pp.getNpagesize());
		int end = PageUtil.getEnd(pp.getNpage(), count, pp.getNpagesize());
		pp.putParamMap("startrow", start);
		pp.putParamMap("endrow", end);
		pp.putParamMap("pageSize", pp.getNpagesize());//mysql用到的参数
		PageList<T>	pageList = new PageList<T>(pp, count, baseMapper.getSplitList(pp.getParamMap()));
		return pageList;
	}

	

}
