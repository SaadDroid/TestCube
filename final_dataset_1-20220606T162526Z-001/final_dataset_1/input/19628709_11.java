public Person generateNewIdentity(Person person) {
        String newName = newIdentityCreator.createNewName(person);
        int newAge = newIdentityCreator.createNewAge(person);
        List<Person> newSiblings = newIdentityCreator.createNewSiblings(person);
        return new Person(newName, newAge, newSiblings);
    }
