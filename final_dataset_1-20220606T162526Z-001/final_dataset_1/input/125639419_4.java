public void create () {
        final LineArray lineArray = createLineArray();
        final LineAttributes lineAttributes = createLineAttributes();

        final Appearance appearance = new Appearance();
        appearance.setLineAttributes(lineAttributes);
        this.setGeometry(lineArray);
        this.setAppearance(appearance);
    }
