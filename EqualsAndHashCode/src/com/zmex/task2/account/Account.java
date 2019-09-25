package com.zmex.task2.account;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
@RequiredArgsConstructor
public class Account {
    private @NonNull String accountType;
    private @NonNull String accountName;
    private @NonNull String accountOwner;

}
