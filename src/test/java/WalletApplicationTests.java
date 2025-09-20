import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.wallet.WalletApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WalletApplication.class)
@ActiveProfiles("test")
public class WalletApplicationTests {
    @Test
    public void contextLoads() {
    }
}
