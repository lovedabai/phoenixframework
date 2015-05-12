package org.phoenix.web.dao.impl;

import java.util.List;

import org.phoenix.basic.impl.BaseDao;
import org.phoenix.basic.paging.Pager;
import org.phoenix.web.dao.ISlaveDao;
import org.phoenix.web.model.SlaveModel;
import org.springframework.stereotype.Repository;

/**
 * 对分机节点操作的dao
 * @author mengfeiyang
 *
 */
@Repository
public class SlaveDao extends BaseDao<SlaveModel> implements ISlaveDao{
	
	/**
	 * 获取分机信息列表，但不含分页信息
	 * @return
	 */
	public List<SlaveModel> getSlaveModelList(){
		return super.list("from SlaveModel");
	}
	
	/**
	 * 获取分机信息列表，包含分页数据
	 * @return
	 */
	public Pager<SlaveModel> getSlaveModelPager(){
		return super.find("from SlaveModel");
	}

}