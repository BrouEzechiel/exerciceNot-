//TIP Pour <b>exécuter</b> le code, appuyez sur <shortcut actionId="Run"/> ou
// cliquez sur l'icône <icon src="AllIcons.Actions.Execute"/> dans la gouttière.

// Classe principale qui contient la méthode main (point d'entrée du programme)
public class Main {
    public static void main(String[] args) {
        // Crée une instance du gestionnaire de contacts
        ContactsManager myContactsManager = new ContactsManager();

        // Crée un premier contact
        Contact myContact = new Contact();
        // Définit le nom et le numéro de téléphone du contact
        myContact.name = "BROU PAUL";
        myContact.phoneNumber = "0574808825";
        // Ajoute myContact au tableau
        myContactsManager.addContact(myContact);

        // Crée un deuxième contact
        Contact myContact2 = new Contact();
        // Définit le nom et le numéro de téléphone du contact
        myContact2.name = "COULIBALY LAGAYEL";
        myContact2.phoneNumber = "0101622888";
        // Ajoute myContact2 au tableau
        myContactsManager.addContact(myContact2);

        // Crée un troisième contact
        Contact myContact3 = new Contact();
        // Définit le nom et le numéro de téléphone du contact
        myContact3.name = "SOHOLI BI URIEL";
        myContact3.phoneNumber = "0566167538";
        // Ajoute myContact3 au tableau
        myContactsManager.addContact(myContact3);

        // Crée un quatrième contact
        Contact myContact4 = new Contact();
        // Définit le nom et le numéro de téléphone du contact
        myContact4.name = "KOUAME ETIENNE";
        myContact4.phoneNumber = "0779527975";
        // Ajoute myContact4 au tableau
        myContactsManager.addContact(myContact4);

        // Recherche d'un contact
        String searchname = "BROU PAUL";
        Contact phoneNumber = myContactsManager.searchContact(searchname);

        // Affiche le numéro de téléphone du premier contact
        System.out.println("Numero de "+ searchname +" : "+myContact.phoneNumber);
    }
}