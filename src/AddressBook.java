//I added this on github's website

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

    public void reverseBud(int index) {
        if (index >= 0 && index < bud.size()) {
            String nameRev = this.getBud(index).getName();
            StringBuilder sb = new StringBuilder(nameRev);
            sb.reverse();
            System.out.println("The last name in the list reversed is "+ sb.toString());
        }
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
        BuddyInfo buddy3 = new BuddyInfo("Katelyn");

        AddressBook addressBook = new AddressBook();
        addressBook.addBud(buddy1);
        addressBook.addBud(buddy2);
        addressBook.addBud(buddy3);

        System.out.println("Address Book");

        System.out.println("Buddies added to address book");

        addressBook.disBud();

        addressBook.removeBud(0);
        System.out.println("Buddy removed from address book");

        addressBook.disBud();

        addressBook.reverseBud(0);
    }
}
