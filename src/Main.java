public class Main {

    public static void main(String[] args) {
        User user = new User("Paweł", "Cwik", "32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIImplv2();
        APIadapter apiAdapter = new APIadapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user, apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }

}

