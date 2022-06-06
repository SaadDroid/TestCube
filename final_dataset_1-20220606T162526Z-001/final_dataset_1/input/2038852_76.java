public static VirtualIps getVirtualIpsDetails() {

        VirtualIp vip1 = new VirtualIp();
        vip1.setClusterId(rndInt(0, 1000));
        vip1.setAddress(rndIp());
        vip1.setType((VipType) rndChoice(VipType.values()));
        vip1.setId(rndInt(0, 1000));
        vip1.setLoadBalancerId(rndInt(0, 1000));

        VirtualIp vip2 = new VirtualIp();
        vip2.setClusterId(2);
        vip2.setLoadBalancerId(2);
        vip2.setType(VipType.SERVICENET);
        vip2.setId(1);


        VirtualIps vips = new VirtualIps();
        vips.getVirtualIps().add(vip2);
        vips.getVirtualIps().add(vip1);

        return vips;
    }
