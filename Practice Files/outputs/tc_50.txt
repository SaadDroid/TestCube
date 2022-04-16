@Test
    public void testCreateNormalMetadata() throws Exception {
        final ServiceContext context = createServiceContext();
        loginAsAdmin(context);

        final String id = importMetadata(context);

        int sampleGroup = _groupRepo.findByName("sample").getId();
        final Element params = createParams(
            read(Geonet.Elem.ID, id),
            read(Geonet.Elem.GROUP, sampleGroup));

        final Create createService = new Create();

        final Element element = createService.serviceSpecificExec(params, context);

        assertEquals(2, _metadataRepo.count());
        assertNotNull(_metadataRepo.findOne(element.getChildText(Geonet.Elem.ID)));
    }
