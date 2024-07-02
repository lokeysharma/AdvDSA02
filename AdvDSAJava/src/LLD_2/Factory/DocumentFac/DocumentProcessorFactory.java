package LLD_2.Factory.DocumentFac;

public class DocumentProcessorFactory {

    public static DocumentProcessor CreateDocuemnt(DocumentType type, String DocumentName){

        switch(type){

            case TEXT -> {
                return new TextDocumentProcessor(DocumentName);
            }
            case PRESENTATION -> {
                return new PresentationDocumentProcessor(DocumentName);
            }
            case SPREAD_SHEET -> {
                return new SpreadsheetDocumentProcessor(DocumentName);
            }
            default -> {
                return null;
            }

        }

    }
}
