public String addContact(Contact contact) {
        // Nombre obligatorio teniendo en cuenta espacios antes y despues.
        if(contact.getFirstName() == null || contact.getFirstName().trim().length() < 1) {
           throw new InvalidContactException();
        }

        // Para comprobar duplicados de contactos por nombre, decidimos que
        // quitamos directamente los espacios para siguientes operaciones.
        contact.setFirstName(contact.getFirstName().trim());

        // Para comprobar duplicados de contactos por nombre, decidimos que
        // quitamos directamente los espacios para siguientes operaciones.
        contact.setFirstName(contact.getFirstName().trim());
        if(checkDuplicate(contact)) {
           throw new InvalidContactException();
        }

        String id = idGenerator.newId();

        contact.setId(id);
        addressBookMap.put(id, contact);
        return id;
    }
