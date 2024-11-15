package com.BaldovinoPFjava.tiendabike.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderService {

    private final RestTemplate restTemplate;

        public JsonPlaceholderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String obtenerTodosLosUsuarios() {
        String apiUrl = "https://jsonplaceholder.typicode.com/users";
        return restTemplate.getForObject(apiUrl, String.class);
    }

    public String obtenerUsuarioPorId(Long id) {
        String apiUrl = "https://jsonplaceholder.typicode.com/users/" + id;
        return restTemplate.getForObject(apiUrl, String.class);
    }

    public String crearUsuario(String usuarioJson) {
        String apiUrl = "https://jsonplaceholder.typicode.com/users";
        return restTemplate.postForObject(apiUrl, usuarioJson, String.class);
    }
}
