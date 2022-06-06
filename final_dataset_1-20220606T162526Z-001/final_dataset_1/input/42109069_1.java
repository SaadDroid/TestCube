public List<String> roles(String userId) {
        String request = request(userId);
        ResponseEntity<byte[]> response = restTemplate.exchange(sabEndpoint, HttpMethod.POST, new HttpEntity<>
            (request), byte[].class);
        try {
            List<String> roles = parser.parse(new ByteArrayInputStream(response.getBody()));
            LOG.debug("Retrieved SAB roles with request: {} and response: {}", request, response);
            return roles;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
