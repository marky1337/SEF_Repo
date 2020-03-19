interface TestInterface
{
    String toString(int i);
}

class TestClass implements TestInterface
{
    public String toString(int i)
    {
        return Integer.toString(i);
    }

    public static void main(String[] args)
    {
        TestClass tc = new TestClass();
        System.out.println(tc.toString(1337));
    }
}
