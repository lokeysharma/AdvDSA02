package LLD_2.Factory.DocumentFac;

public class Client {

    public static void main(String[] args) {

        DocumentProcessor p = DocumentProcessorFactory.CreateDocuemnt(DocumentType.TEXT,"Duniys jhayaan ka deta");
        assert p != null;
        p.processDocument();

    }
}
