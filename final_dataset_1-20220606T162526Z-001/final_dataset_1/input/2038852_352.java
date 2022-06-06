public List<VariableBinding> getBulkOidBindingList(String oid) throws StingraySnmpSetupException, StingraySnmpGeneralException {
        vlog.printf("in call getBulkOidBindingList(%s) for %s", oid, getConnectionName());
        List<VariableBinding> bindings = new ArrayList<VariableBinding>();
        String startOID = oid;
        String currOID = startOID;
        int totalItems = 0;
        int matchedItems = 0;
        double currMaxReps = maxRepetitions;
        boolean finished = false;
        while (!finished) {
            vlog.printf("total items = %d matched items= %d from  CONTINUING", totalItems, matchedItems, getConnectionName(oid));
            PDU req = new PDU();
            req.add(new VariableBinding(new OID(currOID)));
            req.setType(PDU.GETBULK);
            req.setNonRepeaters(nonRepeaters);
            req.setMaxRepetitions((int) currMaxReps);
            req.setRequestID(new Integer32(incRequestId()));
            UdpAddress udpAddr;
            try {
                udpAddr = new UdpAddress(address + "/" + port);
            } catch (Exception ex) {
                String msg = String.format("Invalid udpAddress specification %s/%s", address, port);
                LOG.error(msg, ex);
                throw new StingraySnmpSetupException(msg, ex);
            }
            CommunityTarget target = new CommunityTarget();
            target.setCommunity(new OctetString(community));
            target.setVersion(version);
            target.setTimeout(timeout);
            target.setAddress(udpAddr);
            TransportMapping transport;
            try {
                transport = new DefaultUdpTransportMapping();
            } catch (IOException ex) {
                String msg = String.format("Error setting up snmp connection to %s", getConnectionName());
                LOG.error(msg, ex);
                throw new StingraySnmpSetupException(msg, ex);
            }
            Snmp snmp = new Snmp(transport);
            try {
                transport.listen();
            } catch (IOException ex) {
                String msg = String.format("Error listening on local udp port for snmp connection %s/%s", address, port);
                LOG.error(msg, ex);
                closeConnection(snmp, transport);
                throw new StingraySnmpSetupException(msg, ex);
            }
            VariableBinding vb = null;
            ResponseEvent respEvent = null;
            try {
                respEvent = snmp.getBulk(req, target);
            } catch (IOException ex) {
                String msg = String.format("Error getting bulk request from snmp server %s", getConnectionName(oid));
                LOG.error(msg, ex);
                closeConnection(snmp, transport);
                throw new StingraySnmpGeneralException(msg, ex);
            }
            PDU respPdu = respEvent.getResponse();
            if (respPdu == null) {
                String msg = String.format("Error fetching bulk response reducing maxRepetitions from %d to %d for %s", (int) currMaxReps, (int) (currMaxReps * 0.75), getConnectionName(oid));
                currMaxReps *= 0.75;
                LOG.warn(msg);
                if (currMaxReps <= 1.0) {
                    String exMsg = String.format("Error maxRepetitions was shrunk to 1 to snmp server %s", getConnectionName(oid));
                    LOG.error(exMsg);
                    closeConnection(snmp, transport);
                    throw new StingraySnmpRetryExceededException(exMsg);
                }
                closeConnection(snmp, transport);
                continue;
            }
            int respSize = respPdu.size();
            for (int i = 0; i < respSize; i++) {
                totalItems++;
                vb = respPdu.get(i);
                String vbOid = vb.getOid().toString();
                if (!vbOid.startsWith(oid + ".")) {
                    finished = true;
                    continue;
                }
                matchedItems++;
                bindings.add(vb);
                currOID = vbOid;
            }
            closeConnection(snmp, transport);
            if (respSize < currMaxReps) {
                break; // This was the last set of entries.
            }
        }
        vlog.printf("total items = %d matched items= %d for %s FINISHED", totalItems, matchedItems, getConnectionName(oid));
        return bindings;
    }
