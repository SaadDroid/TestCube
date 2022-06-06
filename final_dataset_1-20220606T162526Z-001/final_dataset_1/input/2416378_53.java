public ComponentDescriptor analyze(ASTType astType) {

        BroadcastReceiver broadcastReceiverAnnotation = astType.getAnnotation(BroadcastReceiver.class);

        ComponentDescriptor receiverDescriptor;

        if (astType.inherits(AndroidLiterals.BROADCAST_RECEIVER)) {
            //vanilla Android broadcast receiver
            PackageClass activityPackageClass = astType.getPackageClass();
            PackageClass receiverClassName = componentAnalysis.buildComponentPackageClass(astType, activityPackageClass.getClassName(), "BroadcastReceiver");
            receiverDescriptor = new ComponentDescriptor(astType, null, receiverClassName);
        } else {
            PackageClass receiverClassName = componentAnalysis.buildComponentPackageClass(astType, broadcastReceiverAnnotation.name(), "BroadcastReceiver");

            TypeMirror type = getTypeMirror(broadcastReceiverAnnotation, "type");
            ASTType receiverType = type == null || type.toString().equals("java.lang.Object") ? AndroidLiterals.BROADCAST_RECEIVER : type.accept(astTypeBuilderVisitor, null);

            InjectionNodeBuilderRepository injectionNodeBuilderRepository = componentAnalysis.setupInjectionNodeBuilderRepository(receiverType, BroadcastReceiver.class);

            injectionNodeBuilderRepository.addRepository(
                    injectionNodeBuilderRepositoryFactory.buildModuleConfiguration());

            if(type != null) {
                ASTType applicationASTType = type.accept(astTypeBuilderVisitor, null);

                while(!applicationASTType.equals(AndroidLiterals.BROADCAST_RECEIVER) && applicationASTType.inherits(AndroidLiterals.BROADCAST_RECEIVER)){
                    injectionNodeBuilderRepository.putType(applicationASTType, injectionBindingBuilder.buildThis(applicationASTType));
                    applicationASTType = applicationASTType.getSuperClass();
                }
            }

            AnalysisContext analysisContext = analysisContextFactory.buildAnalysisContext(injectionNodeBuilderRepository);

            receiverDescriptor = new ComponentDescriptor(astType, receiverType, receiverClassName, analysisContext);

            receiverDescriptor.getGenerators().add(scopesGenerationFactory.build(getASTMethod("onReceive", AndroidLiterals.CONTEXT, AndroidLiterals.INTENT)));

            receiverDescriptor.getGenerators().add(onCreateInjectionGeneratorFactory.build(getASTMethod("onReceive", AndroidLiterals.CONTEXT, AndroidLiterals.INTENT), astType));

            componentAnalysis.setupGenerators(receiverDescriptor, receiverType, BroadcastReceiver.class);
        }

        receiverDescriptor.getGenerators().add(manifestEntryGenerator);
        receiverDescriptor.getGenerators().add(intentFactoryGenerator);

        return receiverDescriptor;
    }
