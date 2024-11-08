package com.mybank.bill.controller.dto;

import com.mybank.bill.entity.Bill;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@AllArgsConstructor
@Getter
public class BillResponseDTO {

    private Long billId;
    private  Long accountId;
    private BigDecimal amount;
    private Boolean isDefault;
    private OffsetDateTime creationDate;
    private Boolean overdraftEnabled;

    public BillResponseDTO(Bill bill) {
        //mapping
        billId = bill.getBillId();
        accountId = bill.getBillId();
        amount = bill.getAmount();
        isDefault = bill.getIsDefault();
        creationDate = bill.getCreationDate();
        overdraftEnabled = bill.getOverdraftEnabled();
    }

}
