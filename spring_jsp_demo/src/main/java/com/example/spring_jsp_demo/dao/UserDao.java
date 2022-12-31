package com.example.spring_jsp_demo.dao;

import com.example.spring_jsp_demo.beans.User;

public interface UserDao {

	User getUserById(String userId);
}
