public void sendResult(int taskInstanceId, Command command){
        NettyRemoteChannel nettyRemoteChannel = getRemoteChannel(taskInstanceId);
        nettyRemoteChannel.writeAndFlush(command).addListener(new ChannelFutureListener(){

            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if(future.isSuccess()){
                    remove(taskInstanceId);
                    return;
                }
            }
        });
    }
