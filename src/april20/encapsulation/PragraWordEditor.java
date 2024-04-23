package april20.encapsulation;

public class PragraWordEditor {
   private String para;


    public PragraWordEditor(String para) {
        this.para = para;

    }

    public String getPara() {
        return para;
    }

    public void isParaMatch(String para){
        if(this.para.equalsIgnoreCase(para)){
            System.out.println("Paragraph is correct");
        }
        else
            System.out.println("not match");
    }

}
