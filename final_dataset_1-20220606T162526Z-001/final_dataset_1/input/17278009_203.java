public Plugin toPlugin(PluginDescriptor pluginDescriptor, URL pluginURL) {
        try {
            Plugin plugin = new Plugin();
            plugin.setName(pluginDescriptor.getName());

            if (pluginDescriptor.getDisplayName() == null) {
                plugin.setDisplayName(pluginDescriptor.getName());
            }
            else {
                plugin.setDisplayName(pluginDescriptor.getDisplayName());
            }

            plugin.setAmpsVersion(getAmpsVersion(pluginDescriptor));
            plugin.setDescription(pluginDescriptor.getDescription());
            plugin.setPath(pluginURL.getPath());
            plugin.setMtime(pluginURL.openConnection().getLastModified());
            plugin.setHelp(getHelp(pluginDescriptor));
            plugin.setMd5(getMd5(pluginURL));
            plugin.setVersion(getVersion(pluginDescriptor, pluginURL));

            return plugin;
        }
        catch (IOException e) {
            throw new PluginTransformException("Failed to create plugin.", e);
        }
    }
