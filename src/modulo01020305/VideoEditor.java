package modulo01020305;

public class VideoEditor extends Employee {

    private String editorTool;

    public VideoEditor(String document, String name, double salary, String editorTool) {
        super(document, name, salary);
        this.editorTool = editorTool;
    }

    @Override
    public double getBonus() {
        return super.getSalary() - 0.1 + 80;
    }
}
