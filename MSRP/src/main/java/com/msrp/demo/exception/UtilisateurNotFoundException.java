package com.msrp.demo.exception;

public class UtilisateurNotFoundException extends RuntimeException{

    public UtilisateurNotFoundException(Integer id) {
        super("Could not find utilisateur " + id);
    }
}
