@Override
    public void deleteServiceInstanceBinding(DeleteServiceInstanceBindingRequest request) {
        ServiceBinding binding = getBinding(request.getBindingId());
        if (binding == null || binding.isDeleted()) {
            throw new ServiceInstanceBindingDoesNotExistException(request.getBindingId());
        }

        String serviceInstanceId = request.getServiceInstanceId();
        ServiceInstance si = instanceService.getServiceInstance(serviceInstanceId);

        try {
            binding.setLastOperation(brokeredService.deleteBinding(si, binding));
            responseSanity(binding.getLastOperation());
        } catch (Throwable t) {
            binding.setLastOperation(new LastOperation(LastOperation.DELETE, LastOperation.FAILED, t.getMessage()));
            serviceBindingRepository.save(binding);
            throw new ServiceBrokerException("error deleting binding", t);
        }

        log.info("deleting binding for service instance: " + request.getBindingId() + " service instance: " + request.getServiceInstanceId());
        binding.setDeleted(true);
        serviceBindingRepository.save(binding);
    }
