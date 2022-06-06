@Override
    public void start() {
        try {
            this.starting = true;
            Message message = Message.create()
                    .setType("START_SERVER")
                    .set("name", getName())
                    .set("id", getId())
                    .set("group", getGroup().getName())
                    .set("ram", getGroup().getRam())
                    .set("static", getGroup().isStatic())
                    .setIfNotNull("map", getMap())
                    .set("globalHash", HashUtil.getHashes(TimoCloudCore.getInstance().getFileManager().getServerGlobalDirectory()));
            if (!getGroup().isStatic()) {
                File templateDirectory = new File(TimoCloudCore.getInstance().getFileManager().getServerTemplatesDirectory(), getGroup().getName());
                File mapDirectory = new File(TimoCloudCore.getInstance().getFileManager().getServerTemplatesDirectory(), getGroup().getName() + "_" + getMap());
                try {
                    templateDirectory.mkdirs();
                    if (hasMap()) mapDirectory.mkdirs();
                    message.set("templateHash", HashUtil.getHashes(templateDirectory));
                    if (hasMap()) message.set("mapHash", HashUtil.getHashes(mapDirectory));
                } catch (IOException e) {
                    TimoCloudCore.getInstance().severe("Error while hashing files while starting server " + getName() + ": ");
                    e.printStackTrace();
                    return;
                }
            }
            getBase().sendMessage(message);
            getBase().setReady(false);
            getBase().setAvailableRam(getBase().getAvailableRam() - getGroup().getRam());
            TimoCloudCore.getInstance().info("Told base " + getBase().getName() + " to start server " + getName() + ".");
        } catch (Exception e) {
            TimoCloudCore.getInstance().severe("Error while starting server " + getName() + ": ");
            TimoCloudCore.getInstance().severe(e);
            return;
        }
        getGroup().addStartingServer(this);
        getBase().addServer(this);
    }
