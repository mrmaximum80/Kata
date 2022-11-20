package javaCore.module4.module4_2.m4_2_6;

public class Runner {


    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException e) {}
        return false;
    }
}
