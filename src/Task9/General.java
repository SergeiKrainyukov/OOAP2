package Task9;

import java.io.*;
import java.lang.reflect.Field;

public abstract class General implements Serializable, Cloneable {
    //копирование объекта
    public General deepCopy() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (General) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //клонирование объекта
    public General clone() {
        try {
            return (General) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    //сравнение объектов
    protected boolean equals(General other) {
        return this.equals(other);
    }

    //сериализация
    public byte[] serialize() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        oos.flush();
        return bos.toByteArray();
    }

    //десериализация
    public static General deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (General) ois.readObject();
    }

    //печать в удобном виде
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                sb.append(field.getName()).append(": ").append(field.get(this)).append("\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();

    }

    //проверка типа
    protected boolean isGeneralType(Class<?> someClass){
        return this.getClass().equals(someClass) || someClass.isInstance(this);
    }

    //получение реального типа объекта
    protected Class<?> realTypeOf(){
        return this.getClass();
    }
}

class Any extends General {

}

