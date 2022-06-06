@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        // Obtiene los contactos usando los servicios de la
        // capa de negocio.
        List<Contact> contacts = addressBook.getAll();

        // El modelo se entrega a las vistas como un atributo del request.
        request.setAttribute("contacts", contacts);

        // Forward de la petición hacia la vista que renderiza la UI.
        request.getRequestDispatcher(viewPath).forward(request, response);
    }
