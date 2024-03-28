package io.springrestuserdatabase.persistence.repository;

import io.springrestuserdatabase.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
