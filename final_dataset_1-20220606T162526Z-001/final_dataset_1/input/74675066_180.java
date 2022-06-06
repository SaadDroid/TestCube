public static Completable validate(Domain domain) {

        List<Completable> chain = new ArrayList<>();

        if (domain.getName().contains("/")) {
            return Completable.error(new InvalidDomainException("Domain name cannot contain '/' character"));
        }

        if (domain.isVhostMode()) {
            if (domain.getVhosts() == null || domain.getVhosts().isEmpty()) {
                return Completable.error(new InvalidDomainException("VHost mode requires at least one VHost"));
            }

            // Check at there is only one vhost flagged with override entrypoint.
            long count = domain.getVhosts().stream().filter(VirtualHost::isOverrideEntrypoint).count();
            if(count > 1) {
                return Completable.error(new InvalidDomainException("Only one vhost can be used to override entrypoint"));
            } else if(count == 0) {
                return Completable.error(new InvalidDomainException("You must select one vhost to override entrypoint"));
            }

            chain.addAll(domain.getVhosts().stream().map(VirtualHostValidator::validate).collect(Collectors.toList()));
        } else {
            if("/".equals(domain.getPath())) {
                return Completable.error(new InvalidDomainException("'/' path is not allowed in context-path mode"));
            }

            chain.add(PathValidator.validate(domain.getPath()));
        }

        return Completable.merge(chain);
    }
