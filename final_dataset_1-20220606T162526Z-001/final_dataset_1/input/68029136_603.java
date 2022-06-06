public static void copyForeignable(Foreignable target, Foreignable origin, CopyUnit copyUnit) {
        if (copyUnit.getMode() == CopyResourceDomainService.CopyMode.COPY) {
            // set owner when target is new created
            if (((Identifiable)target).getId() == null || target.getOwner().isSameOwner(copyUnit.getActingOwner())) {
                target.setOwner(copyUnit.getActingOwner());
                // clear key and link, they are no longer valid for copied entity
                target.setExternalKey(null);
                target.setExternalLink(null);
            }
        }
        else if (copyUnit.getMode() == CopyResourceDomainService.CopyMode.RELEASE) {
            // TODO verify owner when implementing releasing
            if(target instanceof ResourceEntity){
                // only resource changes owner when released
                target.setOwner(copyUnit.getActingOwner());
            }else{
                target.setOwner(origin.getOwner());
            }
            target.setExternalLink(origin.getExternalLink());
            target.setExternalKey(origin.getExternalKey());
        }
    }
