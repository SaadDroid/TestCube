protected LiveData<User> getOrganizer() {
        compositeDisposable.add(userRepository
            .getOrganizer(false)
            .subscribe(organizer::setValue, Logger::logError));
        return organizer;
    }
