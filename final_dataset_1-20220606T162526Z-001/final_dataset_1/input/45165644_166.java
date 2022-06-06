@Override
    public void registerNew(Student student) {
        LOGGER.info("Registering {} for insert in context.", student.getName());
        register(student, IUnitOfWork.INSERT);
    }
