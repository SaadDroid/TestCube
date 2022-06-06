public static Optional<ButtonPmo> getEditButtonPmo(Object pmo) {
        return (pmo instanceof PresentationModelObject) ? ((PresentationModelObject)pmo).getEditButtonPmo()
                : Optional.empty();
    }
