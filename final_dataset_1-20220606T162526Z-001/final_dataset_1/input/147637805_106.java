public static ControlFlowDistance getDistance( ExecutionResult result, Branch branch, boolean value, String className, String methodName) {
        if (result != null && className != null && methodName != null) {
            if (branch == null && !value) {
                throw new IllegalArgumentException("expect distance for a root branch to always have value set to true");
            } else if (branch != null && (!branch.getMethodName().equals(methodName) || !branch.getClassName().equals(className))) {
                throw new IllegalArgumentException("expect explicitly given information about a branch to coincide with the information given by that branch");
            } else if (TestCoverageGoal.hasTimeout(result)) {
                return getTimeoutDistance(result, branch);
            } else if (branch == null) {
                return getRootDistance(result, className, methodName);
            } else {
                if (value) {
                    if (result.getTrace().getCoveredTrueBranches().contains(branch.getActualBranchId())) {
                        return new ControlFlowDistance(0, 0.0D);
                    }
                } else if (result.getTrace().getCoveredFalseBranches().contains(branch.getActualBranchId())) {
                    return new ControlFlowDistance(0, 0.0D);
                }

                ControlFlowDistance nonRootDistance = getNonRootDistance(result, branch, value);
                return nonRootDistance;
            }
        } else {
            throw new IllegalArgumentException("null given");
        }
    }
