package com.miar.tuto.dto;

import lombok.Data;

@Data
public class Message {
  String textToCrypt, key, crypted; 
}