protected Namer getOneToManyNamerFromConf(OneToManyConfig o2m, Namer fromEntityNamer) {
        if (o2m != null) {

            if (o2m.hasElementVar() && !o2m.hasVar()) {
                // the plural is calculated
                return new AccessorNamer(fromEntityNamer, o2m.getElementVar());
            }

            if (o2m.hasElementVar() && o2m.hasVar()) {
                return new AccessorNamer(fromEntityNamer, o2m.getElementVar(), o2m.getVar());
            }

            if (!o2m.hasElementVar() && o2m.hasVar()) {
                return new AccessorNamer(fromEntityNamer, fromEntityNamer.getVar(), o2m.getVar());
            }
        }

        return null;
    }
