import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List <Person> persons = Arrays.asList(
                new Person( 5  , "Аркадий"),
                new Person( 6  , "Даниил "),
                new Person( 7  , "Иркаил "),
                new Person( 8  , "Серафим"),
                new Person( 9  , "Агниил "),
                new Person( 15 , "Мерилл "),
                new Person( 14 , "Агафий "),
                new Person( 13 , "Рёрик  "),
                new Person( 50 , "Святополк"),
                new Person( 2  , "Баркадий"),
                new Person( 1  , "Аркадий")
        );

        int[] ids = new int[] { 10, 1, 12, 13, 14, 15};

        Person.order(persons, ids);

        for (Person p: persons) {
            System.out.println (p);
        }
    }
}
