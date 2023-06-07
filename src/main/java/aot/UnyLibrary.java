package aot;

import org.springframework.stereotype.Component;

@Component()
public class UnyLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из unyLibrary!");
    }

    @Override
    public void returnBook() {
        System.out.println("Мы возвращаем книгу в unyLibrary!");
    }
}
