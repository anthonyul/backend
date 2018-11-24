package com.registrobd.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrobd.demo.dao.UserRepository;
import com.registrobd.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

		@Autowired
		protected UserRepository userRepository;

		public User save(User user) {
			// TODO Auto-generated method stub
			return this.userRepository.save(user);		}
}

