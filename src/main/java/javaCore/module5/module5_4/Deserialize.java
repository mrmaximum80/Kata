package javaCore.module5.module5_4;

import java.io.*;

public class Deserialize {

    public static void main(String[] args) throws IOException {

        Integer a1 = 2;
        Animal a2 = new Animal("Tiger");
        Animal a3 = new Animal("Cat");

        Object[] aa = {a1, a2, a3};
        byte[] data = serializeAnimalArray(aa);

        Animal[] bb = deserializeAnimalArray(data);

        System.out.println(a1.equals(bb[0]));
        System.out.println(a2.equals(bb[1]));
        System.out.println(a3.equals(bb[2]));

    }

    public static byte[] serializeAnimalArray(Object[] animals) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oas = new ObjectOutputStream(baos);
        oas.writeInt(animals.length);

        for (int i = 0; i < animals.length; i++) {
            oas.writeObject(animals[i]);
        }
        return baos.toByteArray();
    }


    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = ois.readInt();
            Animal[] animals = new Animal[size];
            for (int i = 0; i < size; i++) {
                animals[i] = (Animal) ois.readObject();
            }
            return animals;
        } catch (ClassNotFoundException | ClassCastException | IOException
                | NullPointerException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
            throw new IllegalArgumentException();
        }
    }
}
