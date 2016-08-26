package com.gradDesign.smms.service.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gradDesign.smms.dao.user.EmpInfoDao;
import com.gradDesign.smms.domain.EmpInfo;
import com.gradDesign.smms.service.base.BaseService;
import com.gradDesign.smms.service.user.EmpInfoService;

@Service("empInfoService")
public class EmpInfoServiceImpl extends BaseService<EmpInfo> implements EmpInfoService {

	@Resource
	private EmpInfoDao empInfoDao;
	
	@Override
	public void SaveEmpInfo(EmpInfo empInfo) {
		if(empInfo != null) {
			empInfoDao.save(empInfo);
		}
	}
	
}
