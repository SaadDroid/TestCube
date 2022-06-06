@RequestMapping("/ip4Dom")
    public JSONObject ip4Dom(HttpServletRequest request) throws Exception {

        JSONObject result = new JSONObject();
        try {
            String domName = WebUtils.required(request, "dom");
            String clusters = WebUtils.optional(request, "clusters", StringUtils.EMPTY);
            String agent = WebUtils.optional(request, "header:Client-Version", StringUtils.EMPTY);

            VirtualClusterDomain dom = (VirtualClusterDomain) domainsManager.getDomain(domName);

            if (dom == null) {
                throw new NacosException(NacosException.NOT_FOUND, "dom: " + domName + " not found!");
            }

            List<IpAddress> ips = null;
            if (StringUtils.isEmpty(clusters)) {
                ips = dom.allIPs();
            } else {
                ips = dom.allIPs(Arrays.asList(clusters.split(",")));
            }

            if (CollectionUtils.isEmpty(ips)) {
                result.put("ips", Collections.emptyList());
                return result;
            }

            ClientInfo clientInfo = new ClientInfo(agent);

            JSONArray ipArray = new JSONArray();
            for (IpAddress ip : ips) {
                JSONObject ipPac = new JSONObject();

                ipPac.put("ip", ip.getIp());
                ipPac.put("valid", ip.isValid());
                ipPac.put("port", ip.getPort());
                ipPac.put("marked", ip.isMarked());
                ipPac.put("app", ip.getApp());

                if (clientInfo.version.compareTo(VersionUtil.parseVersion("1.5.0")) >= 0) {
                    ipPac.put("weight", ip.getWeight());
                } else {
                    double weight = ip.getWeight();
                    if (weight == 0) {
                        ipPac.put("weight", (int) ip.getWeight());
                    } else {
                        ipPac.put("weight", ip.getWeight() < 1 ? 1 : (int) ip.getWeight());
                    }
                }
                ipPac.put("checkRT", ip.getCheckRT());
                ipPac.put("cluster", ip.getClusterName());

                ipArray.add(ipPac);
            }

            result.put("ips", ipArray);
        } catch (Throwable e) {
            Loggers.SRV_LOG.warn("VIPSRV-IP4DOM", "failed to call ip4Dom, caused " + e.getMessage());
            throw new IllegalArgumentException(e);
        }

        return result;
    }
