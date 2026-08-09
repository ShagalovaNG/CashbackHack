import org.junit.Test;
import ru.netology.services.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashBackHackerServiceTest {
    @Test
    public void CashBackHackerService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}