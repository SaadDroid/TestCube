public void loadPlugins() {
        Collection<TimoCloudPluginDescription> pluginDescriptions = new HashSet<>();
        for (File file : TimoCloudCore.getInstance().getFileManager().getPluginsDirectory().listFiles()) {
            if (file.isDirectory()) continue;
            if (!file.getName().endsWith(".jar")) continue;
            try {
                TimoCloudPluginDescription plugin = loadPlugin(file);
                pluginDescriptions.add(plugin);
            } catch (Exception e) {
                TimoCloudCore.getInstance().severe("Error while loading plugin '" + file.getName() + "': ");
                TimoCloudCore.getInstance().severe(e);
            }
        }

        loadPlugins(pluginDescriptions);
    }
