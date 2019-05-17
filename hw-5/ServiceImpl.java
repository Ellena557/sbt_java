import java.util.LinkedList;
import java.util.List;

public class ServiceImpl implements Service {
    @Override
    @Cache(identityBy = String.class)
    public double doHardWork(String s, int a) {
        System.out.println(s + " " + a);
        double r = a;
        return r;
    }

    @Override
    @Cache(identityBy = String.class, keyName = "work")
    public double doLessHardWork(String s, int a) {
        System.out.println(s + " " + a);
        double r = a;
        return r;
    }

    @Override
    @Cache(identityBy = String.class, keyName = "list", listList = 2)
    public List<Integer> doListWork(String s, int a) {
        System.out.println(s + " " + a);
        List<Integer> cacheList = new LinkedList<>();
        cacheList.add(a);
        cacheList.add(a);
        cacheList.add(a);
        cacheList.add(a);
        return cacheList;
    }
}
