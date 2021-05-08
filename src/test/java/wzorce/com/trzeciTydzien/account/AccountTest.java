package wzorce.com.trzeciTydzien.account;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


//void should_return_zero_balance_for_new_account()
//void should_return_balance_of_100_after_deposit_of_100()
//void should_return_balance_minus_withdraw()
//void should_return_balance_minus_withdraw_including_maximum_debit_of_1000()
//void should_not_complete_transaction_exceeding_maximum_debit_of_1000()
//void should_not_complete_withdraw_transaction_with_negative_amount()
//void should_not_complete_deposit_transaction_with_negative_amount()
//void should_transfer_money_between_accounts()
//void should_not_transfer_money_between_accounts_if_exceeding_maximum_debit_of_1000()
//void should_not_transfer_money_between_accounts_if_amount_is_negative()
//void should_return_null_name_for_new_account()
//void should_return_name_of_account()
//void should_contains_account_balance()

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

//    @DisplayName("test no1, getName method")
//
//    @Test
//    void getName() {
//        //arrange
//        final Account account = new Account();
//        //act
//        account.setName("premium");
//        //assert
//        assertEquals("premium", account.getName());
////        assertEquals("free", account.getName());
//
//
//    }

    //Potrzebuję zadeklarować pole
    Account account1;

    //inicjalizuję przed każdym Testem
    @BeforeEach()
    void beforEachMethod() {
        account1 = new Account();
    }

    @Test
    void should_return_zero_balance_for_new_account(){
        //Given
        int accountBalance = account1.getBalance();
        //When
        int expectedBalance = 0;
        //Then
        assertEquals(expectedBalance, accountBalance, "expected balance " + expectedBalance);
    }

    @Test
    void should_return_balance_of_100_after_deposit_of_100(){
        //Given
        account1.deposit(100);
        int accountBalanceAfterDeposit = account1.getBalance();
        //When
        int expectedBalance = 100;
        //Then
        assertEquals(expectedBalance, accountBalanceAfterDeposit);
    }


    @Test
    void should_return_balance_minus_withdraw(){
        //Given
        account1.withdraw(100);
        //When
        int expectedBalance = -100;
        //Then
        assertEquals(expectedBalance, account1.getBalance());
    }

    @Test
    void should_not_transfer_money_between_accounts_if_exceeding_maximum_debit_of_1000(){
        //Given
        Account account2 = new Account();
        //When
        account1.transfer(account2,1001);
        //Then
        assertEquals(0, account1.getBalance());
        assertEquals(0,account2.getBalance());
    }




}