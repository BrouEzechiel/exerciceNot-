// Classe qui gère un carnet de contacts
public class ContactsManager {
    // Tableau pour stocker les contacts
    Contact[] myContact;
    // Compteur pour suivre le nombre de contacts actuels
    int contactCount;

    // Constructeur de la classe
    ContactsManager(){
        // Initialise le compteur de contacts à 0
        this.contactCount = 0;
        // Crée un tableau pouvant contenir jusqu'à 500 contacts
        this.myContact = new Contact[500];
    }

    // Méthode pour ajouter un nouveau contact
    void addContact(Contact contact){
        // Ajoute le contact à la première position disponible
        myContact[contactCount] = contact;
        // Incrémente le compteur de contacts
        contactCount++;
    }

    // Méthode pour rechercher un contact par son nom
    Contact searchContact(String searchName){
        // Parcourt tous les contacts existants
        for(int i=0; i<contactCount; i++){
            // Compare le nom du contact avec le nom recherché
            if(myContact[i].name.equals(searchName)){
                // Retourne le contact si trouvé
                return myContact[i];
            }
        }
        // Retourne null si le contact n'est pas trouvé
        return null;
    }
}