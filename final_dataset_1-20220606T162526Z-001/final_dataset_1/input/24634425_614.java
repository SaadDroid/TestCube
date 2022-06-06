protected static void addInterfaceDclr(SLATemplate slaTemplate, OvfDefinition ovf, String ovfURL) {
		VirtualSystem[] virtualSystemArray = ovf.getVirtualSystemCollection().getVirtualSystemArray();
		InterfaceDeclr[] ifaces = new InterfaceDeclr[virtualSystemArray.length];
		
		for(int i = 0; i < virtualSystemArray.length; i++) {
		
			// Creating an ID using the OVF ID for the Virtual System Collection
			ID id = new ID("OVF-Item-" + virtualSystemArray[i].getId());
			// Provider ID
			ID idProvider = new ID("AsceticProvider");
			
			

            ResourceType resType=new ResourceType("OVFAppliance");
//            Endpoint endpoint=new Endpoint(new ID("haproxy-VM-Type"), new UUID("VM-Manager ID"), sla.HTTP);
//            Endpoint[] endpoints={endpoint};
//            InterfaceDeclr intDecl=new InterfaceDeclr(new ID("haproxy"), new ID("AsceticProvider"), endpoints, resType);


//		    interface_resource_type{
//	            name = OVFAppliance
//	        }

			
			
			
			// TODO
			//		// It is necessary to create an interface
//					InterfaceResourceTypeType interfaceResourceType = new InterfaceResourceTypeTypeImpl(null);
//					interfaceResourceType.setName("OVFAppliance");
	//		Interface.Specification ispec = new Interface.Specification("OVFAppliance");
			//		iface.set
			//		
			//		// By the example looks like we only have one unique InterfaceDclr.
//			InterfaceDeclrType interfaceDeclaration2 = new InterfaceDeclrTypeImpl(null);
//			interfaceDeclaration2.getInterface();
			InterfaceDeclr interfaceDeclaration = new InterfaceDeclr(id, idProvider, resType);



			// We set the properties
			interfaceDeclaration.setPropertyValue(new STND("OVF_URL"), ovfURL);
			logger.info("OVF_URL: " + ovfURL);

			// We create the Endpoint:
			STND protocol = new STND("http://www.slaatsoi.org/slamodel#HTTP");
			Endpoint[] endPoints = new Endpoint[1];

			ID idEndPoint = new ID(virtualSystemArray[i].getId() + "-VM-Type");

			Endpoint endPoint = new Endpoint(idEndPoint, protocol);
			endPoint.setLocation(new UUID("VM-Manager ID"));
			endPoint.setPropertyValue(new STND("OVF_VirtualSystem_ID"), virtualSystemArray[i].getId());

			endPoints[0] = endPoint;
			interfaceDeclaration.setEndpoints(endPoints);
			
			ifaces[i] = interfaceDeclaration;
		}
		
		slaTemplate.setInterfaceDeclrs(ifaces);
	}
