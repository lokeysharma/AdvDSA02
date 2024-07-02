package LLD_2.Factory.DocumentFac;

public abstract class DocumentProcessor {
    private String documentName;
    public abstract DocumentType supportsType();
    public String getDocumentName(){
        return documentName;
    }

    public DocumentProcessor(String documentName){
        this.documentName = documentName;
    }
    public abstract void processDocument() ;
}
