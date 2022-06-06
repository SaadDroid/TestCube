protected void start(String[] args) throws Exception {
        ProviderFactory ph = createProviderFactory();
        FileFilter jsFilter = new JSFilter();
        int i = 0;
        boolean fileSeen = false;
        boolean msgPrinted = false;
        for (;;) {
            if (i == args.length) {
                break;
            }
            if (args[i].startsWith("-")) {
                i = checkOption(args, i);
                if (verbose && !msgPrinted) {
                    msgPrinted = true;
                    if (verbose) {
                        System.out.println("entering server");
                    }
                }
            } else {
                File f = new File(args[i]);
                if (f.isFile() && jsFilter.accept(f)) {
                    fileSeen = true;
                    if (verbose) {
                        System.out.println("processing file " + f.getCanonicalPath());
                    }
                    ph.createAndPublish(f, epAddr, bOptSeen);
                } else if (f.isDirectory()) {
                    File[] flist = f.listFiles(jsFilter);
                    for (File file : flist) {
                        fileSeen = true;
                        if (verbose) {
                            System.out.println("processing file " + file.getCanonicalPath());
                        }
                        ph.createAndPublish(file, epAddr, bOptSeen);
                    }
                }
            }
            i++;
        }
        if (!fileSeen) {
            throw new Exception(NO_FILES_ERR);
        }
    }
