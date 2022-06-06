@Override
    public String addContact(Contact contact) {
        if(contact.getFirstName() == null || contact.getFirstName().trim().length() < 1) {
           throw new InvalidContactException();
        }       
             
        contact.setFirstName(contact.getFirstName().trim());
        if(contact.getSurname() != null) {
           contact.setSurname(contact.getSurname().trim());
        }
           
        if(checkDuplicate(contact)) {
           throw new InvalidContactException();
        }

        String id = idGenerator.newId();

        contact.setId(id);
        addressBookMap.put(id, contact);
        return id;
    }
