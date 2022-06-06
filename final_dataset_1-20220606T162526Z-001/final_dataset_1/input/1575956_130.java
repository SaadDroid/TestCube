public static String getMessage(int code) {
        switch (code) {
        case Code.OK:
            return "No problem";
        case Code.ReadException:
            return "Error while reading ledger";
        case Code.QuorumException:
            return "Invalid quorum size on ensemble size";
        case Code.NoBookieAvailableException:
            return "No bookie available";
        case Code.DigestNotInitializedException:
            return "Digest engine not initialized";
        case Code.DigestMatchException:
            return "Entry digest does not match";
        case Code.NotEnoughBookiesException:
            return "Not enough non-faulty bookies available";
        case Code.NoSuchLedgerExistsException:
            return "No such ledger exists on Bookies";
        case Code.NoSuchLedgerExistsOnMetadataServerException:
            return "No such ledger exists on Metadata Server";
        case Code.BookieHandleNotAvailableException:
            return "Bookie handle is not available";
        case Code.ZKException:
            return "Error while using ZooKeeper";
        case Code.MetaStoreException:
            return "Error while using MetaStore";
        case Code.LedgerExistException:
            return "Ledger existed";
        case Code.LedgerRecoveryException:
            return "Error while recovering ledger";
        case Code.LedgerClosedException:
            return "Attempt to write to a closed ledger";
        case Code.WriteException:
            return "Write failed on bookie";
        case Code.NoSuchEntryException:
            return "No such entry";
        case Code.IncorrectParameterException:
            return "Incorrect parameter input";
        case Code.InterruptedException:
            return "Interrupted while waiting for permit";
        case Code.ProtocolVersionException:
            return "Bookie protocol version on server is incompatible with client";
        case Code.MetadataVersionException:
            return "Bad ledger metadata version";
        case Code.DuplicateEntryIdException:
            return "Attempted to add Duplicate entryId";
        case Code.LedgerFencedException:
            return "Ledger has been fenced off. Some other client must have opened it to read";
        case Code.UnauthorizedAccessException:
            return "Attempted to access ledger using the wrong password";
        case Code.UnclosedFragmentException:
            return "Attempting to use an unclosed fragment; This is not safe";
        case Code.WriteOnReadOnlyBookieException:
            return "Attempting to write on ReadOnly bookie";
        case Code.TooManyRequestsException:
            return "Too many requests to the same Bookie";
        case Code.LedgerIdOverflowException:
            return "Next ledgerID is too large.";
        case Code.ReplicationException:
            return "Errors in replication pipeline";
        case Code.ClientClosedException:
            return "BookKeeper client is closed";
        case Code.IllegalOpException:
            return "Invalid operation";
        case Code.AddEntryQuorumTimeoutException:
            return "Add entry quorum wait timed out";
        case Code.TimeoutException:
            return "Bookie operation timeout";
        case Code.SecurityException:
            return "Failed to establish a secure connection";
        case Code.MetadataSerializationException:
            return "Failed to serialize metadata";
        default:
            return "Unexpected condition";
        }
    }
