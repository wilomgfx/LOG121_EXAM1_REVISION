package ca.wcantin.iterator_pattern;

/**
 * Created by William on 2017-06-20.
 */
public class IteratorPatternDemo {


    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
