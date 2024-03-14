package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.login;

@Repository
public interface logrepo extends JpaRepository<login,String>
{
login findByUsernameAndPassword(String username, String password);
}