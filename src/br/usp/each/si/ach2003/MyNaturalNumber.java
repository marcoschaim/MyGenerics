package br.usp.each.si.ach2003;

public class MyNaturalNumber implements Comparable<Integer> {
    private Integer n;
    public MyNaturalNumber(Integer n) throws Exception {
        if(n.intValue() < 0)
            throw new Exception("Não é um natural");
        this.n = n;
    }
    public boolean isEven() { return n.intValue() % 2 == 0;
    }

    @Override
    public int compareTo(Integer o) {
        return n - o.intValue();
    }
}

