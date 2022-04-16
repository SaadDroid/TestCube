public void execute() throws PeerException
    {
        Set<Peer> peers = peerManager.resolve( topology.getAllPeers() );

        //remove already existing peers
        peers.removeAll( environment.getPeers() );
        peers.remove( peerManager.getLocalPeer() );

        if ( peers.isEmpty() )
        {
            return;
        }


        final PGPSecretKeyRing envSecKeyRing = getEnvironmentKeyRing();
        final PGPPublicKeyRing localPeerSignedPEK = getLocalPeerPek();


        // creating PEK on remote peers
        for ( final Peer peer : peers )
        {
            pekUtil.addPeerTask( new PeerUtil.PeerTask<>( peer,
                    new PeerEnvironmentKeyTask( peerManager.getLocalPeer(), envSecKeyRing, localPeerSignedPEK,
                            environment, peer, securityManager.getKeyManager() ) ) );
        }

        PeerUtil.PeerTaskResults<Object> pekResults = pekUtil.executeParallel();

        for ( PeerUtil.PeerTaskResult pekResult : pekResults.getResults() )
        {
            if ( pekResult.hasSucceeded() )
            {
                trackerOperation.addLog(
                        String.format( "PEK generation succeeded on peer %s", pekResult.getPeer().getName() ) );
            }
            else
            {
                trackerOperation.addLog(
                        String.format( "PEK generation failed on peer %s. Reason: %s", pekResult.getPeer().getName(),
                                pekResult.getFailureReason() ) );
            }
        }

        if ( pekResults.hasFailures() )
        {
            throw new PeerException( "Failed to generate PEK across all peers" );
        }
    }
