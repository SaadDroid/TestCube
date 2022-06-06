public static EventSubject getSubject(Class<?> subjectOwner, String subjectName) {
        if (subjectOwner == null) {
            throw new IllegalArgumentException("Owner class must not be null.");
        }

        if ((subjectName == null) || (subjectName.length() == 0)) {
            throw new IllegalArgumentException("Subject name must not be null or empty.");
        }

        String fullSubjectName = subjectOwner.getName() + "/" + subjectName;
        EventSubject newSubject = _registeredSubjects.get(fullSubjectName);
        if (newSubject == null) {
            newSubject = new EventSubject(fullSubjectName);
            _registeredSubjects.put(newSubject.getSubjectName(), newSubject);
        }

        return newSubject;
    }
