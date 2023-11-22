import org.example.Aposentado;
import org.example.FuncionarioAtivo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test
    public void deveRetonarValorPlanoCorretoFuncionarioAtivo() {
        FuncionarioAtivo func = new FuncionarioAtivo();
        func.setSalario(2000);
        assertEquals(200, func.calcularPlanoSaude());
    }

    @Test
    public void deveRetonarValorPlanoCorretoFuncionarioAposentado() {
        Aposentado func = new Aposentado();
        func.setSalario(2000);
        assertEquals(400, func.calcularPlanoSaude());
    }

    @Test
    public void deveRetornarInformacoes() {
        FuncionarioAtivo func = new FuncionarioAtivo();
        func.setSalario(2000);
        func.setNome("Marcelo");
        assertEquals("Ativo{nome='Marcelo', salario=2000, plano saúde=200}", func.getInfo());
    }
}
