public WxMpXmlOutMessage route(final WxMpXmlMessage wxMessage) {
    if (isDuplicateMessage(wxMessage)) {
      // 如果是重复消息，那么就不做处理
      return null;
    }

    final List<WxMpMessageRouterRule> matchRules = new ArrayList<WxMpMessageRouterRule>();
    // 收集匹配的规则
    for (final WxMpMessageRouterRule rule : this.rules) {
      if (rule.test(wxMessage)) {
        matchRules.add(rule);
        if(!rule.isReEnter()) {
          break;
        }
      }
    }

    if (matchRules.size() == 0) {
      return null;
    }

    WxMpXmlOutMessage res = null;
    final List<Future<?>> futures = new ArrayList<Future<?>>();
    for (final WxMpMessageRouterRule rule : matchRules) {
      // 返回最后一个非异步的rule的执行结果
      if(rule.isAsync()) {
        futures.add(
            this.executorService.submit(new Runnable() {
              @Override
              public void run() {
                rule.service(wxMessage, WxMpMessageRouter.this.wxMpService, WxMpMessageRouter.this.sessionManager, WxMpMessageRouter.this.exceptionHandler);
              }
            })
        );
      } else {
        res = rule.service(wxMessage, this.wxMpService, this.sessionManager, this.exceptionHandler);
        // 在同步操作结束，session访问结束
        this.log.debug("End session access: async=false, sessionId={}", wxMessage.getFromUser());
        sessionEndAccess(wxMessage);
      }
    }

    if (futures.size() > 0) {
      this.executorService.submit(new Runnable() {
        @Override
        public void run() {
          for (Future<?> future : futures) {
            try {
              future.get();
              WxMpMessageRouter.this.log.debug("End session access: async=true, sessionId={}", wxMessage.getFromUser());
              // 异步操作结束，session访问结束
              sessionEndAccess(wxMessage);
            } catch (InterruptedException e) {
              WxMpMessageRouter.this.log.error("Error happened when wait task finish", e);
            } catch (ExecutionException e) {
              WxMpMessageRouter.this.log.error("Error happened when wait task finish", e);
            }
          }
        }
      });
    }
    return res;
  }
