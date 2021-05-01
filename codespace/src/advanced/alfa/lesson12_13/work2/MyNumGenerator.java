package advanced.alfa.lesson12_13.work2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyNumGenerator {
    int numIfElm;
    int maxNumb;

    public MyNumGenerator(int numIfElm, int maxNumb) {
        this.numIfElm = numIfElm;
        this.maxNumb = maxNumb;
    }

    public List generateList(){
        List list =new ArrayList();
        for (int i = 0; i < this.numIfElm; i++) {
            int b = (int)(Math.random()*this.maxNumb);
            list.add(b);
        }
        return list;
    }

    public Set generateSet() throws OverSizeExсeptoin{
        Set set = new HashSet(new ArrayList());
        for (int i = 0; i < this.numIfElm; i++) {
            int b = (int) (Math.random() * this.maxNumb);
            set.add(b);
        }
        if (set.size() < this.numIfElm){
            throw new OverSizeExсeptoin();
        }
        return set;
    }
}
