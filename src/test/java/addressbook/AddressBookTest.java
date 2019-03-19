package addressbook;

import addressbook.AddressBook;
import addressbook.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

public class AddressBookTest {
    private AddressBook addressbook;

    @Test
    public void constructorTest() {
        addressbook = new AddressBook();
        assert (addressbook.getBuddy_list().isEmpty());
    }

    @Test
    public void addBuddyTest(){
        addressbook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Adnan","601-love place");
        addressbook.addbudylist(buddy);
        assert (addressbook.getBuddy_list().contains(buddy));
    }

    @Test
    public void toStringTest(){
        addressbook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Adnan","601-love place");
        addressbook.addbudylist(buddy);
        assert (addressbook.toString().equals("addressbook.addressbook{budy_list=" + addressbook.getBuddy_list() + '}' ));
    }

}