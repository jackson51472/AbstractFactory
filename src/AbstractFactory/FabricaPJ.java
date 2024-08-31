package AbstractFactory;

public class FabricaPJ implements Fabrica{
    public Documento createDocumento() {
        return new DocumentoPF();
    }
}
