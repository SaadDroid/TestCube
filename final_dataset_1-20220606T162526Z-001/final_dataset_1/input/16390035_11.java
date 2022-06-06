@Override
    public String toString() {
        StringBuilder bldr = new StringBuilder();
        bldr.append("t=").append(startTime).append(" ").append(stopTime).append("\r\n");
        if (periodic) {
            bldr.append("r=").append(repeatInterval).append(" ").append(activeDuration).append(" ");
            if (offsets.isEmpty())
                bldr.append("0");
            else {
                for (Long offset : offsets)
                    bldr.append(offset).append(" ");
                bldr.delete(bldr.length() - 1, bldr.length());
            }
            bldr.append("\r\n");
        }
        
        return bldr.toString();
    }
