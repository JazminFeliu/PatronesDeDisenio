package com.example.patronesdedisenio.builder;

import com.example.patronesdedisenio.builder.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private String apellido;
    private Role role;

    public String informarLoQuePuedHacer(){
        return this.nombre+" "+role.getPermiso();
    }


}
