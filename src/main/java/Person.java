import java.util.*;

class Person
{
    private int id;
    private String name;

    Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static void order(List <Person> persons , int[] ids)
    {
        if(persons == null || ids == null)
            return;
        if(persons.size () == 0 || ids.length == 0)
            return;

        List<Person> copy = new ArrayList <> ( persons.size () );
       
        for (int id: ids)
            for (Person p : persons)
                if (p.id == id)
                    copy.add ( p );

        for(Person p : persons)
            if (!copy.contains ( p ))
                copy.add ( p );

        for (int i = 0 ; i < persons.size () ; i++)
            persons.set ( i , copy.get ( i ) );

    }

    @Override
    public String toString() {
        return new StringJoiner ( ", " , Person.class.getSimpleName () + "[" , "]" )
                .add ( "id: " + id )
                .add ( "name: '" + name + "'" )
                .toString ();
    }
}