public class ContactsManager {
    Contact[] myContact;
    int contactCount;

    ContactsManager(){
        this.contactCount = 0;
        this.myContact = new Contact[500];
    }

    void addContact(Contact contact){
        myContact[contactCount] = contact;
        contactCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<contactCount; i++){
            if(myContact[i].name.equals(searchName)){
                return myContact[i];
            }
        }
        return null;}
}
