package com.registrobd.demo.service;

import java.util.List;

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
		
		public List<User> findAll() {
			// TODO Auto-generated method stub
			return this.userRepository.findAll();
		}

		public void deleteUser(Long id) {
			// TODO Auto-generated method stub
			this.userRepository.deleteById(id);
		}
}

