public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sava", "Stefan", "Prunilor 24", "stefan@sava.ro");
        student1.setNrMatricol(1);
        student1.setAnStudiu(2);
        student1.setSpecializare("IE");
        student1.setMedieAdmitere(8.12F);

        CadruDidactic cadrudidactic1 = new CadruDidactic("A", "A", "AA nr. 1", "a@a.a", 2000, 10);
        cadrudidactic1.setTitulatura("bbbbb");

        PersonalNedidactic personalnedidactic1 = new PersonalNedidactic("B", "B", "BB nr. 2", "b@b.b", 1000, 5);
        personalnedidactic1.setFunctie("Personal Secretariat");

        System.out.println(student1.toString());
        System.out.println(cadrudidactic1.toString());
        System.out.println(personalnedidactic1.toString());

    }
}