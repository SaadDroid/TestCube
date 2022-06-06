@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       // REFACTORIZACION:
       //
       // La funcionalidad de extraer, convertir y validar parametros se lleva
       // a una clase con esa responsabilidad.
       ContactCommandConverter converter = new ContactCommandConverter();

       if(converter.verifyAndConvert(request)) {       
           // Se inserta el nuevo contacto en la agenda.
           addressBook.addContact(converter.getCommand());

           // Envia una respuesta de redirección al navegador (evitando el doble post).
           response.sendRedirect(successedSubmitRedirect);

        } else {
           // Si hay errores se publican en el modelo para que la vista los
           // pueda mostrar.
           request.setAttribute("errors", converter.getErrors());

           // En caso de error la petición se envía al mismo form para que el usuario
           // vea los errores y pueda corregirlos.
           getServletContext().getRequestDispatcher(formView).forward(request, response);
        }
    }
