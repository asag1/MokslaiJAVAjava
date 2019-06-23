package studentuEgzaminuTikrinimas;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TikriaAtsakymuSkaiciavima {
    private Map<Object, Object> studentoAtsakymuSarasas = new HashMap<>();
    private Map<Object, Object> teisinguAtsakymuSarasas = new HashMap<>();
    private NuskaitymasIsJson mockObjektas;

    @Before
    public void setUp() {
        mockObjektas = mock(NuskaitymasIsJson.class);
        studentoAtsakymuSarasas.put(1, "a");
        studentoAtsakymuSarasas.put(2, "b");
        studentoAtsakymuSarasas.put(3, null);
        teisinguAtsakymuSarasas.put(1, "a");
        teisinguAtsakymuSarasas.put(2, "a");
        teisinguAtsakymuSarasas.put(3, "a");
        when(mockObjektas.getTeisinguAtsakymuSarasas()).thenReturn(teisinguAtsakymuSarasas);
        when(mockObjektas.getStudentoAtsakymuSarasas()).thenReturn(studentoAtsakymuSarasas);
    }

    @Test
    public void atsakymuTikrinimasTest_arTikrina() {
        Map<Object, Object> teisinguAtsakymuSarasas = mockObjektas.getTeisinguAtsakymuSarasas();
        Map<Object, Object> studentoAtsakymuSarasas = mockObjektas.getStudentoAtsakymuSarasas();
        AtsakymuTikrinimas a = new AtsakymuTikrinimas(mockObjektas);
        assertNotNull(teisinguAtsakymuSarasas);
        assertEquals(1, a.vertinimas());
    }
}
