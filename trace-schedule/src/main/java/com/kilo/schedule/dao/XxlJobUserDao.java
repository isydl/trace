package com.kilo.schedule.dao;

import com.kilo.schedule.core.entity.XxlJobUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xuxueli 2019-05-04 16:44:59
 */
@Mapper
public interface XxlJobUserDao {

	public List<XxlJobUser> pageList(@Param("offset") int offset,
									 @Param("pagesize") int pagesize,
									 @Param("username") String username,
									 @Param("role") int role);
	public int pageListCount(@Param("offset") int offset,
							 @Param("pagesize") int pagesize,
							 @Param("username") String username,
							 @Param("role") int role);

	public XxlJobUser loadByUserName(@Param("username") String username);

	public int save(XxlJobUser xxlJobUser);

	public int update(XxlJobUser xxlJobUser);
	
	public int delete(@Param("id") int id);

}
