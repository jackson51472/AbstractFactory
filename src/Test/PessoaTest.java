package Test;

import AbstractFactory.Fabrica;
import AbstractFactory.FabricaPF;
import AbstractFactory.FabricaPJ;
import AbstractFactory.Pessoa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveEmitirDocumentoPF() {
        Fabrica fabrica = new FabricaPF();
        Pessoa aluno = new Pessoa(fabrica);
        assertEquals("Documento PF", aluno.getDocumento().emitir());
    }

    @Test
    void deveEmitirDocumentoPJ() {
        Fabrica fabrica = new FabricaPJ();
        Pessoa aluno = new Pessoa(fabrica);
        assertEquals("Documento PF", aluno.getDocumento().emitir());
    }
}