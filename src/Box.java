public class Box <T>{

    //Generic Box<T> sinfi yaz:
    //
    //T tipli bir sahə
    //Konstruktor, get(), set(T value)
    //isEmpty() metodu (dəyər null-dursa true)

   private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public boolean isEmpty(){

        return value==null ;
    }
}
