//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact myContact = new Contact();

        myContact.name = "BROU PAUL";
        myContact.phoneNumber = "0574808825";

        Contact myContact2 = new Contact();

        myContact2.name = "COULIBALY LAGAYEL";
        myContact2.phoneNumber = "0101622888";

        Contact myContact3 = new Contact();

        myContact3.name = "SOHOLI BI URIEL";
        myContact3.phoneNumber = "0566167538";

        Contact myContact4 = new Contact();

        myContact4.name = "KOUAME ETIENNE";
        myContact4.phoneNumber = "0779527975";

        myContactsManager.searchContact(myContact.name);
        myContactsManager.searchContact(myContact.phoneNumber);

        System.out.println(myContact.phoneNumber);
        }
    }
