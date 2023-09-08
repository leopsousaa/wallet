package com.wallet.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.wallet.wallet.entity.User;
import com.wallet.wallet.repository.UserRepository;

@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

  @Autowired
  UserRepository repository;

  @Test
  public void testSave() {
    User u = new User();
    u.setName("Test");
    u.setPassword("1234");
    u.setEmail("test@email.com");

    User response = repository.save(u);

    assertNotNull(response);
  }
}
