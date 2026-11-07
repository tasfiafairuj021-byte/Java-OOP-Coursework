public class MobilePhone {
    public int tc;
    public int count;
    public String[] name;
    public int[] number;

    public void setContactCapacity(int tc) {
        this.tc = tc;
        name = new String[tc];
        number = new int[tc];
    }

    public void details() {
        System.out.println("Total Contacts: " + count);
        System.out.println();
        System.out.println("Contact List:");
        System.out.println();

        for (int i = 0; i < count; i++) {
            System.out.println(name[i] + ":" + number[i]);
        }
    }

    public void addContact(String name, int number) {
        if (count < tc) {
            this.name[count] = name;
            this.number[count] = number;
            System.out.println("The contact of " + name + " is added.");
count++;}
else {
            System.out.println("Storage Full!!");
        }
    }

    public void makeCall(int num) {
        for (int i = 0; i < count; i++) {
            if (num == number[i]) {
                System.out.println("Calling " + name[i] + " . . .");
                return;
            }
        }

        System.out.println("Calling " + num + " . . .");
    }
}
