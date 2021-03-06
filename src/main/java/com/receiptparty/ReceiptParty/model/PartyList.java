package com.receiptparty.ReceiptParty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document
@AllArgsConstructor
public class PartyList {
    @Id
    private String id;
    private String name;
    private String place;
    private Double totalPrice;
    private int participant;
    private LocalDate date;
    private List<Participant> participantList;
}
