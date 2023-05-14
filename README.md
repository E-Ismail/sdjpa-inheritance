# Spring Data JPA Inheritance

Section 20: @Inheritance(strategy = InheritanceType.<TABLE_PER_CLASS | SINGLE_TABLE ...>)
MappedSuperClass -> one table,
Table Per Class -> with  GenerationType.IDENTITY cause  MappingException: Cannot use identity column key. One table each entity
Single Table -> added @DiscriminatorColumn, Single table model with a column having the type that is being persisted
Joined Table -> multiple tables with join based on the ID's or any other attribute 


