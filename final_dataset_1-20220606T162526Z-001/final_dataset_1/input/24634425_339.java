@Override
    public List<String> getVmTypesAvailableToRemove(String applicationId, String deploymentId) {
        ArrayList<String> answer = new ArrayList<>();
        List<VM> vms = getVMs(applicationId, deploymentId);
        for (VM vm : vms) {
            if (vm.getNumberVMsMin() > 0
                    && getVmCountOfGivenType(vms, vm.getOvfId()) > vm.getNumberVMsMin()
                    && !answer.contains(vm.getOvfId())) {
                answer.add(vm.getOvfId());
            }
        }
        return answer;
    }
