package com.example.sravs.Example.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sravs.Example.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	
}
