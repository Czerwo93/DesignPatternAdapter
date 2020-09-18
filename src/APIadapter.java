import java.time.LocalDate;

public class APIadapter implements LibraryAPI {

    private LibraryAPIv2 libraryAPIv2;
    private User user;

    public APIadapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }

    @Override
    public boolean isAviable(String bookTitle) {
        return libraryAPIv2.numberOfAviableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());
    }
}
