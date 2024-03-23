package io.springrestuserdatabase.repository;

import io.springrestuserdatabase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
