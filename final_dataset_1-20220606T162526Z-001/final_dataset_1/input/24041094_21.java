@Override
    public void scanForDevices(String settingsString, DriverDeviceScanListener listener)
            throws ArgumentSyntaxException, ScanException, ScanInterruptedException {

        interruptScan = false;

        Settings settings = new Settings(settingsString, true);

        MBusConnection mBusConnection;
        if (!interfaces.containsKey(settings.scanConnectionAddress)) {
            try {
                if (settings.host.isEmpty()) {
                    mBusConnection = MBusConnection.newSerialBuilder(settings.scanConnectionAddress)
                            .setBaudrate(settings.baudRate)
                            .setTimeout(settings.timeout)
                            .build();
                }
                else {
                    mBusConnection = MBusConnection.newTcpBuilder(settings.host, settings.port)
                            .setTimeout(settings.timeout)
                            .setConnectionTimeout(settings.connectionTimeout)
                            .build();
                }
            } catch (IOException e) {
                throw new ScanException(e);
            }
            if (logger.isTraceEnabled()) {
                mBusConnection.setVerboseMessageListener(new VerboseMessageListenerImpl());
            }
        }
        else {
            mBusConnection = interfaces.get(settings.scanConnectionAddress).getMBusConnection();
        }

        try {
            if (settings.scanSecondary) {
                SecondaryAddressListenerImplementation secondaryAddressListenerImplementation = new SecondaryAddressListenerImplementation(
                        listener, settings.scanConnectionAddress);
                mBusConnection.scan("ffffffff", secondaryAddressListenerImplementation);
            }
            else {
                scanPrimaryAddress(listener, settings, mBusConnection);
            }

        } catch (IOException e) {
            logger.error("Failed to scan for devices.", e);
        } finally {
            mBusConnection.close();
        }

    }
