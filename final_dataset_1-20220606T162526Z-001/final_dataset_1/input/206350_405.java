@Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }

        Invocation otherInvocation = (Invocation) obj;
        if (!method.equals(otherInvocation.getMethod())) {
            return false;
        }

        Object otherTarget = otherInvocation.getTarget();
        Object target = this.getTarget();

        if (target == otherTarget) {
            return true;
        }

        if (target == null) {
            return false;
        }

        return target.equals(otherTarget);
    }
