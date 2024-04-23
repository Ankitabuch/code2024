package april20.encapsulation;

public class TextEditorMain {

    public static void main(String[] args){

        TextEditor textEditor = new TextEditor("This is new file", "PFile");
        String file = textEditor.getFile();
        System.out.println(file);
        String text = textEditor.getTitle();
        System.out.println(text);

        //textEditor.file = "this is old file";   with private variable not able to chage values

        /*textEditor.setFile("old file");
        textEditor.setTitle("Nfile");
        String file1 = textEditor.getFile();
        String text2 = textEditor.getTitle();
        System.out.println(file1);
        System.out.println(text2);*/

        PragraWordEditor pragraWordEditor = new PragraWordEditor("Paragraphs are the building blocks of papers.");
        //System.out.println(pragraWordEditor);

        pragraWordEditor.isParaMatch("Paragraphs are the building blocks of papers.");

        String Para = pragraWordEditor.getPara();

    }
}
