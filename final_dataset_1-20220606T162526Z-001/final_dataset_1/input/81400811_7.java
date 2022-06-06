@RequestMapping(value = "/get/{id}")
	public ActionResultObj get(@PathVariable Long id) {
		ActionResultObj result = new ActionResultObj();
		try {
			if (id != 0) {
				EOrg org = orgDao.fetch(id);
				if (org != null) {
					WMap map = new WMap();
					map.put("data", org);
					result.ok(map);
					result.okMsg("查询成功！");
				} else {
					result.errorMsg("查询失败！");
				}
			} else {
				result.errorMsg("查询失败，链接不存在！");
			}
		} catch (Exception e) {
			LOG.error("查询失败，原因：" + e.getMessage());
			result.error(e);
		}
		return result;
	}
