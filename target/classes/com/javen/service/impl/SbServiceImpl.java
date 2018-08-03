package com.javen.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javen.dao.SbUserDao;
import com.javen.service.SbService;
@Service("sbService")
public class SbServiceImpl implements SbService {
@Resource
private SbUserDao sbUserDao;
	public String test() {
		return sbUserDao.sb();
	}

}
