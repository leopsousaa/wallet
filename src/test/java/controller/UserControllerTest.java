package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.wallet.WalletApplication;
import org.wallet.dto.UserDTO;
import org.wallet.entity.User;
import org.wallet.service.UserService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WalletApplication.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class UserControllerTest {

    private static final String EMAIL = "email@test.com";
    private static final String NAME = "User test";
    private static final String PASSWORD = "User1234";
    private static final String STRING_URL = "/user";

    @MockBean
    UserService service;

    @Autowired
    MockMvc mvc;

    @Test
    public void testSave() throws Exception {

        BDDMockito.given(service.save(Mockito.any(User.class))).willReturn(getMockUser());

        mvc.perform(MockMvcRequestBuilders.post(STRING_URL).content(getJsonPayload())
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    public User getMockUser() {
        User u = new User();

        u.setName(NAME);
        u.setPassword(PASSWORD);
        u.setEmail(EMAIL);

        return u;
    }

    public String getJsonPayload() throws JsonProcessingException {
        UserDTO dto = new UserDTO();

        dto.setName(NAME);
        dto.setEmail(EMAIL);
        dto.setPassword(PASSWORD);

        ObjectMapper mapper = new ObjectMapper();

        return mapper.writeValueAsString(dto);
    }

}
