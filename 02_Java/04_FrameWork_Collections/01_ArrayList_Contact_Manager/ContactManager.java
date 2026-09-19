import java.util.List;

public class ContactManager{

    private final ContactRepository respository;
    private int nextId = 1;

    public ContactManager(ContactRepository repository){
        this.respository = respository;
    }

    public Contact addContact(String name, String phone, String email)
    {
        Contact contact = new Contact(nextId++, name, phone, email);

        this.add(contact);
        return contact;
    }

    public List<Contact> getAllContacts(){
        return repository.getAll();
    }

    public List<Contact>searchByName(String name){
        return respository.findByName(name);
    }

    public boolean updateContact(int id, String name, String phone, String email)
    {
        Contact contact = respository.findById(id);
        if(contact==null) return false;

        contanct.setName(name);
        contact.setPhone(phone);
        contact.setEmail(email);

        return true;
    }


    public boolean deleteContact(int id){
        return repository.delete(id);
    }

}