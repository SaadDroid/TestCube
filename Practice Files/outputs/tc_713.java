@Test( expected = PeerException.class )
    public void testExecute() throws Exception
    {
        doReturn( true ).when( peerTaskResult ).hasSucceeded();

        step.execute();

        verify( PEER_UTIL ).executeParallel();

        doReturn( false ).when( peerTaskResult ).hasSucceeded();
        doReturn( true ).when( peerTaskResults ).hasFailures();

        step.execute();
    }

    https://github.com/subutai-io/peer-os/blob/master/management/server/core/environment-manager/environment-manager-impl/src/test/java/io/subutai/core/environment/impl/workflow/modification/steps/PEKGenerationStepTest.java
    https://github.com/subutai-io/peer-os/management/server/core/environment-manager/environment-manager-impl/src/test/java/io/subutai/core/environment/impl/workflow/modification/steps/PEKGenerationStepTest.java