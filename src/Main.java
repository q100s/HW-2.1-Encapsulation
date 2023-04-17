public class Main {
    public static void main(String[] args) {
        StudentService printInfo = new StudentService();
        printInfo.printInfo("Cedric", "Diggory");
        StudentService compare = new StudentService();
        compare.compareStudents("Gregory", "Goyle", "Graham", "Montague");
        compare.compareGriffindorStudents("Ron", "Weasley", "Hermione", "Granger");
        compare.compareSlytherinStudents("Gregory", "Goyle", "Graham", "Montague");
        compare.compareHufflepuffStudents("Cedric", "Diggory", "Zachariah", "Smith");
        compare.compareRavenclawStudents("Padma", "Patil", "Marcus", "Belby");
    }
}