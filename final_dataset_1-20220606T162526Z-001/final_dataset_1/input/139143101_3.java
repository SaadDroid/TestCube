String onHandle(HttpExchange exchange, InputStream inputStream, boolean preparing) throws IOException, SQLException {
        if (inputStream == null) {
            return "Error reading message";
        }

        byte[] signature = new byte[64];
        if (inputStream.read(signature) != signature.length) {
            return "Error reading signature";
        }

        int length = MultiByteInteger.parse(inputStream);
        if (length == -1) {
            return "Error reading length";
        }

        byte[] data = new byte[length];
        if (inputStream.read(data) != data.length) {
            return "Error reading message";
        }

        ByteBuffer buffer = ByteBuffer.wrap(data);

        byte[] publicKey = new byte[32];
        buffer.get(publicKey);
        Curve25519 cipher = Utils.createCipher();
        if (!cipher.verifySignature(publicKey, data, signature)) {
            return "Wrong signature";
        }

        int type = MultiByteInteger.parse(buffer);
        if (type == -1) {
            return "Error reading type";
        }
        if (type < 0 || type > handlers.length || handlers[type] == null) {
            return "Unknown type " + type;
        }


        try (DB db = Factory.inject(DB.class)) {
            byte[] blockHash;
            if (!preparing) {
                blockHash = new byte[32];
                buffer.get(blockHash);
            } else {
                blockHash = getLatestBlockHash(db);
                if (blockHash == null) {
                    return "Internal error fetching block hash";
                }
            }

            int blockId = blockModel.findBlockId(db, blockHash);
            if (blockId == -1) {
                return "Wrong block hash or transaction expired";
            }
            SummeryData summeryData = new SummeryData();
            summeryData.blockHash = blockHash;
            if (preparing) {
                TransactionHandler.FeeData feeData = handlers[type].prepare(type, publicKey, signature, blockId, buffer, db);
                if (feeData.errorMessage != null) {
                    return feeData.errorMessage;
                }

                summeryData.totalFees = feeData.totalFees;
                sendResponse(exchange, summeryData, 200);
            } else {
                String errorMessage = handlers[type].execute(type, publicKey, signature, blockId, buffer, db);
                if (errorMessage != null) {
                    return errorMessage;
                }
                sendResponse(exchange, summeryData, 200);
            }
            return null;
        }
    }
