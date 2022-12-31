package com.example.spring_jsp_demo.service.imple;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowire
	UserDao userDao;
	
	@Override
	public User getUserByUserId(String userId) {
		User user = userDao.getUserById(userId);
		return user;
	}
}
