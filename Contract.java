public interface Contract {

    void grab(String item);
    String drop(String item);
    void examine(String item);
    void use(String item);
    boolean walk(String direction);
    boolean fly(int shrooms, int feathers);
    Number shrink();
    Number grow();
    void rest();
    void undo();

}
//it's a me mario

