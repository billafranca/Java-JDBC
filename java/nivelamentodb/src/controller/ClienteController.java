package controller;

public class ClienteController{
    private int idNome;
    private String nome;
    private String email;
    

    public int getId(){
        return idNome;
    }
    public void setID(){
        this.idNome = idNome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }

    

}