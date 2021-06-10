package br.usp.each.si.ach2003;

public class NaturalNumber   { private Integer n;
    public NaturalNumber(Integer n) throws Exception {
        this.n = n;
        if(Integer.valueOf(n) < 0)
            throw new Exception("Not a natural number");
    }
    public boolean isEven() { return n.intValue() % 2 == 0;
    }
}
