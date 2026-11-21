import javax.swing.text.Document;
//import java.util.ArrayList;
//
//interface DocumentElement {
//public  void  render() ;
//}
//class ImageElement  implements  DocumentElement {
//    @Override
//    public void render() {
//        System.out.println("rendering image path");
//    }
//}
//class Textlement  implements  DocumentElement {
//    @Override
//    public void render() {
//        System.out.println("rendering text");
//    }
//}
//
//class Document {
//    ArrayList<DocumentElement> list  ;
//    public  void render() {
//        for(DocumentElement el : list) {
//            el.render();
//        }
//    }
//
//}
//interface Persistence {
//    public void save() ;
//}
//class Postgres implements  Persistence {
//    public void save() {
//        System.out.println("saved successfully");
//    }
//}
//class Mongo implements  Persistence {
//    public void save() {
//        System.out.println("saved successfully");
//    }
//}
//
//class DocumentEditor {
//    ArrayList<Document> list ;
//    Persistence per ;
//    public DocumentEditor (Document doc , Persistence per) {
//        list = new ArrayList<>() ;
//        this.per = per ;
//    }
//
//}
//
//
//
//public class Main1 {
//    public static void main(String[] args) {
//DocumentElement el1 = new DocumentElement(new Document() , Mongo) ;
//
//
//    }
//}
