package com.mybank.account.controller.dto;

import com.mybank.account.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class AccountResponseDTO {

    private Long accountId;
    private String name;
    private String email;
    private String phone;
    private List<Long> bills;
    private OffsetDateTime creationDate;

    public AccountResponseDTO(Account account) {
        //map all fields
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
        phone = account.getPhone();
        bills = account.getBills();
        creationDate = account.getCreationDate();
    }


}
