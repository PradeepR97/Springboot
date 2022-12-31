package com.example.spring_jsp_demo.dao.impl;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.spring_jsp_demo.dao.UserDao;
import com.example.spring_jsp_demo.beans.User;

import jakarta.annotation.PostConstruct;


@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
	@Autowired
	DataSource datasource;
	
	@PostConstruct
	private void initialize() {
		SetDataSourceTag(datasource);
	}
	
	@Override
	public User getUserById(String userId) {
		String str = "select cast(aes_decrypt(unhex(`user_pswd`),'secret') as char(50)) as user_pswd from user where user_id=?";
		return getJdbcTemplate().queryForObject(str, new Object[] {userId}, new RowMapper<User>() {
			
			@Override
			public ArrayList<User> mapRow(ResuletSet rs, int rowNum) throws SQLException{
					User user = new User();
					user.setUserId(userId);
					user.setPassword(rs.getString(1));
				return user;
			}
		});
		
	}
	
}

