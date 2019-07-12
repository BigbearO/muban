package cn.edu.cuit.ssm.service;


import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;
/**
 * 
 *  南阳德刚版权所有http://www.guodexian.com<br>
 *
 *
 * 2019年7月10日下午5:57:51
 */
public interface GoodsService {

	PageInfo<Goods> findAll(int pageNum,int pageSize);

}
