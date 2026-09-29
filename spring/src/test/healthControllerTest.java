package com.example.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class HealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void healthShouldReturnOk() throws Exception {

        mockMvc.perform(get("/health"))
                .andExpect(status().isOk());
    }

    void printJSONResponse() throws Exception {
        mockMvc.perform(get("/healths"))
            .andDo(print())
            .andExpect(status().isOk());
    }
       @Test
    void healthShouldReturnCorrectResponse() throws Exception {

        mockMvc.perform(get("/health")).andExpect(content().json("{\"Saludo3\":\"Nueva versión desplegada\"}"));
    }

}