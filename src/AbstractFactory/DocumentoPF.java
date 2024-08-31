package AbstractFactory;

public class DocumentoPF implements Documento {

    @Override
    public String emitir() {
        return "Documento PF";
    }
}
