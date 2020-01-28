package com.syne.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.syne.api.model.User;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserId(String userId);
    @SuppressWarnings("unchecked")
	User save(User user);
}

