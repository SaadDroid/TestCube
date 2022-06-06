@Override
    public Contact getContact(String contactId) {
        Contact result = addressBookMap.get(contactId);
        if(result == null) {
           throw new InvalidIdException();
        }
        return result;
    }
