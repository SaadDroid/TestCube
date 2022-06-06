public Result getChannel() throws IOException {
        FileChannel fileChannel = FileChannel.open(path, CREATE, APPEND);
        Writer writer = Channels.newWriter(fileChannel, "UTF-8");
        return new Result(fileChannel, writer);
    }
