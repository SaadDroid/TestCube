@Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        if (!announcements.isEmpty()) {
            buffer.append("an=");
            for (int index = 0; index < announcements.size(); index++) {
                buffer.append(announcements.get(index));
                if (index < announcements.size() - 1) {
                    buffer.append(";");
                }
            }
            if (iterations > 0) {
                buffer.append(" ");
                buffer.append("it=").append(iterations);
            }
        }
        return buffer.toString();
    }
