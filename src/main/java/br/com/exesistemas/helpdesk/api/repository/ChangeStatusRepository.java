package br.com.exesistemas.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.exesistemas.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}
