package com.monte.demo.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(Controller.class)  // Especifica que solo estás probando el Controller
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getMessage_ReturnsCorrectResponseEntity() throws Exception {
        // Realiza una solicitud GET a la API
        mockMvc.perform(get("/api/version"))
            .andExpect(status().isCreated())  // Verifica que el estado HTTP es 201 Created
            .andExpect(jsonPath("$.nombre").value("MiAplicacion"))  // Verifica que el campo "nombre" es "MiAplicacion"
            .andExpect(jsonPath("$.version").value("1.0"))  // Verifica que el campo "version" es "1.0"
            .andExpect(jsonPath("$.mensaje").value("Operación exitosa"))  // Verifica que el campo "mensaje" es "Operación exitosa"
            .andExpect(header().string("X-Monte-Header", "OAuth"));  // Verifica que el encabezado "X-Custom-Header" tiene el valor esperado
    }
}
