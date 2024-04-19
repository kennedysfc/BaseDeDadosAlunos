# Description of Aluno Class

The provided Java code defines a class named `Aluno`, which represents a student. This class contains attributes and methods to handle student information and calculate their final status based on their grades.

## Attributes

- `ra`: Represents the registration number (RA) of the student.
- `nome`: Represents the name of the student.
- `pri`, `seg`, `ter`, `qua`: Represents the grades obtained by the student in four different subjects.
- `media`: Represents the average grade of the student.
- `statusFinal`: Represents the final status of the student (APPROVED, RECOVERY, REPROVED, or INVALID GRADE).

## Constructors

The class provides two constructors:
1. `public Aluno(String nome, double pri, double seg, double ter, double qua)`: Initializes an instance of `Aluno` with the provided name and grades.
2. `public Aluno(int ra, String nome, double pri, double seg, double ter, double qua)`: Initializes an instance of `Aluno` with the provided registration number, name, and grades.

## Methods

- `public double calcularMedia()`: Calculates and returns the average grade of the student.
- `public String verificarStatus()`: Verifies the final status of the student based on their average grade and returns the corresponding status message.

## Getters and Setters

The class provides getters and setters for all attributes to access and modify their values.

### Getters:
- `getRa()`
- `getNome()`
- `getPri()`
- `getSeg()`
- `getTer()`
- `getQua()`
- `getMedia()`
- `getStatusFinal()`

### Setters:
- `setRa(int ra)`
- `setNome(String nome)`
- `setPri(double pri)`
- `setSeg(double seg)`
- `setTer(double ter)`
- `setQua(double qua)`
- `setMedia(double media)`
- `setStatusFinal(String statusFinal)`

## Observations

- The class encapsulates the attributes using private access modifiers and provides public methods to access and modify them.
- The `calcularMedia()` method calculates the average grade of the student based on the grades obtained in four subjects.
- The `verificarStatus()` method determines the final status of the student (APPROVED, RECOVERY, REPROVED, or INVALID GRADE) based on their average grade.
- Constructors are used to initialize the object with initial values for its attributes.
- Getters and setters allow for safe access and modification of the object's attributes.

