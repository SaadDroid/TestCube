@Override
    public void transaction(ConfigSource configSource, Control control) {
        PluginTask task = configSource.loadConfig(PluginTask.class);
        control.run(task.dump(), newSchema(task));
    }
