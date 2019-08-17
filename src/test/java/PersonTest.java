import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest
{
    @Test
    void TestOrder()
    {
        List <Person> actual = Arrays.asList(
                new Person( 5  , "Аркадий"),
                new Person( 6  , "Даниил"),
                new Person( 7  , "Иркаил"),
                new Person( 8  , "Серафим"),
                new Person( 9  , "Агниил"),
                new Person( 15 , "Мерилл"),
                new Person( 14 , "Агафий"),
                new Person( 13 , "Рёрик"),
                new Person( 50 , "Святополк"),
                new Person( 2  , "Баркадий"),
                new Person( 1  , "Аркадий")
        );
        int[] ids = new int[] { 10, 1, 12, 13, 14, 15};

        List <Person> expected = Arrays.asList(
                new Person( 1  , "Аркадий"),
                new Person( 13 , "Рёрик"),
                new Person( 14 , "Агафий"),
                new Person( 15 , "Мерилл"),
                new Person( 5  , "Аркадий"),
                new Person( 6  , "Даниил"),
                new Person( 7  , "Иркаил"),
                new Person( 8  , "Серафим"),
                new Person( 9  , "Агниил"),
                new Person( 50 , "Святополк"),
                new Person( 2  , "Баркадий")
        );

        Person.order(actual, ids);

        for (int i = 0; i <= actual.size () - 1; i++)
        {
            Person act = actual.get (i);
            Person exp = expected.get (i);
            assertEquals (act.getId (), exp.getId ());
            assertEquals (act.getName (), exp.getName ());
        }
    }

}