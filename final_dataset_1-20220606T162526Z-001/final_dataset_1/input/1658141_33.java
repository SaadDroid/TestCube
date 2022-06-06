public Object execute(String sql, boolean returnKey, ParameterMapper parameterMapper, PreparedCallback preparedCallback) {
        try {
            Connection conn = datasource.getConnection();
            try {
                // Siempre se usa un PreparedStatement ya que se puede usar
                // con parámetros o sin parametros. Se crea en función de si
                // se utilizará o no para devolver claves generadas.
                PreparedStatement statement;

                if(returnKey) { 
                    statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                } else {
                    statement = conn.prepareStatement(sql);
                }

                try {
                    // Ejecuta el callback de inicialización de parametros.
                    if (parameterMapper != null) {
                        parameterMapper.mapParameters(statement);
                    }
                    // Ejecuta con el callback el procesamiento de la sentencia
                    // que decide el objeto a devolver.
                    return preparedCallback.process(statement);
                } finally {
                    statement.close();
                }
            } finally {                
                conn.close();
            }
        } catch (SQLException ex) {
            // Las excepciones SQL serán principalmente fallos irrecuperables,
            // por lo que se deben propagar si el DAO no las soluciona.
            throw new SQLDaoException(ex);
        }
    }
