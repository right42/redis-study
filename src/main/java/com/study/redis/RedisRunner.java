package com.study.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.Optional;

@RequiredArgsConstructor
public class RedisRunner implements ApplicationRunner {

    private final AccountRepository accountRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = Account.builder()
                            .username("test")
                            .password("1234")
                            .build();

        accountRepository.save(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        Account findAccount = byId.get();

        System.out.println(findAccount.getUsername());
        System.out.println(findAccount.getPassword());

    }
}

