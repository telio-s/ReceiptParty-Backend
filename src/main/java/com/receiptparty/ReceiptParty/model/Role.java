package com.receiptparty.ReceiptParty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class Role {
    private String id;
    private String name;
}
