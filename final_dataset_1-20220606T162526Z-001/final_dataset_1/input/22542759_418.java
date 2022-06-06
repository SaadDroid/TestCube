@Override
  public void process(final ApplicationDeployable input) throws Exception {
    List<ProgramDescriptor> programDescriptors = new ArrayList<>();
    final ApplicationSpecification appSpec = input.getSpecification();

    // Now, we iterate through all ProgramSpecification and generate programs
    Iterable<ProgramSpecification> specifications = Iterables.concat(
      appSpec.getMapReduce().values(),
      appSpec.getWorkflows().values(),
      appSpec.getServices().values(),
      appSpec.getSpark().values(),
      appSpec.getWorkers().values()
    );

    for (ProgramSpecification spec: specifications) {
      ProgramType type = ProgramTypes.fromSpecification(spec);
      ProgramId programId = input.getApplicationId().program(type, spec.getName());
      programDescriptors.add(new ProgramDescriptor(programId, appSpec));
    }

    emit(new ApplicationWithPrograms(input, programDescriptors));
  }
