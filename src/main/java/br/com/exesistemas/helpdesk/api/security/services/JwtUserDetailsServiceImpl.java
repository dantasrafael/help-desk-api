package br.com.exesistemas.helpdesk.api.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import br.com.exesistemas.helpdesk.api.entity.User;
import br.com.exesistemas.helpdesk.api.security.JwtUserFactory;
import br.com.exesistemas.helpdesk.api.service.UserService;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.findByEmail(username);

		if (user != null) {
			return JwtUserFactory.create(user);
		}

		throw new UsernameNotFoundException("Email não encontrado.");
	}

}
