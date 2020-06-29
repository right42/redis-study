package com.study.redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("accounts")
@NoArgsConstructor
@AllArgsConstructor
@Builder @Getter
public class Account {

    @Id
    private String id;

    private String username;

    private String password;

}
