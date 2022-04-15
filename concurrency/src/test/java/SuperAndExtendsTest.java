import model.Animal;
import model.Cat;
import model.GarfieldCat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：xiattong
 * @description：extends put受限,get first;  super get受限,put first
 * @version: $
 * @date ：Created in 2021/4/7 13:41
 * @modified By：xiattong
 *
 */
public class SuperAndExtendsTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<GarfieldCat> garfieldCats = new ArrayList<>();

        animals.add(new Animal());
        cats.add(new Cat());
        garfieldCats.add(new GarfieldCat());

        //List<? extends Cat> extendsCatForAnimal = animals;
        List<? super Cat> superCatForAnimal = animals;

        List<? extends Cat> extendsCatForCat = cats;
        List<? super Cat> superCatForCat = cats;

        List<? extends Cat> extendsCatForGarfield = garfieldCats;
        //List<? super Cat> superCatForGarfield = garfieldCats;


        extendsCatForCat.add(null);
        //extendsCatForCat.add(new Animal());
        //extendsCatForCat.add(new Cat());
        //extendsCatForCat.add(new GarfieldCat());

        // 取出的元素，都要可以强转成 Cat
        superCatForCat.add(null);
        //superCatForCat.add(new Animal());
        superCatForCat.add(new Cat());
        superCatForCat.add(new GarfieldCat());


        Object cat = extendsCatForCat.get(0);
        Cat cat2 = extendsCatForCat.get(0);
        Animal animal = extendsCatForCat.get(0);
        //GarfieldCat cat3 = extendsCatForGarfield.get(0);
        Object cat4 = superCatForCat.get(0);


    }
}
