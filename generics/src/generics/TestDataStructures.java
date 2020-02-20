package generics;

public class TestDataStructures
{
    public static void main(String[] args)
    {
        IntegerStorage myIntStorage = new IntegerStorage(10);
        System.out.println(myIntStorage.getData());

        DoubleStorage myDoubleStorage = new DoubleStorage(10.9);
        System.out.println(myDoubleStorage.getData());

        ObjectStorage stringStorage = new ObjectStorage("Hello world");
        ObjectStorage intStorage = new ObjectStorage(10);
        ObjectStorage doubleStorage = new ObjectStorage(19.5);

        //we're limited in how we can interact with the object stored in
        //ObjectStorage
        System.out.println(stringStorage.getData());

        String retrievedObject = (String)stringStorage.getData();
        System.out.println(retrievedObject.toUpperCase());

        int retrievedNumber = (int)intStorage.getData();
        System.out.println(retrievedNumber);

        //test using our generic class
        DataStorage<String> dsString = new DataStorage<String>("Hello, world");
        System.out.println(dsString.getData().toUpperCase());

        //the generic type given when using a generic class must be
        //a reference type (not a primitive type)
        DataStorage<Integer> dsInteger = new DataStorage<>(10);
        System.out.println(dsInteger.getData());

        int number = dsInteger.getData();
    }
}











