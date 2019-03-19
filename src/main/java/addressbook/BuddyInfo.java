package addressbook;

import javax.persistence.*;

@Entity
public class BuddyInfo {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;

    private String name, address;

    public int getAddressBookRef() {
        return addressBookRef;
    }

    public void setAddressBookRef(int addressBookRef) {
        this.addressBookRef = addressBookRef;
    }

    private int addressBookRef = 1;

    @ManyToOne
    private AddressBook addressBook;



    public AddressBook getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    protected BuddyInfo() {
        this(null,null);
    }

    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "addressbook.BuddyInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
