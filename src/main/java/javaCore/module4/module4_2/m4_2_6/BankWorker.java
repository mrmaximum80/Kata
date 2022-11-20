package javaCore.module4.module4_2.m4_2_6;

public interface BankWorker {

    boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;

}
