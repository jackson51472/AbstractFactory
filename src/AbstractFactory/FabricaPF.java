package AbstractFactory;

public class FabricaPF implements Fabrica {
    public Documento createDocumento() {
        return new DocumentoPF();
    }
}
