package br.usp.each.si.ach2003;

//public class Box {
//    private Object object;
//    public void set(Object object) {
//        this.object = object;
//    }
//    public Object get() { return object; }
//}

public class Box<M> {
    // T significa "Tipo" private T t;
    private M t;
    public void set(M t) {
        this.t = t;
    }

    public M get() {
        return t;
    }

    public String toString() {
        return t.toString();
    }
}