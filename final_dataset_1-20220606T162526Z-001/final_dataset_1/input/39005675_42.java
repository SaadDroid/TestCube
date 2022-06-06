public Engine(EngineConfig config) {
        entityManager = new EntityManager(this, config);
        componentManager = new ComponentManager(this, config);
        familyManager = new FamilyManager(this, config);
        wireManager = new WireManager(this, config);
        state = new EngineStateBase(this, entityManager.entities, new Bag<ComponentStateBase<?>>(), 0) {
            @Override
            public void copyFrom(EngineState other, CopyHandler handler) {
                if (engine.update) {
                    throw new IllegalStateException("Cannot use engine.getState()"
                            + ".copyFrom(...) inside of engine.update()");
                }

                super.copyFrom(other, handler);

                entityManager.remove.clear();
                entityManager.removeQueue.clear();

                dirty = true;
                flush();
            }
        };

        List<EntitySystemRegistration> systemRegistrations = new ArrayList<>(config.systems);

        Collections.sort(systemRegistrations, new Comparator<EntitySystemRegistration>() {
            @Override
            public int compare(EntitySystemRegistration o1, EntitySystemRegistration o2) {
                return o1.priority.ordinal() - o2.priority.ordinal();
            }
        });

        EntitySystem[] systems = new EntitySystem[systemRegistrations.size()];
        Map<Class<? extends EntitySystem>, EntitySystem> systemsByType = new HashMap<>();

        for (int i = 0, n = systemRegistrations.size(); i < n; i++) {
            systems[i] = systemRegistrations.get(i).system;
            systemsByType.put(systems[i].getClass(), systems[i]);
        }

        this.systems = systems;
        this.systemsByType = Collections.unmodifiableMap(systemsByType);

        for (EntitySystem system : systems)
            wire(system);

        for (EntitySystem system : systems)
            system.setup();

        for (EntitySystem system : systems)
            system.initialize();

        flush();
    }
