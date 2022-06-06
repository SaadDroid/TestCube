@Override
    public Contact getContact(String contactId) {
        Contact result = addressBookDao.getContact(contactId);
        if (result == null) {
            throw new InvalidIdException();
        } 
        return result;
    }
