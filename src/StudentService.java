public class StudentService {
    HogwartsStudent[] students = {
            new GriffindorStudent("Harry", "Potter", 90, 70, 4, 5, 8),
            new GriffindorStudent("Hermione", "Granger", 75, 80, 5, 5, 6),
            new GriffindorStudent("Ron", "Weasley", 60, 65, 3, 6, 5),
            new SlytherinStudent("Draco", "Malfoy", 90, 80, 4, 3, 6, 8),
            new SlytherinStudent("Graham", "Montague", 75, 70, 3, 3, 4, 4),
            new SlytherinStudent("Gregory", "Goyle", 50, 40, 2, 3, 2, 5),
            new HufflepuffStudent("Zachariah", "Smith", 65, 45, 5, 4, 6),
            new HufflepuffStudent("Cedric", "Diggory", 55, 50, 4, 5, 4),
            new HufflepuffStudent("Justin", "Finch-Fletchley", 50, 60, 5, 3, 4),
            new RavenclawStudent("Zhou", "Chang", 50, 70, 6, 4, 5, 3),
            new RavenclawStudent("Padma", "Patil", 70, 55, 4, 4, 6, 3),
            new RavenclawStudent("Marcus", "Belby", 60, 65, 3, 4, 6, 6),

    };

    public void printInfo(String firstName, String secondName) {
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(firstName) &&
                    students[i].getSecondName().equals(secondName)) {
                exist = true;
                System.out.println(students[i].getFirstName() + " " + students[i].getSecondName() + ": SpellPower = "
                        + students[i].getSpellPower() + ", ApparateDistance = " + students[i].getApparateDistance()
                        + students[i]);
                break;
            }
        }
        if (!exist) {
            System.out.println("There isn't student: " + firstName + " " + secondName);
        }
    }

    public void compareStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                sum1 = sum1 + students[i].getSpellPower() + students[i].getApparateDistance();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                sum2 = sum2 + students[i].getSpellPower() + students[i].getApparateDistance();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareGriffindorStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        GriffindorStudent student1 = null;
        GriffindorStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (GriffindorStudent) students[i];
                sum1 = sum1 + student1.getHonor() + student1.getCourage() + student1.getNobleness();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (GriffindorStudent) students[i];
                sum2 = sum2 + student2.getHonor() + student2.getCourage() + student2.getNobleness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareSlytherinStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        SlytherinStudent student1 = null;
        SlytherinStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (SlytherinStudent) students[i];
                sum1 = sum1 + student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (SlytherinStudent) students[i];
                sum2 = sum2 + student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareRavenclawStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        RavenclawStudent student1 = null;
        RavenclawStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (RavenclawStudent) students[i];
                sum1 = sum1 + student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativeness();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (RavenclawStudent) students[i];
                sum2 = sum2 + student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativeness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareHufflepuffStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        HufflepuffStudent student1 = null;
        HufflepuffStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (HufflepuffStudent) students[i];
                sum1 = sum1 + student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (HufflepuffStudent) students[i];
                sum2 = sum2 + student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }
}