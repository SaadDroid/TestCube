protected boolean checkProofOfWork(Sha256Hash hashAuxBlock,
        BigInteger target, boolean throwException) throws VerificationException {
        if (!(params instanceof AuxPoWNetworkParameters)) {
            if (throwException) {
                // Should be impossible
                throw new VerificationException("Network parameters are not an instance of AuxPoWNetworkParameters, AuxPoW support is not available.");
            }
            return false;
        }
        final AuxPoWNetworkParameters altcoinParams = (AuxPoWNetworkParameters) params;
        
        if (0 != this.getCoinbaseBranch().getIndex()) {
            if (throwException) {
                // I don't like the message, but it correlates with what's in the reference client.
                throw new VerificationException("AuxPow is not a generate");
            }
            return false;
        }

        if (!altcoinParams.isTestNet()
            && parentBlockHeader.getChainID() == altcoinParams.getChainID()) {
            if (throwException) {
                throw new VerificationException("Aux POW parent has our chain ID");
            }
            return false;
        }

        if (this.getChainMerkleBranch().size() > 30) {
            if (throwException) {
                throw new VerificationException("Aux POW chain merkle branch too long");
            }
            return false;
        }

        Sha256Hash nRootHash = getChainMerkleBranch().calculateMerkleRoot(hashAuxBlock);
        final byte[] vchRootHash = nRootHash.getBytes();

        // Check that the coinbase transaction is in the merkle tree of the
        // parent block header
        if (!getCoinbaseBranch().calculateMerkleRoot(getCoinbase().getHash()).equals(parentBlockHeader.getMerkleRoot())) {
            if (throwException) {
                throw new VerificationException("Aux POW merkle root incorrect");
            }
            return false;
        }

        if (this.getCoinbase().getInputs().isEmpty()) {
            throw new VerificationException("Coinbase transaction has no inputs");
        }

        // Check that the chain merkle root is in the coinbase
        final byte[] script = this.getCoinbase().getInput(0).getScriptBytes();

        // Check that the same work is not submitted twice to our chain, by
        // confirming that the child block hash is in the coinbase merkle tree
        int pcHead = -1;
        int pc = -1;

        for (int scriptIdx = 0; scriptIdx < script.length; scriptIdx++) {
            if (arrayMatch(script, scriptIdx, MERGED_MINING_HEADER)) {
                // Enforce only one chain merkle root by checking that a single instance of the merged
                // mining header exists just before.
                if (pcHead >= 0) {
                    if (throwException) {
                        throw new VerificationException("Multiple merged mining headers in coinbase");
                    }
                    return false;
                }
                pcHead = scriptIdx;
            } else if (arrayMatch(script, scriptIdx, vchRootHash)) {
                pc = scriptIdx;
            }
        }

        if (pc == -1) {
            if (throwException) {
                throw new VerificationException("Aux POW missing chain merkle root in parent coinbase");
            }
            return false;
        }

        if (pcHead != -1) {
            if (pcHead + MERGED_MINING_HEADER.length != pc) {
                if (throwException) {
                    throw new VerificationException("Merged mining header is not just before chain merkle root");
                }
                return false;
            }
        } else {
            // For backward compatibility.
            // Enforce only one chain merkle root by checking that it starts early in the coinbase.
            // 8-12 bytes are enough to encode extraNonce and nBits.
            if (pc > MAX_INDEX_PC_BACKWARDS_COMPATIBILITY) {
                if (throwException) {
                    throw new VerificationException("Aux POW chain merkle root must start in the first 20 bytes of the parent coinbase");
                }
                return false;
            }
        }

        // Ensure we are at a deterministic point in the merkle leaves by hashing
        // a nonce and our chain ID and comparing to the index.
        pc += vchRootHash.length;
        if ((script.length - pc) < 8) {
            if (throwException) {
                throw new VerificationException("Aux POW missing chain merkle tree size and nonce in parent coinbase");
            }
            return false;
        }

        byte[] sizeBytes = Utils.reverseBytes(Arrays.copyOfRange(script, pc, pc + 4));
        int branchSize = ByteBuffer.wrap(sizeBytes).getInt();
        if (branchSize != (1 << getChainMerkleBranch().size())) {
            if (throwException) {
                throw new VerificationException("Aux POW merkle branch size does not match parent coinbase");
            }
            return false;
        }

        long nonce = getNonceFromScript(script, pc);

        if (getChainMerkleBranch().getIndex() != getExpectedIndex(nonce, ((AuxPoWNetworkParameters) params).getChainID(), getChainMerkleBranch().size())) {
            if (throwException) {
                throw new VerificationException("Aux POW wrong index in chain merkle branch for chain ID "
                    + ((AuxPoWNetworkParameters) params).getChainID() + ". Was "
                    + getChainMerkleBranch().getIndex() + ", expected "
                    + getExpectedIndex(nonce, ((AuxPoWNetworkParameters) params).getChainID(), getChainMerkleBranch().size()));
            }
            return false;
        }

        Sha256Hash hash = altcoinParams.getBlockDifficultyHash(getParentBlockHeader());
        BigInteger hashVal = hash.toBigInteger();
        if (hashVal.compareTo(target) > 0) {
            // Proof of work check failed!
            if (throwException) {
                throw new VerificationException("Hash is higher than target: " + hash.toString() + " vs "
                        + target.toString(16));
            }
            return false;
        }

        return true;
    }
