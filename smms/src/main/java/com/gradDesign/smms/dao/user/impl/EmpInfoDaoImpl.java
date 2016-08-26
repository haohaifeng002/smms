package com.gradDesign.smms.dao.user.impl;

import org.springframework.stereotype.Repository;

import com.gradDesign.smms.base.GenericDaoImpl;
import com.gradDesign.smms.dao.user.EmpInfoDao;
import com.gradDesign.smms.domain.EmpInfo;

/**
 * @author hhf
 * @param <Serializable>
 *
 */
@Repository("empInfoDao")
public class EmpInfoDaoImpl extends GenericDaoImpl<EmpInfo> implements EmpInfoDao {
 
}
