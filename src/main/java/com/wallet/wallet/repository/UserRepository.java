package com.wallet.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.wallet.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
