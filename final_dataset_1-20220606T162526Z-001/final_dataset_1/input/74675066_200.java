public static Completable validateDomainVhosts(Domain domain, Set<Domain> domains) {

        List<VirtualHost> otherVhosts = domains.stream()
                .filter(d -> !d.getId().equals(domain.getId()))
                .filter(Domain::isVhostMode)
                .flatMap(d -> d.getVhosts().stream())
                .collect(Collectors.toList());

        List<String> otherPaths = domains.stream()
                .filter(d -> !d.getId().equals(domain.getId()))
                .filter(d -> !d.isVhostMode())
                .map(Domain::getPath)
                .collect(Collectors.toList());

        List<String> paths;

        if (domain.isVhostMode()) {
            // Get paths of all other domains on the same host.
            paths = domain.getVhosts().stream()
                    .flatMap(virtualHost -> otherVhosts.stream()
                            .filter(otherVhost -> virtualHost.getHost().equals(otherVhost.getHost())))
                    .map(VirtualHost::getPath).collect(Collectors.toList());

            for (VirtualHost vhost : domain.getVhosts()) {

                List<String> pathsToCheck = paths;

                if(!vhost.getPath().equals("/")) {
                    // Check against other path of domains in context path mode when trying to use '/'.
                    pathsToCheck = new ArrayList<>(paths);
                    pathsToCheck.addAll(otherPaths);
                }

                // Check is the domain context path overlap a path of another domain.
                for (String otherPath : pathsToCheck) {
                    if (overlap(vhost.getPath(), otherPath)) {
                        return Completable.error(new InvalidVirtualHostException("Path [" + vhost.getPath() + "] overlap path defined in another security domain"));
                    }

                    if (overlap(otherPath, vhost.getPath())) {
                        return Completable.error(new InvalidVirtualHostException("Path [" + vhost.getPath() + "] is overlapped by another security domain"));
                    }
                }
            }
        } else {
            // Domain listen on every hosts. Need to check if path overlap (or is overlapped) with all other domain path (including vhost path).
            paths = new ArrayList<>(otherPaths);
            paths.addAll(otherVhosts.stream().map(VirtualHost::getPath).filter(path -> !"/".equals(path)).collect(Collectors.toList()));

            // Check is the domain context path overlap a path of another domain.
            for (String otherPath : paths) {
                if (overlap(domain.getPath(), otherPath)) {
                    return Completable.error(new InvalidVirtualHostException("Path [" + domain.getPath() + "] overlap path defined in another security domain"));
                }

                if (overlap(otherPath, domain.getPath())) {
                    return Completable.error(new InvalidVirtualHostException("Path [" + domain.getPath() + "] is overlapped by another security domain"));
                }
            }
        }

        return Completable.complete();
    }
