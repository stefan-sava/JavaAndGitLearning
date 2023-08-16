Problema 4. Status: In lucru. Vezi: probClasaFacultate

Structura claselor:

Facultate{Denumire, Contact(adresa, email), Specializari, Angajati, Studenti}
Specializare{IdSpecializare, Denumire, Cursuri, Responsabil} 
Curs{CursId, Denumire, Titular}
NotaCurs{CursId, Nota}

Persoana{Nume, Prenume, Adresa, Email}

!! EXTINDE CLASA PERSOANA !!
Student  {NrMatricol, AnStudiu, Specializare, MedieAdmitere, NotaCursuri}
Angajat  {Salariu, Vechime}

!! EXTINDE CLASA ANGAJAT !!
CadruDidactic  {Titulatura}
PersonalNedidactic {Functie}

Cerinta:
Implementati structura de clase de mai sus, unde clasa Persoana si clasa Angajat sunt abstracte,
cu toate metodele necesare fiecarei clase. Dintr-un fisier text incarcati datele pentru o anumita facultate. 
In programul principal creati un meniu care sa contina mai multe optiuni, ca de exemplu:

1-> adaugati un student
2-> adaugati un cadru didactic
3-> adaugati un angajat, personal nedidactic 
4-> stergeti un angajat (cautati-l dupa nume si prenume, citite de la tastatura)
5-> stergeti un student (cautati-l dupa nume si prenume, citite de la tastatura)
6-> adaugati o nota pentru un student (cititi cursul, numele studentului si nota de la tastatura)
7-> modificati o nota pentru un student (cititi cursul, numele studentului si nota de la tastatura)
8-> adaugati un curs nou
9-> salvare in fisier




Problema 3. Status: Finalizat. Vezi: f2p3

Se considera un fisier text “in.txt” care poate contine diverse tipuri de obiecte dintr-o
farmacie, de tip medicamente/dieta/dispozitiveMedicale – momentan sunt 3 tipuri definite,
dar pot aparea mai multe tipologii. Toate tipurile de obiecte care se gasesc in farmacie sunt
intr-un fisier “produse.txt”.
Fisierul in.txt arata de forma

ED456 * medicament * vitaminaC * Ofera suport pentru sistemul imunitar * Bayer
IU89011 * dispozitiveMedicale * dispozitivInhalat * Util la ceva * Siemens * valabilitate
I9011 * dieta * Ceva * Util

Iar fisierul produse.txt este de forma (contine elemente unice):
medicament
dispozitiveMedicale
dieta

a. Sa se citeasca toate produsele din fisierul de intrare si sa se adauge toate intr-o
colectie. In paralel, sa se realizeze 3 liste diferite, pentru fiecare tip de produs
existent si sa se adauge produsele pe categoriile existente.

b. Sa se sorteze toate medicamentele dupa ID (prima componenta)

c. Sa se verifice daca exista dispozitve medicale unice in fisierul initial.


Problema 2. Status: Finalizat. Vezi: f2p2

Sa se creeze o clasa Persoana care are doua atribute: nume (String) si cod numeric personal
(String). Fiecare persoana are un cod numeric personal unic.
Sa se scrie o metoda care returneaza intersectia a doua colectii de tip Set care contin obiecte
de tip Persoana.

Problema 1. Status: Finalizat. Vezi: f2p1

O clasa Carte este caracterizata de Titlu, Autor (String-uri) si numar de pagini (int).
Se considera ca doua carti sunt identice (egale) daca au acelasi autor, acelasi titlu si acelasi
numar de pagini.
Sa se defineasca in clasa Carte o metoda potrivita pentru a compara doua Carti.
Sa se apeleze metoda din programul principal.



