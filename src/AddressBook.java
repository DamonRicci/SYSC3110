import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> bud;

    public AddressBook() {
        this.bud = new ArrayList<BuddyInfo>();
    }

    public void addBud(BuddyInfo bud) {
        this.bud.add(bud);
    }

    public BuddyInfo removeBud(int index) {
        if (index >= 0 && index < bud.size()) {
            return bud.remove(index);
        }
        return null;
    }

    public BuddyInfo getBud(int index) {
        if (index >= 0 && index < bud.size()) {
            return bud.get(index);
        }
        return null;
    }

    public void disBud() {
        for(int i = bud.size() - 1; i >= 0; i--) {
            System.out.println(this.getBud(i).getName());
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Av");
        BuddyInfo buddy2 = new BuddyInfo("Alex");

        AddressBook addressBook = new AddressBook();
        addressBook.addBud(buddy1);
        addressBook.addBud(buddy2);

        System.out.println("Address Book");

        System.out.println("Buddies added to address book");

        addressBook.disBud(); //Display all buds :D

        addressBook.removeBud(0);
        System.out.println("Buddy removed from address book");

        addressBook.disBud(); //They're gon :(
    }
}
