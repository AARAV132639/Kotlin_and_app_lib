import java.util.ArrayList;
import java.util.List;

public class ContactRepository{

    private final List<Contact>contacts= new ArrayList<>();

    public void add(Contact contact){
        contacts.add(contact);
    }

    public List<Contact>getAll(){
        return contacts;
    }

    public Contact findById(int id){

        for(Contact contact: contacts)
        {
            if(contact.getId()==id){
                return contact;
            }
        }
        return null;
    }

    public List<Contanct>findBybName(String name){
        List<Contact> result = new ArrayList<>();

        for(Contact contact: contacts){
            if(contact.getName().equalsIgnoreCase(name)) result.add(contact);
        }
        return result;
    }

    public boolean delete(int id){
        Contact contact = findById(id);
        if(contact!=null){
            contacts.remove(contact);
            return true;
        }

        return false;
    }
}