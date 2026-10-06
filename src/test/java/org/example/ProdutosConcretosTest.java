package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutosConcretosTest {
    @Test
    void feijoadaDeveSeIdentificarComoPratoPrincipal() {
        assertEquals("Feijoada", new Feijoada().nome());
    }

    @Test
    void farofaDeveSeIdentificarComoAcompanhamento() {
        assertEquals("Farofa", new Farofa().nome());
    }

    @Test
    void guaranaDeveSeIdentificarComoBebida() {
        assertEquals("Guaraná", new Guarana().nome());
    }

    @Test
    void tacosDevemSeIdentificarComoPratoPrincipal() {
        assertEquals("Tacos", new Tacos().nome());
    }

    @Test
    void guacamoleDeveSeIdentificarComoAcompanhamento() {
        assertEquals("Guacamole", new Guacamole().nome());
    }

    @Test
    void tequilaDeveSeIdentificarComoBebida() {
        assertEquals("Tequila", new Tequila().nome());
    }
}
