package com.example.patronesdedisenio.Proxy;

public class SoporteTecnicoRegular implements SoporteTecnico{

    @Override
    public String obtenerSoporte(){
        return "Este soporte es el regular, no hay premiums aqui";
    }



}
