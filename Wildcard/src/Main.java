import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyNumber<Double> myNumber = new MyNumber<>();
        System.out.println(myNumber.findMax(16.33332, 16.3333333));
        MyMath<Double> myMath = new MyMath<Double>();
        System.out.println(myMath.DigitAdd(3.6, 9.6, 8.4, 8.5, 9.0, 8.1, 9.003));
        System.out.println(myMath.pow(6.0, 2.5));

        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyen Van Nam");
        listWildcards.add(30);
        listWildcards.add("Ha Dong, Ha Noi");
        for (Object obj: listWildcards){
            System.out.println(obj);
        }

    }

}
