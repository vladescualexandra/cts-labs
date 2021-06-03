# Software Quality & Testing
Laboratories for Software Quality and Testing (CTS) in 2021


- [x] seminar-001: Setup.
- [x] seminar-002: Clean Code. Clase, interfețe, excepții.
- [x] seminar-003: Clean Code. Refactoring.
- [x] seminar-004: Clean Code. Refactoring.
- [x] seminar-005: Singleton. Prototype.
- [x] seminar-006: Builder. Factory.
- [x] seminar-007: Factory Method. Facade. Adapter.
- [x] seminar-008: Decorator. Composite.
- [x] seminar-009: Flyweight. Proxy.
- [x] seminar-010: Strategy. State. 
- [x] seminar-011: Chain. Command.
- [x] seminar-012: Observer. Memento. Intro JUnit.
- [x] seminar-013: JUnit
- [x] seminar-014: JUnit

## Design Patterns
### Creational Design Patterns;
* Abstract Factory: Pattern pentru crearea de obiecte aflate într-un anumit context.
* Factory Method: Pattern ce definește o metodă pentru crearea de obiecte din aceeași familie (interfață) în subclase.
* Builder: Pattern pentru crearea în mod structurat (incremental) de obiecte complexe.
* Prototype: Pattern pentru clonarea unor noi instanțe (clone) ale unui prototip existent.
* Singleton: Pattern pentru crearea unei instanțe unice.
### Structural Design Patterns:
* Adapter: Adaptează interfața unui server/serviciu la client.
* Composite: Agregarea ierarhică a mai multor obiecte similare.
* Decorator: Extinde într-un mod transparent un obiect la run-time.
* Facade: Simplifică interfața unui modul/subsistem.
* Flyweight: Partajare memorie între obiecte similare.
* Proxy: Interfață către alte obiecte/resurse.
### Behavioral Design Patterns:
* Chain of Responsability: Gestionează tratarea unui eveniment de către mai mulți furnizori de soluții.
* Command: Request or Action is first-class object, hence restorable.
* State: Gestionează obiecte al căror comportament depinde de starea lor.
* Strategy: Încapsulează diferiți algoritmi.


## JUnit
### CORRECT 
* Conformance – Valoarea are formatul corect ?
* Ordering – Setul de valori trebuie să fie ordonat sau nu ?
* Range – este valoarea între limitele (maxim și minim) acceptate?
* Reference – Codul referă componente externe care NU sunt
controlate direct?
* Existence – Valoarea există (ex. este non-null, non-zero, parte dintrun set, etc.)?
* Cardinality – Setul de test conține suficiente valori (regula 0-1-n) ?
* Time (absolut și relativ) – Totul se întâmplă în ordine ? La momentul
potrivit ? Într-un timp finit ? (UTC vs. DST)
### The Right-BICEP
* Right . Sunt rezultatele corecte ?
* B . Sunt limitele (Boundary conditions) definite CORRECT?
* I . Poți verifica opusul situației (Inverse relationships)?
* C . Se poate verifica rezultatul si prin alte metode (Cross-check)?
* E . Se pot evalua (forța) condițiile care generează erori (Errorconditions)?
* P . Performanta execuției este intre limite (Performance
characteristics) ?
