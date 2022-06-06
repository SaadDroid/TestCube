public String addContact(Contact contact) {
        // Nombre obligatorio teniendo en cuenta espacios antes y despues.
        if(contact.getFirstName() == null || contact.getFirstName().trim().length() < 1) {
           throw new InvalidContactException();
        }

        // Para comprobar duplicados de contactos por nombre, decidimos que
        // quitamos directamente los espacios para siguientes operaciones.
        contact.setFirstName(contact.getFirstName().trim());

        // Busca si ya existe un contacto con el mismo nombre
        String firstName = contact.getFirstName();
        for(Contact existingContact: addressBookMap.values()) {
            String existingFirstName = existingContact.getFirstName();
            if(firstName.equalsIgnoreCase(existingFirstName)) {
               throw new InvalidContactException();
            }
        }

        String id = idGenerator.newId();

        contact.setId(id);
        addressBookMap.put(id, contact);
        return id;
    }
