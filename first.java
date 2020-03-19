class BaseClass
{
    private String name;
    public BaseClass(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}

class DerivedClass extends BaseClass
{
    private int id;

    public DerivedClass(String name, int id) {
        super(name);
        this.id = id;
    }
    public String toString()
    {
        return super.toString() + id;
    }
}

class Main
{
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass("Daniel", 13);

        System.out.println(dc.toString());
    }
}
