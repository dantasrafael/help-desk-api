package br.com.exesistemas.helpdesk.api.service;

import org.springframework.data.domain.Page;
import br.com.exesistemas.helpdesk.api.entity.User;

public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
}
