package services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.wallet.WalletApplication;
import org.wallet.entity.User;
import org.wallet.repository.UserRepository;
import org.wallet.service.UserService;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WalletApplication.class)
@ActiveProfiles("test")
public class UserServiceTest {

    @MockBean
    UserRepository repository;

    @Autowired
    UserService service;

    @Before
    public void setUp() {
        BDDMockito.given(repository.findByEmailEquals(BDDMockito.anyString())).willReturn(Optional.of(new User()));
    }

    @Test
    public void testFindByEmail() {
        Optional<User> user = service.findByEmail("email@test.com");

        assertTrue(user.isPresent());
    }
}
