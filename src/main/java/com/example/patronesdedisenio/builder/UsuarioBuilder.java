package com.example.patronesdedisenio.builder;


public class UsuarioBuilder {


    private Usuario usuario;

    public UsuarioBuilder(){
        this.usuario = new Usuario();
    }

    public UsuarioBuilder(Usuario usuario){
        this.usuario = usuario;
    }

    public UsuarioBuilder setNombre(String nombre){
        this.usuario.setNombre(nombre);
        return this;
    }

    public UsuarioBuilder setApellido(String apellido){
        this.usuario.setApellido(apellido);
        return this;
    }

    public  UsuarioBuilder setRole(String role){
        Role elRole;
        switch (role) {
            case "admin":
                elRole = new Role("admin", "puede hacer todo");
                break;
            case "cliente":
                elRole = new Role(role, "puede comprar");
                break;
            default:
                elRole = new Role("invitado", "puede mirar");
                break;
        }
        this.usuario.setRole(elRole);
        return this;

    }

    public Usuario build(){
        return this.usuario;
    }
}
