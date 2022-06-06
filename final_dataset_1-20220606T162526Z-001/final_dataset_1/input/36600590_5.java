public int receive() throws IOException {
        int bytes = channel.read(rxBuffer);

        if (bytes <= 0)
            return bytes;

        rxBuffer.flip();

        while (parse());

        rxBuffer.compact();

        if (rxBuffer.position() == rxBuffer.capacity())
            throw new ITCHException("Packet length exceeds buffer capacity");

        receivedData();

        return bytes;
    }
