package com.example.patronesdedisenio.Proxy;

public class ProxySoporteTecnico implements SoporteTecnico {

    private String categoriaCliente;


    public ProxySoporteTecnico(String categoriaCliente){
        this.categoriaCliente = categoriaCliente;
    }

    @Override
    public String obtenerSoporte(){
        if(this.categoriaCliente.equals("VIP")){
            SoporteTecnicoPremium soporteTecnicoPremium = new SoporteTecnicoPremium();
            return soporteTecnicoPremium.obtenerSoporte();
            }else{
            SoporteTecnicoRegular soporteTecnicoRegular = new SoporteTecnicoRegular();
            return soporteTecnicoRegular.obtenerSoporte();

        }
    }


}
