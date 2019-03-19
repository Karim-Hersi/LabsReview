package addressbook;

import addressbook.BuddyInfo;
import org.junit.Test;

public class BuddyInfoTest {
    private BuddyInfo buddyinfo;

    @Test
    public void constructorTest() {
       buddyinfo = new BuddyInfo("Adnan","601-love place");
       assert(buddyinfo.getName().equals("Adnan"));
       assert(buddyinfo.getAddress().equals("601-love place"));
    }

    @Test
    public void toStringTest(){
        buddyinfo = new BuddyInfo("Adnan","601-love place");
        assert(buddyinfo.toString().equals(
                "addressbook.BuddyInfo{id=" + buddyinfo.getId()  +
                        ", name='" + buddyinfo.getName() + '\'' +
                        ", address='" + buddyinfo.getAddress() + '\'' +
                        '}'
        ));
    }


}