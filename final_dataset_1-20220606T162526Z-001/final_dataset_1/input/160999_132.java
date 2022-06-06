public void dump(Scanner scanner) throws Exception {
        crcFixed = 0;

        FileHeader fhdr = new FileHeader();
        fhdr.deserialize(logStream, "fileheader");
        if (fhdr.getMagic() != TXNLOG_MAGIC) {
            throw new TxnLogToolkitException(
                ExitCode.INVALID_INVOCATION.getValue(),
                "Invalid magic number for %s",
                txnLogFile.getName());
        }
        System.out.println("ZooKeeper Transactional Log File with dbid " + fhdr.getDbid()
                           + " txnlog format version " + fhdr.getVersion());

        if (recoveryMode) {
            fhdr.serialize(recoveryOa, "fileheader");
            recoveryFos.flush();
            filePadding.setCurrentSize(recoveryFos.getChannel().position());
        }

        int count = 0;
        while (true) {
            long crcValue;
            byte[] bytes;
            try {
                crcValue = logStream.readLong("crcvalue");
                bytes = logStream.readBuffer("txnEntry");
            } catch (EOFException e) {
                System.out.println("EOF reached after " + count + " txns.");
                return;
            }
            if (bytes.length == 0) {
                // Since we preallocate, we define EOF to be an
                // empty transaction
                System.out.println("EOF reached after " + count + " txns.");
                return;
            }
            Checksum crc = new Adler32();
            crc.update(bytes, 0, bytes.length);
            if (crcValue != crc.getValue()) {
                if (recoveryMode) {
                    if (!force) {
                        printTxn(bytes, "CRC ERROR");
                        if (askForFix(scanner)) {
                            crcValue = crc.getValue();
                            ++crcFixed;
                        }
                    } else {
                        crcValue = crc.getValue();
                        printTxn(bytes, "CRC FIXED");
                        ++crcFixed;
                    }
                } else {
                    printTxn(bytes, "CRC ERROR");
                }
            }
            if (!recoveryMode || verbose) {
                printTxn(bytes);
            }
            if (logStream.readByte("EOR") != 'B') {
                throw new TxnLogToolkitException(ExitCode.UNEXPECTED_ERROR.getValue(), "Last transaction was partial.");
            }
            if (recoveryMode) {
                filePadding.padFile(recoveryFos.getChannel());
                recoveryOa.writeLong(crcValue, "crcvalue");
                recoveryOa.writeBuffer(bytes, "txnEntry");
                recoveryOa.writeByte((byte) 'B', "EOR");
            }
            count++;
        }
    }
