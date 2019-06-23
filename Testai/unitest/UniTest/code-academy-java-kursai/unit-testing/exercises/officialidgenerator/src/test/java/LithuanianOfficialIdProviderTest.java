import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LithuanianOfficialIdProviderTest {

    @Test
    public void testIdProvider() {
        LithuanianOfficialIdProvider idProvider = new LithuanianOfficialIdProvider();
        Person jonas = new Person("Jonas", LocalDate.now(), Gender.MALE);
        String officialId = idProvider.generateOfficialId(jonas);
        assertEquals('3', officialId.charAt(0));
    }
    @Test
    void testIdProvider_2to5numberEqualsToCurrentYear(){
        LithuanianOfficialIdProvider idProvider = new LithuanianOfficialIdProvider();
        Person jonas = new Person("Jonas", LocalDate.now(), Gender.MALE);
        String officialId = idProvider.generateOfficialId(jonas);
        assertEquals("1902", officialId.substring(1, 5));
    }
}

