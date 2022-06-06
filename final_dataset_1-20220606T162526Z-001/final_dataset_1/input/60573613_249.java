public void removeServerStatus() {
        jobNodeStorage.removeJobNodeIfExisted(ServerNode.getStatusNode(localHostService.getIp()));
    }
