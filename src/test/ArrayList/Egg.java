package test.ArrayList;

/**
 * Created by Администратор on 28.03.2015.
 */
public class Egg {
    private int size;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString (){
        return ("Name - "+getSize()+
        " , size - "+getSize());
    }
}
