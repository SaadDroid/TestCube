public void into(@NonNull Target target) {
    long started = System.nanoTime();
    checkMain();

    if (target == null) {
      throw new IllegalArgumentException("Target must not be null.");
    }
    if (deferred) {
      throw new IllegalStateException("Fit cannot be used with a Target.");
    }

    if (!data.hasImage()) {
      picasso.cancelRequest(target);
      target.onPrepareLoad(setPlaceholder ? getPlaceholderDrawable() : null);
      return;
    }

    Request request = createRequest(started);
    String requestKey = createKey(request);

    if (shouldReadFromMemoryCache(memoryPolicy)) {
      Bitmap bitmap = picasso.quickMemoryCacheCheck(requestKey);
      if (bitmap != null) {
        picasso.cancelRequest(target);
        target.onBitmapLoaded(bitmap, MEMORY);
        return;
      }
    }

    target.onPrepareLoad(setPlaceholder ? getPlaceholderDrawable() : null);

    Action action =
        new TargetAction(picasso, target, request, memoryPolicy, networkPolicy, errorDrawable,
            requestKey, tag, errorResId);
    picasso.enqueueAndSubmit(action);
  }
