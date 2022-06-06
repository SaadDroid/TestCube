@Override
    public Connection connect(String deviceAddress, String settingsString)
            throws ArgumentSyntaxException, ConnectionException {

        String[] deviceAddressTokens = deviceAddress.trim().split(":");
        String serialPortName = "";

        boolean isTCP = false;
        String host = "";
        int port = 0;
        int offset;

        if (deviceAddressTokens[0].equalsIgnoreCase(TCP)) {
            host = deviceAddressTokens[1];
            try {
                port = Integer.parseInt(deviceAddressTokens[2]);
            } catch (NumberFormatException e) {
                throw new ArgumentSyntaxException("Could not parse port.");
            }
            isTCP = true;
            offset = 2;
        }
        else {
            if (deviceAddressTokens.length != 2) {
                throw new ArgumentSyntaxException("The device address does not consist of two parameters.");
            }
            offset = 0;
            serialPortName = deviceAddressTokens[0 + offset];
        }

        Integer mBusAddress;
        SecondaryAddress secondaryAddress = null;
        try {
            if (deviceAddressTokens[1 + offset].length() == 16) {
                mBusAddress = 0xfd;
                byte[] saData = Helper.hexToBytes(deviceAddressTokens[1 + offset]);
                secondaryAddress = SecondaryAddress.newFromLongHeader(saData, 0);
            }
            else {
                mBusAddress = Integer.decode(deviceAddressTokens[1 + offset]);
            }
        } catch (Exception e) {
            throw new ArgumentSyntaxException("Settings: mBusAddress (" + deviceAddressTokens[1 + offset]
                    + ") is not a number between 0 and 255 nor a 16 sign long hexadecimal secondary address");
        }

        ConnectionInterface connectionInterface;
        Settings settings = new Settings(settingsString, false);

        synchronized (this) {

            synchronized (interfaces) {
                if (isTCP) {
                    connectionInterface = interfaces.get(host + port);
                }
                else {
                    connectionInterface = interfaces.get(serialPortName);
                }

                if (connectionInterface == null) {
                    MBusConnection connection;
                    try {
                        if (isTCP) {
                            connection = MBusConnection.newTcpBuilder(host, port)
                                    .setConnectionTimeout(settings.connectionTimeout)
                                    .setTimeout(settings.timeout)
                                    .build();
                        }
                        else {
                            connection = MBusConnection.newSerialBuilder(serialPortName)
                                    .setBaudrate(settings.baudRate)
                                    .setTimeout(settings.timeout)
                                    .build();

                        }
                    } catch (IOException e) {
                        throw new ConnectionException(
                                "Unable to bind local interface: " + deviceAddressTokens[0 + offset], e);
                    }

                    if (logger.isTraceEnabled()) {
                        connection.setVerboseMessageListener(new VerboseMessageListenerImpl());
                    }

                    if (isTCP) {
                        connectionInterface = new ConnectionInterface(connection, host, port, interfaces);
                    }
                    else {
                        connectionInterface = new ConnectionInterface(connection, serialPortName, interfaces);
                    }
                }
            }

            synchronized (connectionInterface) {

                try {
                    MBusConnection mBusConnection = connectionInterface.getMBusConnection();

                    if (secondaryAddress != null || settings.resetLink) {
                        try {
                            mBusConnection.linkReset(mBusAddress);
                            sleep(100); // for slow slaves
                        } catch (SerialPortTimeoutException e) {
                            if (secondaryAddress == null) {
                                serialPortTimeoutExceptionHandler(connectionInterface, e);
                            }
                        }
                    }

                    if (secondaryAddress != null && settings.resetApplication) {
                        mBusConnection.resetReadout(mBusAddress);
                        sleep(100);
                    }

                    if (secondaryAddress != null) {
                        mBusConnection.selectComponent(secondaryAddress);
                        sleep(100);
                    }
                    mBusConnection.read(mBusAddress);

                } catch (SerialPortTimeoutException e) {
                    serialPortTimeoutExceptionHandler(connectionInterface, e);
                } catch (IOException e) {
                    connectionInterface.close();
                    throw new ConnectionException(e);
                }

                connectionInterface.increaseConnectionCounter();
            }
        }
        DriverConnection driverCon = new DriverConnection(connectionInterface, mBusAddress, secondaryAddress);
        driverCon.setResetLink(settings.resetLink);
        driverCon.setResetApplication(settings.resetApplication);

        return driverCon;
    }
