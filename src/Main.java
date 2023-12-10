import annotations.exercise_2.ClassAnnotation;
import model.Person;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Class<?> person = Person.class;

        if (person.isAnnotationPresent(ClassAnnotation.class)) {
            try {
                Constructor<?> personConstructor = person.getDeclaredConstructor(String.class, String.class, String.class);
                personConstructor.setAccessible(true);

                Person newPerson = (Person) personConstructor.newInstance("Elman", "Abdullaev", "Miechow");

                System.out.println(newPerson);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Exception: Annotation not found");
        }
    }
}