package com.ank.single;
@MappedSuperclass

public static class Account {

    @Id
    private Long id;

    private String owner;

    private BigDecimal balance;

    private BigDecimal interestRate;

    //Getters and setters are omitted for brevity

}

@Entity(name = "DebitAccount")
public static class DebitAccount extends Account {

    private BigDecimal overdraftFee;

    //Getters and setters are omitted for brevity

}

@Entity(name = "CreditAccount")
public static class CreditAccount extends Account {

    private BigDecimal creditLimit;

    //Getters and setters are omitted for brevity

}