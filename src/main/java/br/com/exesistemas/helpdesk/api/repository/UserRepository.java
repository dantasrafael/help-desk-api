package br.com.exesistemas.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.exesistemas.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
