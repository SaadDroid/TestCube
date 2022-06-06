public Integer getItemByRunningItemPath(final String path) {
        if (!isRunningItemPath(path)) {
            return null;
        }
        return Integer.parseInt(path.substring(jobNodePath.getFullPath(ROOT).length() + 1, path.lastIndexOf(RUNNING_APPENDIX) - 1));
    }
