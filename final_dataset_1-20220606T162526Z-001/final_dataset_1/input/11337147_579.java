@Override
    public ProcessCategoryItem add(final ProcessCategoryItem item) {
        try {
            getProcessAPI().addCategoriesToProcess(item.getProcessId().toLong(),
                    Arrays.asList(item.getCategoryId().toLong()));

            return item;
        } catch (AlreadyExistsException e) {
            throw new APIForbiddenException(new _("This category has already been added to this process"), e);
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
