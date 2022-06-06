@Override
    public List<InetSocketAddress> findSeedNodes(String cluster) throws HekateException {
        if (log.isDebugEnabled()) {
            log.debug("Searching for seed node addresses [namespace={}, container-port-name={}]", config.getNamespace(), containerPortName);
        }

        try (KubernetesClient client = new DefaultKubernetesClient(config)) {
            List<InetSocketAddress> seedNodes = new ArrayList<>();

            PodList pods = client.pods().list();

            // Search through Pods -> Containers -> Ports.
            nullSafe(pods.getItems())
                .filter(pod -> pod.getSpec() != null && pod.getStatus() != null && pod.getStatus().getPodIP() != null)
                .filter(pod -> ACTIVE_POD_PHASES.contains(pod.getStatus().getPhase()))
                .forEach(pod -> {
                    String ip = pod.getStatus().getPodIP();

                    nullSafe(pod.getSpec().getContainers())
                        .flatMap(container -> nullSafe(container.getPorts()))
                        .filter(port -> containerPortName.equals(port.getName()) && port.getContainerPort() != null)
                        .map(ContainerPort::getContainerPort)
                        .forEach(port ->
                            seedNodes.add(new InetSocketAddress(ip, port))
                        );
                });

            return seedNodes;
        } catch (KubernetesClientException e) {
            throw new HekateException("Kubernetes seed node discovery failure ["
                + "namespace=" + config.getNamespace() + ", "
                + "container-port-name=" + containerPortName
                + "]", e);
        }
    }
