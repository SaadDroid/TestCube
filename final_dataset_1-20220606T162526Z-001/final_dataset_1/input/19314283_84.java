public void refreshFileHandles() {
        registeredInstances.forEach(ActiveRotationRegistry::safelyCallPostRotate);
    }
