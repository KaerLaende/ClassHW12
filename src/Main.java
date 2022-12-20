public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев Николаевич", "Толстой");//лень было отдельно переменную для отчество создавать..
        Author fedorDostoevskiy = new Author("Федор Михайлович", "Достоевский");

        Books warAndPeace = new Books(levTolstoi, "Война и мир", 1867);
        Books crimeAndPunishment = new Books(fedorDostoevskiy, "Преступление и наказание", 1866);

        warAndPeace.setPublishingYear(2022);
        crimeAndPunishment.setPublishingYear(2022);

        Books[] books = {warAndPeace, crimeAndPunishment};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println("Всё х*ня, давай с начало!");

        warAndPeace.setPublishingYear(1867);
        crimeAndPunishment.setPublishingYear(1866);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        if (warAndPeace.equals(crimeAndPunishment)) {
            System.out.println("Если эти книги одинаковые - Вы Марсианин");
        } else {
            System.out.println("О_о ..конечно книги разные!!");
        }

    }
}