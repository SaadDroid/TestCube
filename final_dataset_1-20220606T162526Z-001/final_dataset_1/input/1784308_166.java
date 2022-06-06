@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!hasViolations()) {
            sb.append("No violations found.");
        } else {
            sb.append("Found violations:");
            int num = 1;
            for (Violation violation : violations) {
                sb.append("\n").append(num++).append(") ").append(violation);
            }
        }
        return sb.toString();
    }
